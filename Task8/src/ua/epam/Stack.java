package ua.epam;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by Volodymyr_Zaverukha on 9/23/2016.
 */
public class Stack {
    protected ArrayList<Integer> list = new ArrayList<>();

    public int pop(){
        if (list.isEmpty()) throw new EmptyStackException();
        else{
        int tmp = list.get((list.size() - 1));
        list.remove(list.size() - 1);
        return tmp;
        }
    }

    public final void add(int e){
        list.add(e);
    }

}
