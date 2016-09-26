package ua.epam;

/**
 * Created by Volodymyr_Zaverukha on 9/15/2016.
 */
public class View {

    public void print(String ... s) {
        String st = "";
        for (String t : s) {
            st += t;
        }
        System.out.println(st);
    }
}
