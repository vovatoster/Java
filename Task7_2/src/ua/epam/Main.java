package ua.epam;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import ua.epam.Model.*;


import ua.epam.Model.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
	// write your code here
        Control control = new Control();
        Model model = new Model();
        Notebook notebook = new Notebook();
        InputStream inputStream = Main.class.getResourceAsStream("regexp.properties");
        Properties regExp = new Properties();
        regExp.load(inputStream);
        notebook.add(
                control.createRecord(
                control.validate(model, regExp)));
        System.out.println(notebook.notebook.toString());
    }
}
