package Lesson10;

import java.security.SecureRandom;

public class Tiger extends Animal01 {

    static final int TIGER_MAX_SPEED = 100;
    public Tiger(){}

    @Override
    public Animal01 setName() {
        this.name = getClass().getSimpleName();
        return this;
    }

    @Override
    public Animal01 setSpeed() {
        this.speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
        return this;
    }
}
