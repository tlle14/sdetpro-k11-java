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
            Animal tiger = new Tiger("Tiger");
            Animal horse = new Horse("Horse");
            Animal dog = new Dog("Dog");
            List<Animal> animalList = Arrays.asList(tiger,horse,dog);
            List<Animal> winnerAnimal = new ArrayList<>();

            for (int i = 0; i < animalList.size(); i++) {
                System.out.println(animalList.get(i).getName()+ ": " +animalList.get(i).getSpeed());
            }

            // Print out the result
            Racing(animalList, winnerAnimal);
            for (int j = 0; j < winnerAnimal.size(); j++) {
                System.out.println("The Winner is '" + winnerAnimal.get(j).getName() +
                        "' with speed " + winnerAnimal.get(j).getSpeed() + " km/h");
            }
            System.out.println("---------");
            turn ++;
        } while (turn <= 3);
    }


    // Racing function
    private static void Racing(List<Animal> animalList, List<Animal> winnerAnimal) {
        int maxSpeed = animalList.get(0).getSpeed();

        // Find the maximum speed
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > maxSpeed){
                maxSpeed = animalList.get(i).getSpeed();
            }
        }
        // Add animal to the winner list
        for (int j = 0; j < animalList.size(); j++) {
            if (animalList.get(j).getSpeed() == maxSpeed){
                winnerAnimal.add(animalList.get(j));
            }
        }
    }
}
