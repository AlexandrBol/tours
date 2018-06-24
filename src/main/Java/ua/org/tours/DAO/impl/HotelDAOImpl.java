package ua.org.tours.DAO.impl;

import ua.org.tours.model.Hotel;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ua.org.tours.DAO.impl.SQLs.UPDATE_HOTEL;
import static ua.org.tours.DAO.impl.SQLs.INSERT_HOTEL;


public class HotelDAOImpl extends CrudDAO<Hotel> {

    private static HotelDAOImpl crudDAO;

    public HotelDAOImpl() {
        super(Hotel.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Hotel entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_HOTEL);
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getAdress());
        preparedStatement.setInt(3, entity.getStars());
        preparedStatement.setString(4, entity.getDescription());
        preparedStatement.setDouble(5, entity.getPrice());
        preparedStatement.setInt(6, entity.getId());
        return preparedStatement;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Hotel entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_HOTEL, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, entity.getName());
        preparedStatement.setString(2, entity.getAdress());
        preparedStatement.setInt(3, entity.getStars());
        preparedStatement.setString(4, entity.getDescription());
        preparedStatement.setDouble(5, entity.getPrice());
        return preparedStatement;
    }

    //`name`, `adress`, `stars`, `description`, `price`
    @Override
    protected List<Hotel> readAll(ResultSet resultSet) throws SQLException {
        List<Hotel> result = new LinkedList<>();
        Hotel hotel = null;
        while (resultSet.next()) {
            hotel = new Hotel();
            hotel.setId(resultSet.getInt("id"));
            hotel.setName(resultSet.getString("name"));
            hotel.setAdress(resultSet.getString("adress"));
            hotel.setStars(resultSet.getInt("stars"));
            hotel.setDescription(resultSet.getString("description"));
            hotel.setPrice(resultSet.getDouble("price"));
            result.add(hotel);
        }
        return result;
    }
}
