package ua.epam;

import ua.epam.Model.AbonentGroup;
import ua.epam.Model.Address;
import ua.epam.Model.Model;
import ua.epam.Model.Record;

import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by Volodymyr_Zaverukha on 9/22/2016.
 */
public class Control {
    Scanner scanner = new Scanner(System.in);
    String input;
    public Model validate(Model model, Properties regExp) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Enumeration<String> names = (Enumeration<String>) regExp.propertyNames();
        Class clazz = model.getClass();

        while (names.hasMoreElements()){
            String name = names.nextElement();
            do {
                System.out.println("Enter your " + name);
                input = scanner.nextLine();
            } while (!input.matches(regExp.getProperty(name)));
            clazz.getMethod("set" + name.substring(0, 1).toUpperCase() + name.substring(1), String.class ).invoke(model, input);
        }
        return model;
    }

    public Record createRecord(Model model){
        Address address = new Address(model.getIndex(),model.getCity(),model.getStreet(),
                model.getBuilding(),model.getAppartment());
        AbonentGroup group = AbonentGroup.valueOf(model.getGroup());
        Record record = new Record(model.getLastName(),model.getFirstName(), model.getNickname(), model.getComment(),
                group, model.getHomePhone(),model.getMobile(), model.getMobile2(), model.getEmail(), model.getSkype(),
                address,model.getCreationDate(),model.getModificationDate());
        return record;
    }

}
