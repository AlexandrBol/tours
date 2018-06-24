package ua.org.tours.DAO.impl;

import ua.org.tours.model.Tourist;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.INSERT_TOURIST;
import static ua.org.tours.DAO.impl.SQLs.UPDATE_TOURIST;

public class TouristDAOImpl extends CrudDAO<Tourist> {

    public TouristDAOImpl() {
        super(Tourist.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Tourist entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TOURIST);
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getSurname());
        preparedStatement.setString(3, entity.getPhone());
        preparedStatement.setString(4, entity.getEmail());
        preparedStatement.setInt(5, entity.getId());
        preparedStatement.setInt(6, entity.getGroup_id());

        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Tourist entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TOURIST, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getSurname());
        preparedStatement.setString(3, entity.getPhone());
        preparedStatement.setString(4, entity.getEmail());
        preparedStatement.setInt(5, entity.getId());
        preparedStatement.setInt(6, entity.getGroup_id());
        return preparedStatement;
    }

    //`name`, `surname`, `phone`, `email`, `group_id`
    @Override
    protected List readAll(ResultSet resultSet) throws SQLException {
        List<Tourist> result = new LinkedList<>();
        Tourist tourist = null;
        while (resultSet.next()) {
            tourist = new Tourist();
            tourist.setId(resultSet.getInt("id"));
            tourist.setName(resultSet.getString("name"));
            tourist.setSurname(resultSet.getString("surname"));
            tourist.setPhone(resultSet.getString("phone"));
            tourist.setEmail(resultSet.getString("email"));
            tourist.setGroup_id(resultSet.getInt("group_id"));
            result.add(tourist);
        }
        return result;
    }
}
