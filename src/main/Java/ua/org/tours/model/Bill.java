package ua.org.tours.model;

import ua.org.tours.model.Entity;

public class Bill extends Entity<Integer> {
    private int userId;
    private int tourId;
    private double totalPrice;

    public Bill(){

    }

    public Bill(int userId, int tourId, double totalPrice) {
        this.userId = userId;
        this.tourId = tourId;
        this.totalPrice = totalPrice;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Bill{" +
                ", userId=" + userId +
                ", tourId=" + tourId +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
