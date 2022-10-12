package Lesson10;

import java.security.SecureRandom;

public class Dog extends Animal01 {
    static final int DOG_MAX_SPEED = 60;
    public Dog(){
    }

    @Override
    public Dog setName() {
        this.name = getClass().getSimpleName();
        return this;
    }

    @Override
    public Dog setSpeed() {
        this.speed =  new SecureRandom().nextInt(DOG_MAX_SPEED);
        return this;
    }
}
