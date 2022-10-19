package Lesson10;

public abstract class Animal01 {
    protected int speed;
    protected String name;

    public Animal01() {
    }

    public abstract int getSpeed();

    public abstract String getName();

    @Override
    public String toString() {
        return "Animal01{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
