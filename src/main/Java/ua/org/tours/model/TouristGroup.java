package ua.org.tours.model;

import ua.org.tours.model.Entity;

public class TouristGroup extends Entity<Integer> {
    private int touristNumber;

    public TouristGroup() {
    }

    public TouristGroup(int touristNumber) {
        this.touristNumber = touristNumber;
    }

    public int getTouristNumber() {
        return touristNumber;
    }

    public void setTouristNumber(int touristNumber) {
        this.touristNumber = touristNumber;
    }

    @Override
    public String toString() {
        return "TouristGroup{" +
                ", touristNumber=" + touristNumber +
                '}';
    }
}
