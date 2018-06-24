package ua.org.tours.model;

import ua.org.tours.model.Entity;

import java.util.Date;

public class Tour extends Entity<Integer> {
    private int numberOfPerson;
    private int numberKids;
    private int hotelId;
    private Date startDate;
    private Date endDate;
    private int transferId;
    private double price;

    public Tour() {

    }

    public Tour(int numberOfPerson, int numberKids, int hotelId, Date startDate, Date endDate, int transferId, double price) {
        this.numberOfPerson = numberOfPerson;
        this.numberKids = numberKids;
        this.hotelId = hotelId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.transferId = transferId;
        this.price = price;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getNumberKids() {
        return numberKids;
    }

    public void setNumberKids(int numberKids) {
        this.numberKids = numberKids;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    @Override
    public String toString() {
        return "Tour{" +
                ", numberOfPerson=" + numberOfPerson +
                ", numberKids=" + numberKids +
                ", hotelId=" + hotelId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", transferId=" + transferId +
                ", price=" + price +
                '}';
    }
}
