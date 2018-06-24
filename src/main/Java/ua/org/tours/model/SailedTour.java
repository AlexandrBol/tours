package ua.org.tours.model;

import ua.org.tours.model.Entity;

public class SailedTour extends Entity<Integer> {
    private int billId;
    private int touristsNumber;
    private int touristsGroup;
    private double price;

    public SailedTour(){

    }

    public SailedTour(int billId, int toutistsNumber, int touristsGroup, double price) {
        this.billId = billId;
        this.touristsNumber = toutistsNumber;
        this.touristsGroup = touristsGroup;
        this.price = price;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getTouristsNumber() {
        return touristsNumber;
    }

    public void setTouristsNumber(int touristsNumber) {
        this.touristsNumber = touristsNumber;
    }

    public int getTouristsGroup() {
        return touristsGroup;
    }

    public void setTouristsGroup(int touristsGroup) {
        this.touristsGroup = touristsGroup;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SailedTour{" +
                ", billId=" + billId +
                ", touristsNumber=" + touristsNumber +
                ", touristsGroup=" + touristsGroup +
                ", price=" + price +
                '}';
    }
}
