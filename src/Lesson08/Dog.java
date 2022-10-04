package Lesson08;

import java.security.SecureRandom;

public class Dog extends Animal{
    int dogSpeed = new SecureRandom().nextInt(60);

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        return dogSpeed;
    }
}
