package ua.epam;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int rand (){
        Random random = new Random();
        return  random.nextInt(Integer.MAX_VALUE );
    }

    static int rand (int bottom, int top){
        Random random = new Random();
        return random.nextInt(top - bottom) + bottom;
    }


    static void guess(int number, int top, int bottom, int count){
        System.out.println("Input has to be in range [" + bottom + ";" + top + "]");
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();

            if ((input < top) && (input > bottom)) {
                count ++;
            }
            else{
                System.out.print("Invalid data. Your ");
                guess(number, top, bottom,count);
            }

        }
        else{
            System.out.println("Your input has to be integer");
            guess(number, top, bottom, count);
        }
    }

    public static void main(String[] args) {
        int bottom = 0;
        int top = 100;
        int number = rand (bottom, top);
        int count = 0;
        guess(number, top, bottom, count);

    }
}
