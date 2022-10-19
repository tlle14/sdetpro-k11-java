package Lesson10;

import java.security.SecureRandom;

public class Tiger extends Animal01 {

    static final int TIGER_MAX_SPEED = 100;
    public Tiger(){
        this.name = getClass().getSimpleName();
        this.speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
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
