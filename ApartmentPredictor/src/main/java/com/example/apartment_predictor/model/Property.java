package com.example.apartment_predictor.model;

import jakarta.persistence.Id;

import java.util.UUID;

public abstract class Property {

    @Id
    protected String id = UUID.randomUUID().toString();
    protected double area;
    protected int locationRating;
    protected String address;

    public String getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getLocationRating() {
        return locationRating;
    }

    public void setLocationRating(int locationRating) {
        this.locationRating = locationRating;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id='" + id + '\'' +
                ", area=" + area +
                ", locationRating=" + locationRating +
                ", address='" + address + '\'' +
                '}';
    }
}
