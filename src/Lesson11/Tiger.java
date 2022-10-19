package Lesson11;

import java.security.SecureRandom;

public class Tiger implements MoveAble, FlyAble {
    static final int TIGER_MAX_SPEED = 100;
    private int speed;
    @Override
    public Boolean flyAble() {
        return false;
    }

    @Override
    public int raceSpeed() {
        return speed;
    }

    public Tiger() {
        this.speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
    }
}
