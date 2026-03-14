package com.mdabdullaih.main.model;

public class User {
//    @Setter
//    @Getter
    private String name;
    private String city;
    private Computer computer;

    public User() {

    }

    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public User(String name, String city, Computer computer) {
        this.name = name;
        this.city = city;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", computer=" + computer +
                '}';
    }
}
