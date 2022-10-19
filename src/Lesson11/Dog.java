package Lesson11;

import java.security.SecureRandom;

public class Dog implements MoveAble, FlyAble {
    static final int DOG_MAX_SPEED = 60;
    private int speed;
    @Override
    public Boolean flyAble() {
        return false;
    }
    @Override
    public int raceSpeed() {
        return speed;
    }
    public Dog() {
        this.speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    }

}
