package Lesson08;

import java.security.SecureRandom;

public class Tiger extends Animal{
    static final int TIGER_MAX_SPEED = 100;

    public Tiger(String name) {
        super(name, new SecureRandom().nextInt(TIGER_MAX_SPEED));
    }
}
