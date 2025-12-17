package com.example.apartment_predictor.model;

public class Apartment extends ResidentialProperty{

    private int floorLevel;
    private boolean hasBalcony;

    public Apartment(double area, int locationRating, String address, int numberOfBedrooms, int numberOfBathrooms, boolean hasGarden, int floorLevel, boolean hasBalcony) {
        super(area, locationRating, address, numberOfBedrooms, numberOfBathrooms, hasGarden);
        this.floorLevel = floorLevel;
        this.hasBalcony = hasBalcony;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(int floorLevel) {
        this.floorLevel = floorLevel;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
}
