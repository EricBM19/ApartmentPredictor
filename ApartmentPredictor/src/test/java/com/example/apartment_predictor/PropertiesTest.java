package com.example.apartment_predictor;

import com.example.apartment_predictor.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesTest {

    @Test
    void testIsSuitableForFamilyApartmentVariation() {

        //Apartments

        // Case 1:
        // 2 rooms (max 4p) 2 bathrooms (max 6p) familySize: 3
        // Result: true
        ResidentialProperty apartment1 = new Apartment();
        apartment1.setNumberOfBathrooms(2);
        apartment1.setNumberOfBedrooms(2);

        System.out.println(apartment1.isSuitableForFamily(3));

        // Case 2:
        // 2 rooms (max 4p) 2 bathrooms (max 6p) familySize: 3
        // Result: false
        ResidentialProperty apartment2 = new Apartment();
        apartment2.setNumberOfBathrooms(2);
        apartment2.setNumberOfBedrooms(2);

        System.out.println(apartment2.isSuitableForFamily(5));

        // Case 3:
        // 2 rooms (max 4p) 1 bathroom (max 3p) familySize: 3
        // Result: false
        ResidentialProperty apartment3 = new Apartment();
        apartment3.setNumberOfBathrooms(1);
        apartment3.setNumberOfBedrooms(2);

        System.out.println(apartment3.toString());
        System.out.println(apartment3.isSuitableForFamily(5));
    }

    @Test
    void testIsSuitableForFamilyHouseVariation() {

        // Case 1:
        // 4 rooms (max 8p) 3 bathrooms (max 6p) hasBasement (true) familySize: 5
        // Result: true
        ResidentialProperty house1 = new House();
        house1.setNumberOfBedrooms(4);
        house1.setNumberOfBathrooms(3);
        ((House) house1).setHasBasement(true);

        System.out.println(house1.isSuitableForFamily(5));

        // Case 2:
        // 1 rooms (max 2p) 2 bathrooms (max 4p) hasBasement (true) familySize: 3
        // Result: true
        ResidentialProperty house2 = new House();
        house2.setNumberOfBedrooms(1);
        house2.setNumberOfBathrooms(2);
        ((House) house2).setHasBasement(true);

        System.out.println(house2.isSuitableForFamily(3));

        // Case 3:
        // 1 rooms (max 2p) 2 bathrooms (max 4p) hasBasement (true) familySize: 3
        // Result: false
        ResidentialProperty house3 = new House();
        house3.setNumberOfBedrooms(2);
        house3.setNumberOfBathrooms(3);
        ((House) house3).setHasBasement(false);

        System.out.println(house3.isSuitableForFamily(5));
    }

    @Test
    void testIsSuitableForFamilyTownhouseVariation() {

    }
}
