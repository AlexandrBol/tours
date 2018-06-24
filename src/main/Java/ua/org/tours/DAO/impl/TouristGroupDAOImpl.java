package ua.org.tours.DAO.impl;

import ua.org.tours.model.TouristGroup;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.UPDATE_TOURIST_GROUP;
import static ua.org.tours.DAO.impl.SQLs.INSERT_TOURIST_GROUP;


public class TouristGroupDAOImpl extends CrudDAO<TouristGroup> {

    public TouristGroupDAOImpl() {
        super(TouristGroup.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, TouristGroup entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TOURIST_GROUP);
        preparedStatement.setInt(1, entity.getTouristNumber());
        preparedStatement.setInt(2, entity.getId());
        return preparedStatement;
    }


    @Override
    protected PreparedStatement createInsertStatement(Connection connection, TouristGroup entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TOURIST_GROUP, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getTouristNumber());
        return preparedStatement;
    }

    @Override
    protected List<TouristGroup> readAll(ResultSet resultSet) throws SQLException {
        List<TouristGroup> result = new LinkedList<>();
        TouristGroup touristGroup = null;
        while (resultSet.next()) {
            touristGroup = new TouristGroup();
            touristGroup.setId(resultSet.getInt("id"));
            touristGroup.setTouristNumber(resultSet.getInt("tourist_number"));
            result.add(touristGroup);
        }
        return result;
    }
}
