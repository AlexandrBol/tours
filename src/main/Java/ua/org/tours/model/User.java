package ua.org.tours.model;

import ua.org.tours.model.Entity;

import ua.org.tours.service.api.Service;

import java.util.Date;

public class User extends Entity<Integer> {
    private String name;
    private Date DOB;
    private String phone;
    private String email;
    private Preferences preferences;
    private String password;

    public User() {

    }

    public User(String name, Date DOB, String phone, String email, Preferences preferences, String password) {
        this.name = name;
        this.DOB = DOB;
        this.phone = phone;
        this.email = email;
        this.preferences = preferences;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", preferences_id=" + preferences +
                ", password='" + password + '\'' +
                '}';
    }
}
