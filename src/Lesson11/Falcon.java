package Lesson11;

import java.security.SecureRandom;

public class Falcon implements MoveAble, FlyAble {
    static final int FALCON_MAX_SPEED = 200;
    protected int speed;

    @Override
    public Boolean flyAble() {
        return true;
    }

    @Override
    public int raceSpeed() {
        return speed;
    }

    public Falcon() {
        this.speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
    }
}
