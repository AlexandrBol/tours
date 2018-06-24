package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.SailedTour;
import ua.org.tours.service.api.Service;

import java.util.List;

public class SailedTourServiceImpl implements Service<Integer, SailedTour> {

    private static SailedTourServiceImpl service;
    private DAO<Integer, SailedTour> sailedTourDAO;
    private BeanMapper beanMapper;

    private SailedTourServiceImpl() {
        sailedTourDAO = DAOFactory.getInstance().getSailedTourDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized SailedTourServiceImpl getInstance() {
        if (service == null) {
            service = new SailedTourServiceImpl();
        }
        return service;
    }

    @Override
    public List<SailedTour> getAll() {
        List<SailedTour> sailedTours = sailedTourDAO.getAll();
        List<SailedTour> sailedTours1 = beanMapper.listMapToList(sailedTours, SailedTour.class);
        return sailedTours1;
    }

    @Override
    public SailedTour getById(Integer id) {
        SailedTour sailedTour = sailedTourDAO.getById(id);
        SailedTour sailedTour1 = beanMapper.singleMapper(sailedTour, SailedTour.class);
        return sailedTour1;
    }

    @Override
    public void save(SailedTour sailedTour) {
        sailedTour = beanMapper.singleMapper(sailedTour, SailedTour.class);
        sailedTourDAO.save(sailedTour);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(SailedTour sailedTour) {
        sailedTour = beanMapper.singleMapper(sailedTour, SailedTour.class);
        sailedTourDAO.save(sailedTour);
    }
}
