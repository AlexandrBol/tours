package ua.org.tours.DAO;

import ua.org.tours.DAO.api.DAO;
import ua.org.tours.DAO.impl.*;
import ua.org.tours.helper.PropertyHolder;
import ua.org.tours.model.*;

public class DAOFactory {
    private static DAOFactory instance = null;

    private DAO<Integer, Bill> billDAO;
    private DAO<Integer, Flight> flightDAO;
    private DAO<Integer, FlightsToTransfer> flightsToTransferDAO;
    private DAO<Integer, Hotel> hotelDAO;
    private DAO<Integer, Preferences> preferencesDAO;
    private DAO<Integer, SailedTour> sailedTourDAO;
    private DAO<Integer, Tour> tourDAO;
    private DAO<Integer, Tourist> touristDAO;
    private DAO<Integer, TouristGroup> touristGroupDAO;
    private DAO<Integer, TouristsToGroup> touristsToGroupDAO;
    private DAO<Integer, Transfer> transferDAO;
    private DAO<Integer, User> userDAO;


    private DAOFactory(){
        loadDAOs();
    }



    public static DAOFactory getInstance(){
        if(instance == null){
            instance = new DAOFactory();
        }
        return instance;
    }

    private void loadDAOs() {
        if(PropertyHolder.getInstance().isInMemoryDB()){
            //inmemory daos
        }else{
            //jdbc daos
            billDAO = new BillDAOimpl();
            flightDAO = new FlightDAOImpl();
            flightsToTransferDAO = new FlightsToTransferDAOImpl();
            hotelDAO = new HotelDAOImpl();
            preferencesDAO = new PreferencesDAOImpl();
            sailedTourDAO = new SailedToursDAOImpl();
            tourDAO = new TourDAOImpl();
            touristDAO = new TouristDAOImpl();
            touristGroupDAO = new TouristGroupDAOImpl();
            touristsToGroupDAO = new TouristsToGroupDAOImpl();
            transferDAO = new TransferDAOImpl();
            userDAO = new UserDAOImpl();
        }
    }



    public static void setInstance(DAOFactory instance) {
        DAOFactory.instance = instance;
    }

    public DAO<Integer, Bill> getBillDAO() {
        return billDAO;
    }

    public void setBillDAO(DAO<Integer, Bill> billDAO) {
        this.billDAO = billDAO;
    }

    public DAO<Integer, Flight> getFlightDAO() {
        return flightDAO;
    }

    public void setFlightDAO(DAO<Integer, Flight> flightDAO) {
        this.flightDAO = flightDAO;
    }

    public DAO<Integer, FlightsToTransfer> getFlightsToTransferDAO() {
        return flightsToTransferDAO;
    }

    public void setFlightsToTransferDAO(DAO<Integer, FlightsToTransfer> flightsToTransferDAO) {
        this.flightsToTransferDAO = flightsToTransferDAO;
    }

    public DAO<Integer, Hotel> getHotelDAO() {
        return hotelDAO;
    }

    public void setHotelDAO(DAO<Integer, Hotel> hotelDAO) {
        this.hotelDAO = hotelDAO;
    }

    public DAO<Integer, Preferences> getPreferencesDAO() {
        return preferencesDAO;
    }

    public void setPreferencesDAO(DAO<Integer, Preferences> preferencesDAO) {
        this.preferencesDAO = preferencesDAO;
    }

    public DAO<Integer, SailedTour> getSailedTourDAO() {
        return sailedTourDAO;
    }

    public void setSailedTourDAO(DAO<Integer, SailedTour> sailedTourDAO) {
        this.sailedTourDAO = sailedTourDAO;
    }

    public DAO<Integer, Tour> getTourDAO() {
        return tourDAO;
    }

    public void setTourDAO(DAO<Integer, Tour> tourDAO) {
        this.tourDAO = tourDAO;
    }

    public DAO<Integer, Tourist> getTouristDAO() {
        return touristDAO;
    }

    public void setTouristDAO(DAO<Integer, Tourist> touristDAO) {
        this.touristDAO = touristDAO;
    }

    public DAO<Integer, TouristGroup> getTouristGroupDAO() {
        return touristGroupDAO;
    }

    public void setTouristGroupDAO(DAO<Integer, TouristGroup> touristGroupDAO) {
        this.touristGroupDAO = touristGroupDAO;
    }

    public DAO<Integer, TouristsToGroup> getTouristsToGroupDAO() {
        return touristsToGroupDAO;
    }

    public void setTouristsToGroupDAO(DAO<Integer, TouristsToGroup> touristsToGroupDAO) {
        this.touristsToGroupDAO = touristsToGroupDAO;
    }

    public DAO<Integer, Transfer> getTransferDAO() {
        return transferDAO;
    }

    public void setTransferDAO(DAO<Integer, Transfer> transferDAO) {
        this.transferDAO = transferDAO;
    }

    public DAO<Integer, User> getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(DAO<Integer, User> userDAO) {
        this.userDAO = userDAO;
    }
}
