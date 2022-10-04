package Lesson08;

import java.security.SecureRandom;

public class Dog extends Animal{
    @Override
    public String getName() {
        return "Dog";
    }

    int dogSpeed = new SecureRandom().nextInt(60);
    @Override
    public int getSpeed() {
        return dogSpeed;
    }
}
