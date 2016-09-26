package com.company.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.company.entities.Human.BloodGroup.SECOND;
import static com.company.entities.Human.Gender.MALE;
import static org.junit.Assert.*;

/**
 * Created by Volodymyr_Zaverukha on 9/26/2016.
 */
public class RouteTest {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Human human;
    GasolineCar car;
    Driver currentDriver;


    @Before
    public void init() throws ParseException {

        human = new Human("Vova", dateFormat.parse("31/05/1988"), MALE, SECOND);
        currentDriver = new Driver(human ,new DriverLicense(dateFormat.parse("31/05/2062"),
                DriverLicense.Category.C , dateFormat.parse("31/05/2012")));
        car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeRouteCreation() throws ParseException {
        Driver vovaDriver = new Driver(human ,new DriverLicense(new Date() ,
                DriverLicense.Category.A , dateFormat.parse("31/05/2012")));
        Route negativeRoute = new Route(car, vovaDriver, "EPAM", "Home");
    }

    @Test
    public void posRouteCreate() throws ParseException {
        Driver idealDriver = new Driver(human ,new DriverLicense(dateFormat.parse("31/05/2062") ,
                DriverLicense.Category.C , dateFormat.parse("31/05/2012")));
        Route expectedRoute = new Route(car, idealDriver, "EPAM", "Home");
        Route actualRoute = new Route(car, currentDriver, "EPAM", "Home");
        Assert.assertEquals(expectedRoute.toString(), actualRoute.toString());

    }

}