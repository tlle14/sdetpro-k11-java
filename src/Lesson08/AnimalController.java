package Lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnimalController {

    public static void main(String[] args) {
        int turn = 1;
        do {
            // Initial each round
            System.out.println("Round " + turn);
            Animal tiger = new Tiger();
            Animal horse = new Horse();
            Animal dog = new Dog();
            List<Animal> animalList = Arrays.asList(tiger,horse,dog);
            for (int i = 0; i < animalList.size(); i++) {
                System.out.println(animalList.get(i).getName()+ ": " +animalList.get(i).getSpeed());
            }

            // Print out the result
            int winner = new AnimalController().Racing(animalList);
            System.out.println("The Winner is '" + animalList.get(winner).getName() + "' with speed " + animalList.get(winner).getSpeed() + " km/h");
            System.out.println("---------");
            turn ++;
        } while (turn <= 3);
    }


    // Racing function will be failed if there're 2 animals have the same speed. I don't know how to return 2 values.
    private static Integer Racing(List<Animal> animalList) {
        int winner = 0;
        int winSpeed = animalList.get(0).getSpeed();
        int position = 0;
        while(position < animalList.size()){
            for (int i = 0; i < animalList.size(); i++) {
                if (animalList.get(i).getSpeed() > winSpeed) {
                    winner = i;
                    winSpeed = animalList.get(i).getSpeed();
                }
                position++;
            }
        }
        return winner;
    }
}
