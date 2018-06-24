package ua.org.tours.DAO.impl;


import ua.org.tours.model.Bill;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.INSERT_BILL;
import static ua.org.tours.DAO.impl.SQLs.UPDATE_BILL;

public class BillDAOimpl extends CrudDAO<Bill> {

    public BillDAOimpl() {
        super(Bill.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Bill entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BILL);
        preparedStatement.setInt(1, entity.getId());
        preparedStatement.setInt(2, entity.getUserId());
        preparedStatement.setInt(3, entity.getTourId());
        preparedStatement.setDouble(4, entity.getTotalPrice());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Bill entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BILL, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(5, entity.getUserId());
        preparedStatement.setInt(5, entity.getTourId());
        preparedStatement.setDouble(3, entity.getTotalPrice());

        return preparedStatement;
    }

    //`user_id`, `tour_id`, `total_price`
    @Override
    protected List<Bill> readAll(ResultSet resultSet) throws SQLException {
        List<Bill> result = new LinkedList<>();
        Bill bill = null;
        while (resultSet.next()) {
            bill = new Bill();
            bill.setId(resultSet.getInt("id"));
            bill.setUserId(resultSet.getInt("user_id"));
            bill.setTourId(resultSet.getInt("tour_id"));
            bill.setTotalPrice(resultSet.getDouble("total_price"));
            result.add(bill);
        }
        return result;
    }

}
