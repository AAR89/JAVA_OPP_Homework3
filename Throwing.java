package JAVA_OPP_Homework3;

public abstract class Throwing implements Weapon {
    private final int distance;

    public Throwing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Throwing{" +
                "distance = " + distance +
                "damage = " + damage() +
                '}';
    }
}