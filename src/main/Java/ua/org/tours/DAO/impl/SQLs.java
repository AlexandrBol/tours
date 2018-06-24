package ua.org.tours.DAO.impl;

//TODO check work with  skobochki ````

//TODO null instead of id in inserts statement

public class SQLs {
    public static final String SELECT_ALL = "Select * from `%s`";
    public static final String FIND_BY_ID = "Select * from `%s` where id = ?";
    public static final String FIND_BY = "Select * from `%s` where `%s` = ?";
    public static final String DELETE_BY_ID = "DELETE FROM `%s` WHERE `id` = ?";

    public static final String INSERT_BILL = "INSERT INTO `bill`(`user_id`, `tour_id`, `total_price`) VALUES (?,?,?)";
    public static final String UPDATE_BILL = "UPDATE `bill` SET `user_id` = ?,`tour_id` = ?,`total_price` = ? WHERE `id` = ?";

    public static final String INSERT_FLIGHT = "INSERT INTO `flight`(`transfer_id`, `price`, `arrival_point`, `destination_point`, `flight_time`, `arrival_time`) VALUES (?,?,?,?,?,?)";
    public static final String UPDATE_FLIGHT = "UPDATE `flight` SET `transfer_id` = ?,`price` = ?,`arrival_point`=?,`destination_point` = ?,`flight_time` = ?,`arrival_time` = ? WHERE `id`= ?";

    public static final String INSERT_HOTEL = "INSERT INTO `hotel`(`name`, `adress`, `stars`, `description`, `price`) VALUES (?,?,?,?,?)";
    public static final String UPDATE_HOTEL = "UPDATE `hotel` SET `name` = ?,`adress` = ?,`stars` = ?,`description` = ?,`price` = ? WHERE `id`= ?";

    public static final String INSERT_SAILED_TOUR = "INSERT INTO `saled_tours`(`bill_id`, `tourists_number`, `tourists_group`, `price`) VALUES (?,?,?,?)";
    public static final String UPDATE_SAILED_TOUR = "UPDATE `sailed_tours` SET `bill_id` = ?,`tourists_number` = ?,`tourists_group` = ?,`price` = ? WHERE `id` = ?";

    public static final String INSERT_TOUR = "INSERT INTO `tour`(`number_of_person`, `number_kids`, `hotel_id`, `start_date`, `end_date`, `transfer_id`, `price`) VALUES (?,?,?,?,?,?,?)";
    public static final String UPDATE_TOUR = "UPDATE `tour` SET `number_of_person` = ?,`number_kids`= ? ,`hotel_id` = ?,`start_date` = ?,`end_date` = ?,`transfer_id` = ?,`price` = ? WHERE `id` = ?";

    public static final String INSERT_TOURIST = "INSERT INTO `tourist`(`name`, `surname`, `phone`, `email`, `group_id`) VALUES (?,?,?,?,?)";
    public static final String UPDATE_TOURIST = "UPDATE `tourist` SET `name` = ? ,`surname` = ?,`phone` = ?,`email` = ?,`group_id` = ? WHERE `id` = ?";

    public static final String INSERT_USER = "INSERT INTO `user`(`name`, `DOB`, `phone`, `email`, `preferences`, `password`) VALUES (?,?,?,?,?,?)";
    public static final String UPDATE_USER = "UPDATE `user` SET `name` = ?,`DOB` = ?,`phone` = ?,`email` = ?,`preferences` = ?,`password` = ? WHERE  `id` = ?";

    public static final String INSERT_TRANSFER = "INSERT INTO `transfer`(`flight_number`) VALUES (?)";
    public static final String UPDATE_TRANSFER = "UPDATE `transfer` SET `flight_number` = ? WHERE `id` = ?";

    public static final String INSERT_TOURIST_GROUP = "INSERT INTO `tourists_group`(`tourist_number`) VALUES (?)";
    public static final String UPDATE_TOURIST_GROUP = "UPDATE `tourists_group` SET `tourist_number` = ? WHERE `id`=?";

    //Funcion of add flights to transfer
    public static final String INSERT_FLIGHTS_TO_TRANSFER = "INSERT INTO `transfer_flights`(`transfer_id`, `flight_id`) VALUES (?,?)";
    public static final String UPDATE_FLIGHTS_TO_TRANSFER = "UPDATE `transfer_flights` SET `flight_id` = ? WHERE `transfer_id` = ?";

    //Funcion of add tourists to groups
    public static final String INSERT_TOURISTS_TO_GROUP = "INSERT INTO `tourists_to_groups`(`group_id`, `user_id`) VALUES (?,?)";
    public static final String UPDATE_TOURISTS_TO_GROUP = "UPDATE `tourists_to_groups` SET `user_id` = ? WHERE `group_id`= ?";

    public static final String INSERT_PREFERENCES = "INSERT INTO `preferences`(`id`, `name`) VALUES (?,?)";
    public static final String UPDATE_PREFERENCES = "UPDATE `preferences` SET `name`=? WHERE `id`=?";

}
