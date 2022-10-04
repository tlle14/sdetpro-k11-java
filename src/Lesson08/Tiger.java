package Lesson08;

import java.security.SecureRandom;

public class Tiger extends Animal{

    @Override
    public String getName() {
        return "Tiger";
    }

    int tigerSpeed = new SecureRandom().nextInt(100);
    @Override
    public int getSpeed() {
        return tigerSpeed;
    }
}
