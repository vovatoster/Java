package ua.epam.Model;

/**
 * Created by Volodymyr_Zaverukha on 9/22/2016.
 */
public class Address {
    String index;
    String city;
    String street;
    String building;
    String appartment;

    public Address(String index, String city, String street, String building, String appartment) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.building = building;
        this.appartment = appartment;
    }
}
