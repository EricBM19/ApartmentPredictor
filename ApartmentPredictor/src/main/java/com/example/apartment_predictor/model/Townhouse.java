package com.example.apartment_predictor.model;

public class Townhouse extends SingleFamilyHome{

    private boolean hasHomeownersAssociation;
    private double hoaMonthlyFee;

    public Townhouse(double area, int locationRating, String address, int numberOfBedrooms, int numberOfBathrooms, boolean hasGarden, double lotSize, boolean hasGarage, boolean hasPool, boolean hasHomeownersAssociation, double hoaMonthlyFee) {
        super(area, locationRating, address, numberOfBedrooms, numberOfBathrooms, hasGarden, lotSize, hasGarage, hasPool);
        this.hasHomeownersAssociation = hasHomeownersAssociation;
        this.hoaMonthlyFee = hoaMonthlyFee;
    }

    public boolean isHasHomeownersAssociation() {
        return hasHomeownersAssociation;
    }

    public void setHasHomeownersAssociation(boolean hasHomeownersAssociation) {
        this.hasHomeownersAssociation = hasHomeownersAssociation;
    }

    public double getHoaMonthlyFee() {
        return hoaMonthlyFee;
    }

    public void setHoaMonthlyFee(double hoaMonthlyFee) {
        this.hoaMonthlyFee = hoaMonthlyFee;
    }

    // Similar to the House method, in this case we don't have the increase of rooms.
    // It also changes the conditions of max numbers of rooms.
    @Override
    public boolean isSuitableForFamily(int familySize) {

        int maxPeopleForBedroom = 2;
        int maxPeopleForBathroom = 2;

        if ((double) numberOfBedrooms/familySize <= maxPeopleForBedroom && (double) numberOfBathrooms/familySize <= maxPeopleForBathroom) {
            return true;
        }
        else return false;
    }
}
