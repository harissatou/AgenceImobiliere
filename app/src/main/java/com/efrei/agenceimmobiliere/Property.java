package com.efrei.agenceimmobiliere;

import java.util.Date;

public class Property {

    private enum type{house, flat, office, apartment};
    private double price;
    private double surface;
    private int numberRoom;
    private String description;
    private String address;
    private double lattitude;
    private double longitude;
    private Date created_at;
    private Date updated_at;
    private enum status{notSold, sold};
    private User author;


    public Property(double price, double surface, int numberRoom, String description, String address, double lattitude, double longitude, Date created_at, Date updated_at, User author) {
        this.price = price;
        this.surface = surface;
        this.numberRoom = numberRoom;
        this.description = description;
        this.address = address;
        this.lattitude = lattitude;
        this.longitude = longitude;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
