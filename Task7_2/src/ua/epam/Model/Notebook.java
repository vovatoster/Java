package ua.epam.Model;

import java.util.ArrayList;

/**
 * Created by Volodymyr_Zaverukha on 9/22/2016.
 */
public class Notebook {
    public ArrayList<Record> notebook = new ArrayList<Record>();
    public void add(Record record){
        notebook.add(record);
    }
}
