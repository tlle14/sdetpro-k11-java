package Lesson10;

import java.security.SecureRandom;

public class Dog extends Animal01 {
    static final int DOG_MAX_SPEED = 60;

    public Dog() {
        this.name = getClass().getSimpleName();
        this.speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getName() {
        return name;
    }

}
