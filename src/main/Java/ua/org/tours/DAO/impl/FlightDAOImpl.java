package ua.org.tours.DAO.impl;

import ua.org.tours.model.Flight;

import java.sql.*;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

import static ua.org.tours.DAO.impl.SQLs.UPDATE_FLIGHT;
import static ua.org.tours.DAO.impl.SQLs.INSERT_FLIGHT;

public class FlightDAOImpl extends CrudDAO<Flight> {

    public FlightDAOImpl() {
        super(Flight.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Flight entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_FLIGHT);
        preparedStatement.setInt(1, entity.getTransferId());
        preparedStatement.setDouble(2, entity.getPrice());
        preparedStatement.setString(3, entity.getArrivalPoint());
        preparedStatement.setString(4, entity.getDestinationPoint());
        preparedStatement.setTime(5, entity.getFlightTime());
        //TODO THIS CAN NOT WORK
        preparedStatement.setDate(6, Date.valueOf(String.valueOf(entity.getArrivalTime())));
        preparedStatement.setInt(7, entity.getId());
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Flight entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FLIGHT, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getTransferId());
        preparedStatement.setDouble(2, entity.getPrice());
        preparedStatement.setString(3, entity.getArrivalPoint());
        preparedStatement.setString(4, entity.getDestinationPoint());
        preparedStatement.setTime(5, entity.getFlightTime());
        //TODO THIS CAN NOT WORK
        // preparedStatement.set(6, Date.valueOf(String.valueOf(entity.getArrivalTime())));
        return preparedStatement;
    }

    //`transfer_id`, `price`, `arrival_point`, `destination_point`, `flight_time`, `arrival_time`
    @Override
    protected List<Flight> readAll(ResultSet resultSet) throws SQLException {
        List<Flight> result = new LinkedList<>();
        Flight flight = null;
        while (resultSet.next()) {
        }
        flight = new Flight();
        flight.setId(resultSet.getInt("id"));
        flight.setTransferId(resultSet.getInt("transfer_id"));
        flight.setPrice(resultSet.getInt("price"));
        flight.setArrivalPoint(resultSet.getString("arrival_point"));
        flight.setDestinationPoint(resultSet.getString("destination_point"));
        flight.setFlightTime(resultSet.getTime("flight_time"));
        // flight.setArrivalTime(resultSet.().toL);
        result.add(flight);
        return result;
    }
}
