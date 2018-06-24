package ua.org.tours.DAO.impl;

//TODO CONSTRUCTORS CHECK

import ua.org.tours.model.Transfer;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;


import static ua.org.tours.DAO.impl.SQLs.UPDATE_TRANSFER;
import static ua.org.tours.DAO.impl.SQLs.INSERT_TRANSFER;

public class TransferDAOImpl extends CrudDAO<Transfer> {


    public TransferDAOImpl() {
        super(Transfer.class);
    }


    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Transfer entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TRANSFER);
        preparedStatement.setInt(1, entity.getFlightNumber());
        preparedStatement.setInt(2, entity.getId());
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Transfer entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TRANSFER, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getFlightNumber());
        return preparedStatement;
    }

    //(`flight_number`)
    @Override
    protected List<Transfer> readAll(ResultSet resultSet) throws SQLException {
        List<Transfer> result = new LinkedList<>();
        Transfer transfer = null;
        while (resultSet.next()) {
            transfer = new Transfer();
            transfer.setId(resultSet.getInt("id"));
            transfer.setFlightNumber(resultSet.getInt("flight_number"));
            result.add(transfer);
        }
        return result;
    }
}
