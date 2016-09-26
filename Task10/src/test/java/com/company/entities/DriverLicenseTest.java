package com.company.entities;

import org.junit.BeforeClass;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Volodymyr_Zaverukha on 9/26/2016.
 */
public class DriverLicenseTest {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date from;
    Date to;
    @BeforeClass
    public void init() throws ParseException {
        from = dateFormat.parse("31/12/2012");
        to = dateFormat.parse("31/12/2062");
    }

    @Test (expected = Exception.class)
    public void negativeLicenseCreate() throws ParseException {
        Date from = dateFormat.parse("31/12/2012");
        Date to = dateFormat.parse("31/12/2062");
        DriverLicense driverLicense = new DriverLicense(from, DriverLicense.Category.A, to);
        System.out.println(driverLicense.toString());
    }

}