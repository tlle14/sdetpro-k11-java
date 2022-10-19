package Lesson10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {
        Animal01 tiger = new Tiger();
        Animal01 horse = new Horse();
        Animal01 dog = new Dog();

        // Init racing list & winner list
        List<Animal01> animalList = Arrays.asList(dog, tiger, horse);
        List<Animal01> winnerList = new ArrayList<>();
        for (Animal01 animal : animalList) {
            System.out.println(animal.getName() + " : " + animal.getSpeed());
        }

        // Racing and print the winner
        Racing(animalList, winnerList);
        for (Animal01 animal : winnerList) {
            System.out.println("Winner is: " + animal.getName() + " - " + animal.getSpeed());
        }
    }

    private static void Racing(List<Animal01> animalList, List<Animal01> winnerAnimal) {
        int maxSpeed = animalList.get(0).getSpeed();

        // Find the maximum speed
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > maxSpeed) {
                maxSpeed = animalList.get(i).getSpeed();
            }
        }
        // Add animal to the winner list
        for (int j = 0; j < animalList.size(); j++) {
            if (animalList.get(j).getSpeed() == maxSpeed) {
                winnerAnimal.add(animalList.get(j));
            }
        }
    }
}
