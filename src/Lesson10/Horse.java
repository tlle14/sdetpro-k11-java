package Lesson10;

import java.security.SecureRandom;

public class Horse extends Animal01 {
    static final int HORSE_MAX_SPEED = 75;

    public Horse() {
        this.name = getClass().getSimpleName();
        this.speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
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
