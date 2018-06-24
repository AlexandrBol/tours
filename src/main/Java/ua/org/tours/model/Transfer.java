package ua.org.tours.model;

import ua.org.tours.model.Entity;

import ua.org.tours.service.api.Service;

public class Transfer extends Entity<Integer>{

    private int flightNumber;

    public Transfer() {
    }

    public Transfer(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
