package Lesson08;

import java.security.SecureRandom;

public class Horse extends Animal{

    @Override
    public String getName() {
        return "Horse";
    }

    int horseSpeed = new SecureRandom().nextInt(100);

    @Override
    public int getSpeed() {
        return horseSpeed;
    }
}
