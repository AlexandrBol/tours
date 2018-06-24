package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.FlightsToTransfer;
import ua.org.tours.service.api.Service;

import java.util.List;

public class FlightsToTransferServiceImpl implements Service<Integer, FlightsToTransfer> {

    private static FlightsToTransferServiceImpl service;
    private DAO<Integer, FlightsToTransfer> flightsToTransferDAO;
    private BeanMapper beanMapper;

    private FlightsToTransferServiceImpl() {
        flightsToTransferDAO = DAOFactory.getInstance().getFlightsToTransferDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized FlightsToTransferServiceImpl getInstance() {
        if (service == null) {
            service = new FlightsToTransferServiceImpl();
        }
        return service;
    }

    @Override
    public List<FlightsToTransfer> getAll() {
        List<FlightsToTransfer> flightsToTransfers = flightsToTransferDAO.getAll();
        List<FlightsToTransfer> flightsToTransfers1 = beanMapper.listMapToList(flightsToTransfers, FlightsToTransfer.class);
        return flightsToTransfers1;
    }

    @Override
    public FlightsToTransfer getById(Integer id) {
        FlightsToTransfer flightsToTransfer = flightsToTransferDAO.getById(id);
        FlightsToTransfer flightsToTransfer1 = beanMapper.singleMapper(flightsToTransfer, FlightsToTransfer.class);
        return flightsToTransfer1;
    }

    @Override
    public void save(FlightsToTransfer flightsToTransfer) {
        flightsToTransfer = beanMapper.singleMapper(flightsToTransfer, FlightsToTransfer.class);
        flightsToTransferDAO.save(flightsToTransfer);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(FlightsToTransfer flightsToTransfer) {
        flightsToTransfer = beanMapper.singleMapper(flightsToTransfer, FlightsToTransfer.class);
        flightsToTransferDAO.save(flightsToTransfer);
    }
}
