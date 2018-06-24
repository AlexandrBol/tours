package ua.org.tours.model;

import ua.org.tours.model.Entity;

public class Preferences extends Entity<Integer> {
    private String name;

    public Preferences() {

    }

    public Preferences(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Preferences{" +
                ", name='" + name + '\'' +
                '}';
    }
}
