package Lesson08;

import java.security.SecureRandom;

public class Tiger extends Animal{
    int tigerSpeed = new SecureRandom().nextInt(100);

    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getSpeed() {
        return tigerSpeed;
    }
}
