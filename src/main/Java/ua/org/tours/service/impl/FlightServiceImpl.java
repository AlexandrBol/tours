package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.Flight;
import ua.org.tours.service.api.Service;

import java.util.List;

public class FlightServiceImpl implements Service<Integer, Flight> {

    private static FlightServiceImpl service;
    private DAO<Integer, Flight> flightDAO;
    private BeanMapper beanMapper;

    private FlightServiceImpl() {
        flightDAO = DAOFactory.getInstance().getFlightDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized FlightServiceImpl getInstance() {
        if (service == null) {
            service = new FlightServiceImpl();
        }
        return service;
    }

    @Override
    public List<Flight> getAll() {
        List<Flight> flights = flightDAO.getAll();
        List<Flight> flights1 = beanMapper.listMapToList(flights, Flight.class);
        return flights1;
    }

    @Override
    public Flight getById(Integer id) {
        Flight flight = flightDAO.getById(id);
        Flight flight1 = beanMapper.singleMapper(flight, Flight.class);
        return flight1;
    }

    @Override
    public void save(Flight flight) {
        flight = beanMapper.singleMapper(flight, Flight.class);
        flightDAO.save(flight);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(Flight flight) {
        flight = beanMapper.singleMapper(flight, Flight.class);
        flightDAO.save(flight);
    }
}

