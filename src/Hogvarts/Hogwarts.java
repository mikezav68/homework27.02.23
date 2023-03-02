package Hogvarts;

public class Hogwarts {
    private String name;
    private int power;
    private int distance;

    public Hogwarts(String name, int power, int distance) {
        this.name = name;
        this.power = power;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
