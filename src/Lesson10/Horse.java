package Lesson10;

import java.security.SecureRandom;

public class Horse extends Animal01 {
    static final int HORSE_MAX_SPEED = 75;
    public Horse(){}

    @Override
    public Horse setName() {
        this.name = getClass().getSimpleName();
        return this;
    }

    @Override
    public Horse setSpeed() {
        this.speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
        return this;
    }
}
