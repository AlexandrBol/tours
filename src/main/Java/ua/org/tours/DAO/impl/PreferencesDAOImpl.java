package ua.org.tours.DAO.impl;

import ua.org.tours.model.Preferences;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.INSERT_PREFERENCES;
import static ua.org.tours.DAO.impl.SQLs.UPDATE_PREFERENCES;

public class PreferencesDAOImpl extends CrudDAO<Preferences>{
    public PreferencesDAOImpl() {
        super(Preferences.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Preferences entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PREFERENCES);
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setInt(2, entity.getId());
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Preferences entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PREFERENCES, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getId());
        preparedStatement.setString(2, entity.getName());
        return preparedStatement;
    }

    //`id`, `name`

    @Override
    protected List<Preferences> readAll(ResultSet resultSet) throws SQLException {
        List<Preferences> result = new LinkedList<>();
        Preferences preferences = null;
        while (resultSet.next()) {
            preferences = new Preferences();
            preferences.setId(resultSet.getInt("id"));
            preferences.setName(resultSet.getString("name"));
            result.add(preferences);
        }
        return result;
    }
}
