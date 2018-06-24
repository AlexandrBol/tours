package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.Hotel;
import ua.org.tours.service.api.Service;

import java.util.List;

public class HotelServiceImpl implements Service<Integer, Hotel> {

    private static HotelServiceImpl service;
    private DAO<Integer, Hotel> hotelDAO;
    private BeanMapper beanMapper;

    private HotelServiceImpl() {
        hotelDAO = DAOFactory.getInstance().getHotelDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized HotelServiceImpl getInstance() {
        if (service == null) {
            service = new HotelServiceImpl();
        }
        return service;
    }

    @Override
    public List<Hotel> getAll() {
        List<Hotel> hotels = hotelDAO.getAll();
        List<Hotel> hotels1 = beanMapper.listMapToList(hotels, Hotel.class);
        return hotels1;
    }

    @Override
    public Hotel getById(Integer id) {
        Hotel hotel = hotelDAO.getById(id);
        Hotel hotel1 = beanMapper.singleMapper(hotel, Hotel.class);
        return hotel1;
    }

    @Override
    public void save(Hotel hotel) {
        hotel = beanMapper.singleMapper(hotel, Hotel.class);
        hotelDAO.save(hotel);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(Hotel hotel) {
        hotel = beanMapper.singleMapper(hotel, Hotel.class);
        hotelDAO.save(hotel);
    }
}
