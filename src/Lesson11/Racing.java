package Lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Racing {

    // Find max speed
    public int getWinner(List<MoveAble> moveAbleList) {
        int maxSpeed = moveAbleList.get(0).raceSpeed();
        for (MoveAble moveAble : moveAbleList) {
            if (moveAble.raceSpeed() > maxSpeed) {
                maxSpeed = moveAble.raceSpeed();
            }
        }
        return maxSpeed;
    }

    public static void main(String[] args) {

        // Init data
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Falcon falcon = new Falcon();
        Eagle eagle = new Eagle();

        List<FlyAble> flyAbleList = Arrays.asList(dog, tiger, falcon, eagle);
        List<MoveAble> moveAbleList = Arrays.asList(dog, tiger, falcon, eagle);

        // Print out all speed
        for (MoveAble moveAble : moveAbleList) {
            System.out.println(moveAble + " : " + moveAble.raceSpeed());
        }

        // Find a racing list
        List<MoveAble> racingList = new ArrayList<>();
        for (int i = 0; i < flyAbleList.size(); i++) {
            if (flyAbleList.get(i).flyAble() == false) {
                racingList.add(moveAbleList.get(i));
            }
        }

        // Find a maximum speed then print out the winner
        Racing controller = new Racing();
        int maximum = controller.getWinner(racingList);
        for (MoveAble moveAble : racingList) {
            if (moveAble.raceSpeed() == maximum) {
                System.out.println("The winner is: " + moveAble + " : " + moveAble.raceSpeed());
            }
        }
    }
}
