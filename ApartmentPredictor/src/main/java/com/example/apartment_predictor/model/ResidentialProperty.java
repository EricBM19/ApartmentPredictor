package com.example.apartment_predictor.model;

public abstract class ResidentialProperty extends Property{

    protected int numberOfBedrooms;
    protected int numberOfBathrooms;
    protected boolean hasGarden;

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "ResidentialProperty{" +
                "id='" + id + '\'' +
                ", area=" + area +
                ", locationRating=" + locationRating +
                ", address='" + address + '\'' +
                ", hasGarden=" + hasGarden +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfBedrooms=" + numberOfBedrooms +
                '}';
    }
}
