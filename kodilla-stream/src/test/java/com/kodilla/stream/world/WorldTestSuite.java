package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        //Set<Country> europe = new HashSet<>();
        Country poland= new Country("Polska", new BigDecimal("12345678901234567890"));
        Country germany = new Country("Niemcy", new BigDecimal("12345678901548567890"));
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        //Set<Country> asia = new HashSet<>();
        Country japan = new Country("Japonia", new BigDecimal("12345673201234567890"));
        Country china = new Country("Chiny", new BigDecimal("12345678901234147890"));
        Continent asia = new Continent("Asia");
        asia.addCountry(japan);
        asia.addCountry(china);
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("49382709905251851560");
        assertEquals(expectedPeople, totalPeople);
    }
}

