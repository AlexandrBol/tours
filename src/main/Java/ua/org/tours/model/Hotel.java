package ua.org.tours.model;

import ua.org.tours.model.Entity;

public class Hotel extends Entity<Integer> {

    private String name;
    private String adress;
    private int stars;
    private String description;
    private double price;

    public Hotel() {

    }

    public Hotel(String name, String adress, int stars, String description, double price) {
        this.name = name;
        this.adress = adress;
        this.stars = stars;
        this.description = description;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", stars=" + stars +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
