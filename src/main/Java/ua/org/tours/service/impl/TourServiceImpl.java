package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.Tour;
import ua.org.tours.service.api.Service;

import java.util.List;

public class TourServiceImpl implements Service<Integer, Tour> {

    private static TourServiceImpl service;
    private DAO<Integer, Tour> tourDAO;
    private BeanMapper beanMapper;

    private TourServiceImpl() {
        tourDAO = DAOFactory.getInstance().getTourDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized TourServiceImpl getInstance() {
        if (service == null) {
            service = new TourServiceImpl();
        }
        return service;
    }

    @Override
    public List<Tour> getAll() {
        List<Tour> tours = tourDAO.getAll();
        List<Tour> tours1 = beanMapper.listMapToList(tours, Tour.class);
        return tours1;
    }

    @Override
    public Tour getById(Integer id) {
        Tour tour = tourDAO.getById(id);
        Tour tour1 = beanMapper.singleMapper(tour, Tour.class);
        return tour1;
    }

    @Override
    public void save(Tour tour) {
        tour = beanMapper.singleMapper(tour, Tour.class);
        tourDAO.save(tour);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(Tour tour) {
        tour = beanMapper.singleMapper(tour, Tour.class);
        tourDAO.save(tour);
    }
}

