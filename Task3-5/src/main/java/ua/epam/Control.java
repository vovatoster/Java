package ua.epam;

import java.util.Scanner;

/**
 * Created by Volodymyr_Zaverukha on 9/15/2016.
 */
public class Control {

    int count = 0;
    Model model = new Model();
    View view = new View();
    int input;
    Scanner scanner = new Scanner(System.in);

    public void play(){
        while (model.playing){
            model.effort(getInput());
        }
        view.print("Yahooo!!!");
        view.print( "You won with ",Integer.toString(count), " attempts ");
    }

    private int getInput() {
        view.print("Input has to be in range [",Integer.toString(model.getBottom()), ";",
                                                Integer.toString(model.getTop()),"]");
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();

            if ((input < model.getTop()) && (input > model.getBottom())) {
                count++;
            } else {
                view.print("Invalid input. Your input has to be in specified range");
                getInput();
            }

        }
        else{
            view.print("Your input has to be Integer");
            scanner.next();
            getInput();
        }
        return input;
    }
}
