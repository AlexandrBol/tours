package ua.org.tours.DAO.impl;

import ua.org.tours.model.TouristsToGroup;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.UPDATE_TOURISTS_TO_GROUP;
import static ua.org.tours.DAO.impl.SQLs.INSERT_TOURISTS_TO_GROUP;

public class TouristsToGroupDAOImpl extends CrudDAO<TouristsToGroup> {

    public TouristsToGroupDAOImpl() {
        super(TouristsToGroup.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, TouristsToGroup entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TOURISTS_TO_GROUP);
        preparedStatement.setInt(1, entity.getUserId());
        preparedStatement.setInt(2, entity.getGroupId());
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, TouristsToGroup entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TOURISTS_TO_GROUP, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getGroupId());
        preparedStatement.setInt(2, entity.getUserId());
        return preparedStatement;
    }

    //(`group_id`, `user_id`)

    @Override
    protected List<TouristsToGroup> readAll(ResultSet resultSet) throws SQLException {
        List<TouristsToGroup> result = new LinkedList<>();
        TouristsToGroup touristsToGroup = null;
        while (resultSet.next()) {
            touristsToGroup = new TouristsToGroup();
            touristsToGroup.setGroupId(resultSet.getInt("group_id"));
            touristsToGroup.setUserId(resultSet.getInt("user_id"));
            result.add(touristsToGroup);
        }
        return result;
    }

}
