package com.example.apartment_predictor;

import com.example.apartment_predictor.model.House;
import com.example.apartment_predictor.model.Property;
import com.example.apartment_predictor.model.ResidentialProperty;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesTest {

    @Test
    void testIsSuitableForFamilyVariations() {

        ResidentialProperty house1 = new House(
                150.00,
                4,
                "Fake Street 1234",
                5,
                2,
                true,
                1500.00,
                true,
                true,
                true
        );

        System.out.println(house1.isSuitableForFamily(4));

        ResidentialProperty house2 = new House(
                150.00,
                4,
                "Fake Street 1234",
                5,
                2,
                true,
                1500.00,
                true,
                true,
                true
        );

        System.out.println(house1.isSuitableForFamily(4));
    }
}
