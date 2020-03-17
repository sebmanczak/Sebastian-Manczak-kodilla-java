package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
    //Given
    List<Country> countries = new ArrayList<>();

    countries.add(new Country("China", new BigDecimal("1500000000")));
    countries.add(new Country("Japan", new BigDecimal("80000000")));
    countries.add(new Country("Philippines", new BigDecimal("60000000")));
    countries.add(new Country("Mongolia", new BigDecimal("50000000")));

    List<Continent> continents = new ArrayList<>();

    continents.add(new Continent("Asia", countries));
    World world = new World (continents);
    //When
    BigDecimal totalPeople = world.getPeopleQuantity();
    //THen
    Assert.assertEquals(new BigDecimal("1690000000"), totalPeople);
    }
}
