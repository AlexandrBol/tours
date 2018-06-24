package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.TouristGroup;
import ua.org.tours.service.api.Service;

import java.util.List;

public class TouristsGroupServiceImpl implements Service<Integer, TouristGroup> {

    private static TouristsGroupServiceImpl service;
    private DAO<Integer, TouristGroup> touristGroupDAO;
    private BeanMapper beanMapper;

    private TouristsGroupServiceImpl() {
        touristGroupDAO = DAOFactory.getInstance().getTouristGroupDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized TouristsGroupServiceImpl getInstance() {
        if (service == null) {
            service = new TouristsGroupServiceImpl();
        }
        return service;
    }

    @Override
    public List<TouristGroup> getAll() {
        List<TouristGroup> touristGroups = touristGroupDAO.getAll();
        List<TouristGroup> touristGroups1 = beanMapper.listMapToList(touristGroups, TouristGroup.class);
        return touristGroups1;
    }

    @Override
    public TouristGroup getById(Integer id) {
        TouristGroup touristGroup = touristGroupDAO.getById(id);
        TouristGroup touristGroup1 = beanMapper.singleMapper(touristGroup, TouristGroup.class);
        return touristGroup1;
    }

    @Override
    public void save(TouristGroup touristGroup) {
        touristGroup = beanMapper.singleMapper(touristGroup, TouristGroup.class);
        touristGroupDAO.save(touristGroup);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(TouristGroup touristGroup) {
        touristGroup = beanMapper.singleMapper(touristGroup, TouristGroup.class);
        touristGroupDAO.save(touristGroup);
    }
}

