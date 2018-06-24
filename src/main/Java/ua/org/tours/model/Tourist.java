package ua.org.tours.model;

import ua.org.tours.model.Entity;

import ua.org.tours.service.api.Service;

public class Tourist extends Entity<Integer>{
    private String name;
    private String surname;
    private String phone;
    private String email;
    private int group_id;

    public Tourist(){

    }

    public Tourist(String name, String surname, String phone, String email, int group_id) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.group_id = group_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", group_id=" + group_id +
                '}';
    }
}
