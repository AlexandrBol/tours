package ua.org.tours.model;
import ua.org.tours.model.Entity;

import java.sql.Time;
import java.time.LocalDateTime;

public class Flight extends Entity<Integer> {

    private int transferId;
    private double price;
    private String arrivalPoint;
    private String destinationPoint;
    private Time FlightTime;
    private LocalDateTime arrivalTime;

    public Flight(){

    }

    public Flight(int transferId, double price, String arrivalPoint, String destinationPoint, Time time, LocalDateTime arrivalTime) {

        this.transferId = transferId;
        this.price = price;
        this.arrivalPoint = arrivalPoint;
        this.destinationPoint = destinationPoint;
        this.FlightTime = time;
        this.arrivalTime = arrivalTime;
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public Time getFlightTime() {
        return FlightTime;
    }

    public void setFlightTime(Time flightTime) {
        this.FlightTime = flightTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }



    @Override
    public String toString() {
        return "Flight{" +
                ", transferId=" + transferId +
                ", price=" + price +
                ", arrivalPoint='" + arrivalPoint + '\'' +
                ", destinationPoint='" + destinationPoint + '\'' +
                ", FlightTime=" + FlightTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
