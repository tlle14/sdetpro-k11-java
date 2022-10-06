package Lesson08;

import java.security.SecureRandom;

public class Dog extends Animal{
    int dogSpeed = new SecureRandom().nextInt(60);

    static final int DOG_MAX_SPEED = 60;
    public Dog(String name) {
        super(name, new SecureRandom().nextInt(DOG_MAX_SPEED));
    }
}
