package ua.org.tours.DAO.impl;


import ua.org.tours.model.FlightsToTransfer;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.INSERT_FLIGHTS_TO_TRANSFER;
import static ua.org.tours.DAO.impl.SQLs.UPDATE_FLIGHTS_TO_TRANSFER;

public class FlightsToTransferDAOImpl extends CrudDAO<FlightsToTransfer> {

    public FlightsToTransferDAOImpl() {
        super(FlightsToTransfer.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, FlightsToTransfer entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_FLIGHTS_TO_TRANSFER);
        preparedStatement.setInt(1, entity.getTranferId());
        preparedStatement.setInt(2, entity.getTranferId());
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, FlightsToTransfer entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FLIGHTS_TO_TRANSFER, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getTranferId());
        preparedStatement.setInt(2, entity.getFlightId());
        return preparedStatement;
    }

    //(`transfer_id`, `flight_id`)

    @Override
    protected List<FlightsToTransfer> readAll(ResultSet resultSet) throws SQLException {
        List<FlightsToTransfer> result = new LinkedList<>();
        FlightsToTransfer flightsToTransfer = null;
        while (resultSet.next()) {
            flightsToTransfer = new FlightsToTransfer();
            flightsToTransfer.setTranferId(resultSet.getInt("transfer_id"));
            flightsToTransfer.setFlightId(resultSet.getInt("flight_id"));
            result.add(flightsToTransfer);
        }
        return result;
    }
}
