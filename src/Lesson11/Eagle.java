package Lesson11;

import java.security.SecureRandom;

public class Eagle implements MoveAble, FlyAble {
    static final int EAGLE_MAX_SPEED = 220;
    protected int speed;

    @Override
    public Boolean flyAble() {
        return true;
    }

    @Override
    public int raceSpeed() {
        return speed;
    }

    public Eagle() {
        this.speed = new SecureRandom().nextInt(EAGLE_MAX_SPEED);
    }

}
