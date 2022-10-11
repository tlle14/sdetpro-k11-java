package Lesson09;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private String name;
    private int speed;
    private boolean withWings;
    static final int MAX_SPEED = 200;


    protected AnimalWithBuilder(Builder build) {
        this.speed = build.speed;
        this.name = build.name;
        this.withWings = build.withWings;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getWithWings() {
        return withWings;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean withWings;
        static final int MAX_SPEED = 200;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed() {
            this.speed = new SecureRandom().nextInt(MAX_SPEED);
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);


        }
    }
}
