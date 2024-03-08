package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Edmonton", "AB");
        list = MockCityList();
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Estevan", "SK");
        list.addCity(city1);
        list.addCity(city2);
        int listSize = list.getCount();
        list.deleteCity(city1);
        assertEquals(list.getCount(), listSize-1);

    }

    @Test
    public void countCitiesTest(){
        list = MockCityList();
        assertEquals(list.countCities(), 0);
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.countCities(), 2);



    }



}
