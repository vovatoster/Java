package ua.epam;

import java.util.Random;
import ua.epam.*;

/**
 * Created by Volodymyr_Zaverukha on 9/15/2016.
 */
public class Model {
    boolean playing = true;
    int bottom;
    int top;
    int secretNumber;

    public int getBottom() {
        return bottom;
    }
    public int getTop() {
        return top;
    }
    public int getSecretNumber() {
        return secretNumber;
    }


    public Model(){
        bottom = 0;
        top = 100;
        secretNumber = setSecretNumber(bottom,top);
    }

    private int setSecretNumber (int bottom, int top){
        Random random = new Random();
        return random.nextInt(top - bottom + 1) + bottom;
    }

    public void effort(int input){
        if (secretNumber == input) {
            playing = false;
        } else if (secretNumber > input) {
            bottom = input;
        } else if (secretNumber < input) {
            top = input;
        }
    }
}
