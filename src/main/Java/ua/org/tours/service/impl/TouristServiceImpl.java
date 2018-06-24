package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.Tour;
import ua.org.tours.model.Tourist;
import ua.org.tours.service.api.Service;

import java.util.List;

public class TouristServiceImpl implements Service<Integer, Tourist> {

    private static TouristServiceImpl service;
    private DAO<Integer, Tourist> touristDAO;
    private BeanMapper beanMapper;

    private TouristServiceImpl() {
        touristDAO = DAOFactory.getInstance().getTouristDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized TouristServiceImpl getInstance() {
        if (service == null) {
            service = new TouristServiceImpl();
        }
        return service;
    }

    @Override
    public List<Tourist> getAll() {
        List<Tourist> tourists = touristDAO.getAll();
        List<Tourist> tourists1 = beanMapper.listMapToList(tourists, Tourist.class);
        return tourists1;
    }

    @Override
    public Tourist getById(Integer id) {
        Tourist tourists = touristDAO.getById(id);
        Tourist tourists1 = beanMapper.singleMapper(tourists, Tourist.class);
        return tourists1;
    }

    @Override
    public void save(Tourist tourist) {
        tourist = beanMapper.singleMapper(tourist, Tourist.class);
        touristDAO.save(tourist);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(Tourist tourist) {
        tourist = beanMapper.singleMapper(tourist, Tourist.class);
        touristDAO.save(tourist);
    }
}
