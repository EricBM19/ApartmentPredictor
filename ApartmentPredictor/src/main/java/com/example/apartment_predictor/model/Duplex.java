package com.example.apartment_predictor.model;

public class Duplex extends SingleFamilyHome{

    private boolean hasSeparatedUtilities;

    public Duplex(double area, int locationRating, String address, int numberOfBedrooms, int numberOfBathrooms, boolean hasGarden, double lotSize, boolean hasGarage, boolean hasPool, boolean hasSeparatedUtilities) {
        super(area, locationRating, address, numberOfBedrooms, numberOfBathrooms, hasGarden, lotSize, hasGarage, hasPool);
        this.hasSeparatedUtilities = hasSeparatedUtilities;
    }

    public boolean isHasSeparatedUtilities() {
        return hasSeparatedUtilities;
    }

    public void setHasSeparatedUtilities(boolean hasSeparatedUtilities) {
        this.hasSeparatedUtilities = hasSeparatedUtilities;
    }

    // In the Duplex version of this method, only families with 4 or more members are allowed.
    @Override
    public boolean isSuitableForFamily(int familySize) {

        if (super.isSuitableForFamily(familySize) && familySize >= 4) return true;
        else return false;
    }
}
