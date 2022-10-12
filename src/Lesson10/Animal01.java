package Lesson10;

public abstract class Animal01 {
    protected int speed;
    protected String name;

    public Animal01() {
    }

    public abstract Animal01 setName();
    public abstract Animal01 setSpeed();

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal01{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
