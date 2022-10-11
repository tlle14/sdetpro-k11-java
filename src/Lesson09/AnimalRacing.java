package Lesson09;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static Lesson09.AnimalWithBuilder.Builder;
public class AnimalRacing {
    public static void main(String[] args) {
        Builder builder = new Builder();

        int turn = 1;
        do {
            List<AnimalWithBuilder> animalList = new ArrayList<>();
            List<AnimalWithBuilder> animalRacingList = new ArrayList<>();
            List<AnimalWithBuilder> winnerAnimal = new ArrayList<>();

            // Initial animalList
            builder.setName("Tiger").setWithWings(false).setSpeed();
            animalList.add(builder.build());
            builder.setName("Dog").setWithWings(false).setSpeed();
            animalList.add(builder.build());
            builder.setName("Horse").setWithWings(false).setSpeed();
            animalList.add(builder.build());
            builder.setName("Eagle").setWithWings(true).setSpeed();
            animalList.add(builder.build());
            builder.setName("Hen").setWithWings(true).setSpeed();
            animalList.add(builder.build());

            // Select animal to animalRacingList
            for (int i = 0; i < animalList.size(); i++) {
                if (animalList.get(i).getWithWings() == false) {
                    animalRacingList.add(animalList.get(i));
                }
            }

            // Print out the list
            for (int index = 0; index < animalRacingList.size(); index++) {
                System.out.println(animalRacingList.get(index).getName() + " : " + animalRacingList.get(index).getSpeed());
            }

            // Racing and Print out the result
            Racing(animalRacingList, winnerAnimal);
            for (int j = 0; j < winnerAnimal.size(); j++) {
                System.out.println("The Winner is '" + winnerAnimal.get(j).getName() +
                        "' with speed " + winnerAnimal.get(j).getSpeed() + " km/h");
            }
            System.out.println("---------");
            turn++;
        } while (turn <= 3);

    }

    // Racing
    private static void Racing(List<AnimalWithBuilder> animalList, List<AnimalWithBuilder> winnerAnimal) {
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
