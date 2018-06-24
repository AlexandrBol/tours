package ua.org.tours.DAO.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.model.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.UPDATE_USER;
import static ua.org.tours.DAO.impl.SQLs.INSERT_USER;

public class UserDAOImpl extends CrudDAO<User> {

    public UserDAOImpl() {
        super(User.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, User entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setDate(2, (Date) entity.getDOB());
        preparedStatement.setString(3, entity.getPhone());
        preparedStatement.setString(4, entity.getEmail());
        preparedStatement.setInt(5, entity.getPreferences().getId());
        preparedStatement.setString(6, entity.getPassword());
        preparedStatement.setInt(7, entity.getId());
        return preparedStatement;
    }

    //возможно сюда надо добавить ид но это не  точно

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, User entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setDate(2, (Date) entity.getDOB());
        preparedStatement.setString(3, entity.getPhone());
        preparedStatement.setString(4, entity.getEmail());
        preparedStatement.setInt(5, entity.getPreferences().getId());
        preparedStatement.setString(6, entity.getPassword());
        return preparedStatement;
    }

    //`name`, `DOB`, `phone`, `email`, `preferences`, `password`
    @Override
    protected List<User> readAll(ResultSet resultSet) throws SQLException {
        List<User> result = new LinkedList<>();
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setDOB(resultSet.getDate("DOB"));
            user.setPhone(resultSet.getString("phone"));
            user.setEmail(resultSet.getString("email"));
            user.setPreferences(DAOFactory.getInstance().getPreferencesDAO().getById(resultSet.getInt("preferences")));
            user.setPassword(resultSet.getString("password"));
            result.add(user);
        }
        return result;
    }

}
