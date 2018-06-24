package ua.org.tours.DAO.impl;

import ua.org.tours.model.Tour;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;


import static ua.org.tours.DAO.impl.SQLs.INSERT_TOUR;
import static ua.org.tours.DAO.impl.SQLs.UPDATE_TOUR;

public class TourDAOImpl extends CrudDAO<Tour> {

    public TourDAOImpl() {
        super(Tour.class);
    }

    @Override
    protected PreparedStatement createUpdateStatement(Connection connection, Tour entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TOUR);
        preparedStatement.setInt(1, entity.getNumberOfPerson());
        preparedStatement.setInt(2, entity.getNumberKids());
        preparedStatement.setInt(3, entity.getHotelId());
        preparedStatement.setDate(4, (Date) entity.getStartDate());
        preparedStatement.setDate(5, (Date) entity.getEndDate());
        preparedStatement.setInt(6, entity.getTransferId());
        preparedStatement.setDouble(7, entity.getPrice());
        preparedStatement.setInt(8, entity.getId());
        return null;
    }

    @Override
    protected PreparedStatement createInsertStatement(Connection connection, Tour entity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TOUR, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, entity.getNumberOfPerson());
        preparedStatement.setInt(2, entity.getNumberKids());
        preparedStatement.setInt(3, entity.getHotelId());
        preparedStatement.setDate(4, (Date) entity.getStartDate());
        preparedStatement.setDate(5, (Date) entity.getEndDate());
        preparedStatement.setInt(6, entity.getTransferId());
        preparedStatement.setDouble(7, entity.getPrice());
        return preparedStatement;
    }

    //`number_of_person`, `number_kids`, `hotel_id`, `start_date`, `end_date`, `transfer_id`, `price`

    @Override
    protected List<Tour> readAll(ResultSet resultSet) throws SQLException {
        List<Tour> result = new LinkedList<>();
        Tour tour = null;
        while (resultSet.next()) {
            tour = new Tour();
            tour.setId(resultSet.getInt("id"));
            tour.setNumberOfPerson(resultSet.getInt("number_of_person"));
            tour.setNumberKids(resultSet.getInt("number_kids"));
            tour.setHotelId(resultSet.getInt("hotel_id"));
            tour.setStartDate(resultSet.getDate("start_date"));
            tour.setEndDate(resultSet.getDate("end_date"));
            tour.setTransferId(resultSet.getInt("transfer_id"));
            tour.setPrice(resultSet.getDouble("price"));
            result.add(tour);
        }
        return result;
    }
}
