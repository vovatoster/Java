package ua.epam;

import java.util.EmptyStackException;

/**
 * Created by Volodymyr_Zaverukha on 9/23/2016.
 */
public class Queue extends Stack {
    @Override
    public int pop(){
        if (list.isEmpty()) throw new EmptyStackException();
        else{
            int tmp = list.get(0);
            list.remove(0);
            return tmp;
        }
    }
}
