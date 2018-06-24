package ua.org.tours.DAO.impl;

import ua.org.tours.model.SailedTour;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;


import static ua.org.tours.DAO.impl.SQLs.UPDATE_SAILED_TOUR;
import static ua.org.tours.DAO.impl.SQLs.INSERT_SAILED_TOUR;


public class SailedToursDAOImpl extends CrudDAO<SailedTour> {

    public SailedToursDAOImpl() {
        super(SailedTour.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, SailedTour entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SAILED_TOUR);
        preparedStatement.setInt(1, entity.getBillId());
        preparedStatement.setInt(2, entity.getTouristsNumber());
        preparedStatement.setInt(3, entity.getTouristsGroup());
        preparedStatement.setDouble(4, entity.getPrice());
        preparedStatement.setInt(5, entity.getId());
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, SailedTour entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SAILED_TOUR, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getBillId());
        preparedStatement.setInt(2, entity.getTouristsNumber());
        preparedStatement.setInt(3, entity.getTouristsGroup());
        preparedStatement.setDouble(4, entity.getPrice());
        return preparedStatement;
    }

    //`bill_id`, `tourists_number`, `tourists_group`, `price`
    @Override
    protected List<SailedTour> readAll(ResultSet resultSet) throws SQLException {
        List<SailedTour> result = new LinkedList<>();
        SailedTour sailedTour = null;
        while (resultSet.next()) {
            sailedTour = new SailedTour();
            sailedTour.setId(resultSet.getInt("id"));
            sailedTour.setBillId(resultSet.getInt("bill_id"));
            sailedTour.setTouristsNumber(resultSet.getInt("tourist_number"));
            sailedTour.setTouristsGroup(resultSet.getInt("tourists_group"));
            sailedTour.setPrice(resultSet.getDouble("price"));
            result.add(sailedTour);
        }
        return result;
    }
}
