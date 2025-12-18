package com.example.apartment_predictor;

import com.example.apartment_predictor.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class PropertiesTest {

    @Test
    void testIsSuitableForFamilyApartmentVariation() {

        //Apartments
        System.out.println("Apartments results:");

        // Case 1:
        // 2 rooms (max 4p) 2 bathrooms (max 6p) familySize: 3
        // Result: true
        Property apartment1 = new Apartment();
        ((Apartment) apartment1).setNumberOfBathrooms(2);
        ((Apartment) apartment1).setNumberOfBedrooms(2);

        System.out.println(((Apartment) apartment1).isSuitableForFamily(3));

        // Case 2:
        // 2 rooms (max 4p) 2 bathrooms (max 6p) familySize: 3
        // Result: false
        Property apartment2 = new Apartment();
        ((Apartment) apartment2).setNumberOfBathrooms(2);
        ((Apartment) apartment2).setNumberOfBedrooms(2);

        System.out.println(((Apartment) apartment2).isSuitableForFamily(5));

        // Case 3:
        // 2 rooms (max 4p) 1 bathroom (max 3p) familySize: 3
        // Result: false
        Property apartment3 = new Apartment();
        ((Apartment) apartment3).setNumberOfBathrooms(1);
        ((Apartment) apartment3).setNumberOfBedrooms(2);

        System.out.println(((Apartment) apartment3).isSuitableForFamily(5));
    }

    @Test
    void testIsSuitableForFamilyHouseVariation() {

        //House
        System.out.println("Houses results:");

        // Case 1:
        // 4 rooms (max 8p) 3 bathrooms (max 6p) hasBasement (true) familySize: 5
        // Result: true
        Property house1 = new House();
        ((House) house1).setNumberOfBedrooms(4);
        ((House) house1).setNumberOfBathrooms(3);
        ((House) house1).setHasBasement(true);

        System.out.println(((House) house1).isSuitableForFamily(5));

        // Case 2:
        // 1 rooms (max 2p) 2 bathrooms (max 4p) hasBasement (true) familySize: 3
        // Result: true
        Property house2 = new House();
        ((House) house1).setNumberOfBedrooms(1);
        ((House) house1).setNumberOfBathrooms(2);
        ((House) house2).setHasBasement(true);

        System.out.println(((House) house2).isSuitableForFamily(3));

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

        //Townhouse
        System.out.println("Townhouses results:");

        // Case 1:
        // 4 rooms (max 8p) 2 bathrooms (max 4p) familySize: 4
        // Result: true
        Property townhouse1 = new Townhouse();
        ((Townhouse) townhouse1).setNumberOfBedrooms(4);
        ((Townhouse) townhouse1).setNumberOfBathrooms(2);

        System.out.println(((Townhouse) townhouse1).isSuitableForFamily(4));

        // Case 2:
        // 2 rooms (max 4p) 3 bathrooms (max 6p) familySize: 5
        // Result: false
        Property townhouse2 = new Townhouse();
        ((Townhouse) townhouse2).setNumberOfBedrooms(2);
        ((Townhouse) townhouse2).setNumberOfBathrooms(3);

        System.out.println(((Townhouse) townhouse2).isSuitableForFamily(5));

        // Case 3:
        // 2 rooms (max 4p) 1 bathroom (max 2p) familySize: 3
        // Result: false
        Property townhouse3 = new Townhouse();
        ((Townhouse) townhouse3).setNumberOfBedrooms(2);
        ((Townhouse) townhouse3).setNumberOfBathrooms(1);

        System.out.println(((Townhouse) townhouse3).isSuitableForFamily(3));
    }

    @Test
    void testIsSuitableForFamilyDuplexVariation() {

        //Duplex
        System.out.println("Duplex results:");

        // Case 1:
        // 3 rooms (max 6p) 2 bathrooms (max 6p) familySize: 5 > 4
        // Result: true
        Property duplex1 = new Duplex();
        ((Duplex) duplex1).setNumberOfBedrooms(3);
        ((Duplex) duplex1).setNumberOfBathrooms(2);

        System.out.println(((Duplex) duplex1).isSuitableForFamily(5));

        // Case 2:
        // 4 rooms (max 8p) 2 bathrooms (max 3p) familySize: 3 < 4
        // Result: false
        Property duplex2 = new Duplex();
        ((Duplex) duplex2).setNumberOfBedrooms(4);
        ((Duplex) duplex2).setNumberOfBathrooms(1);

        System.out.println(((Duplex) duplex2).isSuitableForFamily(3));

        // Case 2:
        // 2 rooms (max 4p) 1 bathroom (max 3p) familySize: 4 == 4
        // Result: false
        Property duplex3 = new Duplex();
        ((Duplex) duplex3).setNumberOfBedrooms(2);
        ((Duplex) duplex3).setNumberOfBathrooms(1);

        System.out.println(((Duplex) duplex3).isSuitableForFamily(4));
    }
}
