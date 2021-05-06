package com.example.Holidaymaker.entities;

import javax.persistence.*;

@Entity
@Table(name="hotels")
public class Hotels {
    @Id// Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private long id;
    private String name;
    private String country;
    private String city;
    private String address;
    private boolean pool;
    private boolean entertainment;
    private boolean childrens_club;
    private boolean restaurant;
    private int distance_to_beach;
    private int distance_to_center;

    public Hotels() {
    }

    public Hotels(long id, String name, String country, String city, String address, boolean pool, boolean entertainment, boolean childrens_club, boolean restaurant, int distance_to_beach, int distance_to_center) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.address = address;
        this.pool = pool;
        this.entertainment = entertainment;
        this.childrens_club = childrens_club;
        this.restaurant = restaurant;
        this.distance_to_beach = distance_to_beach;
        this.distance_to_center = distance_to_center;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isEntertainment() {
        return entertainment;
    }

    public void setEntertainment(boolean entertainment) {
        this.entertainment = entertainment;
    }

    public boolean isChildrens_club() {
        return childrens_club;
    }

    public void setChildrens_club(boolean childrens_club) {
        this.childrens_club = childrens_club;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    public int getDistance_to_beach() {
        return distance_to_beach;
    }

    public void setDistance_to_beach(int distance_to_beach) {
        this.distance_to_beach = distance_to_beach;
    }

    public int getDistance_to_center() {
        return distance_to_center;
    }

    public void setDistance_to_center(int distance_to_center) {
        this.distance_to_center = distance_to_center;
    }

    @Override
    public String toString() {
        return "\nhotels{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", pool=" + pool +
                ", entertainment=" + entertainment +
                ", childrens_club=" + childrens_club +
                ", restaurant=" + restaurant +
                ", distance_to_beach=" + distance_to_beach +
                ", distance_to_center=" + distance_to_center +
                '}';
    }
}