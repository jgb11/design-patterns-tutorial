package com.jgb.designpatterns.builder.classbuilder;

import com.jgb.designpatterns.builder.classbuilder.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jgb
 * @since 25/11/2017 10:10
 */
public class CarBuilderTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCarBuilder() throws Exception {
        CarBuilder sedanCarBuilder = new SedanCarBuilder();
        CarDirector director = new CarDirector(sedanCarBuilder);
        director.build();
        Car car = sedanCarBuilder.getCar();
        assertNotNull("Sedan Car must be build", car);
        System.out.println(car);

        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        director = new CarDirector(sportsCarBuilder);
        director.build();
        car = sportsCarBuilder.getCar();
        assertNotNull("Sports Car must be build", car);
        System.out.println(car);
    }

}