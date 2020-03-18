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
    countries.add(new Country("Nepal", new BigDecimal("1000000")));
    countries.add(new Country("South Korea", new BigDecimal("90000000")));

    countries.add(new Country("Niger", new BigDecimal("20000000")));
    countries.add(new Country("Sudan", new BigDecimal("45000000")));
    countries.add(new Country("Angola", new BigDecimal("60000000")));
    countries.add(new Country("Zambia", new BigDecimal("25000000")));
    countries.add(new Country("Senegal", new BigDecimal("30000000")));
    countries.add(new Country("Zimbabwe", new BigDecimal("80000000")));


    List<Continent> continents = new ArrayList<>();

    continents.add(new Continent("Asia", countries));
    continents.add(new Continent("Africa", countries));

    World world = new World (continents);
    //When
    BigDecimal totalPeople = world.getPeopleQuantity();
    //THen
    Assert.assertEquals(new BigDecimal("4082000000"), totalPeople);
    }
}
