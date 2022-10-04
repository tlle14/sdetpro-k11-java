package Lesson08;

import java.security.SecureRandom;

public class Horse extends Animal{

    int horseSpeed = new SecureRandom().nextInt(100);

    @Override
    public String getName() {
        return "Horse";
    }

    @Override
    public int getSpeed() {
        return horseSpeed;
    }
}
