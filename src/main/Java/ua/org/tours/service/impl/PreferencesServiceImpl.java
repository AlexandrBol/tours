package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.Preferences;
import ua.org.tours.service.api.Service;

import java.util.List;

public class PreferencesServiceImpl implements Service<Integer, Preferences> {

    private static PreferencesServiceImpl service;
    private DAO<Integer, Preferences> preferencesDAO;
    private BeanMapper beanMapper;

    private PreferencesServiceImpl() {
        preferencesDAO = DAOFactory.getInstance().getPreferencesDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized PreferencesServiceImpl getInstance() {
        if (service == null) {
            service = new PreferencesServiceImpl();
        }
        return service;
    }

    @Override
    public List<Preferences> getAll() {
        List<Preferences> preferences = preferencesDAO.getAll();
        List<Preferences> preferences1 = beanMapper.listMapToList(preferences, Preferences.class);
        return preferences1;
    }

    @Override
    public Preferences getById(Integer id) {
        Preferences preferences = preferencesDAO.getById(id);
        Preferences preferences1 = beanMapper.singleMapper(preferences, Preferences.class);
        return preferences1;
    }

    @Override
    public void save(Preferences preferences) {
        preferences = beanMapper.singleMapper(preferences, Preferences.class);
        preferencesDAO.save(preferences);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(Preferences preferences) {
        preferences = beanMapper.singleMapper(preferences, Preferences.class);
        preferencesDAO.save(preferences);
    }
}

