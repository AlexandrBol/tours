package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.TouristsToGroup;
import ua.org.tours.service.api.Service;

import java.util.List;

public class TouristsToGroupServiceImpl implements Service<Integer, TouristsToGroup> {

    private static TouristsToGroupServiceImpl service;
    private DAO<Integer, TouristsToGroup> touristsToGroupDAO;
    private BeanMapper beanMapper;

    private TouristsToGroupServiceImpl() {
        touristsToGroupDAO = DAOFactory.getInstance().getTouristsToGroupDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized TouristsToGroupServiceImpl getInstance() {
        if (service == null) {
            service = new TouristsToGroupServiceImpl();
        }
        return service;
    }

    @Override
    public List<TouristsToGroup> getAll() {
        List<TouristsToGroup> touristsToGroups = touristsToGroupDAO.getAll();
        List<TouristsToGroup> touristsToGroups1 = beanMapper.listMapToList(touristsToGroups, TouristsToGroup.class);
        return touristsToGroups1;
    }

    @Override
    public TouristsToGroup getById(Integer id) {
        TouristsToGroup touristsToGroup = touristsToGroupDAO.getById(id);
        TouristsToGroup touristsToGroup1 = beanMapper.singleMapper(touristsToGroup, TouristsToGroup.class);
        return touristsToGroup1;
    }

    @Override
    public void save(TouristsToGroup touristsToGroup) {
        touristsToGroup = beanMapper.singleMapper(touristsToGroup, TouristsToGroup.class);
        touristsToGroupDAO.save(touristsToGroup);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(TouristsToGroup touristsToGroup) {
        touristsToGroup = beanMapper.singleMapper(touristsToGroup, TouristsToGroup.class);
        touristsToGroupDAO.save(touristsToGroup);
    }
}
