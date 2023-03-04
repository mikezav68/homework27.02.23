package Hogvarts;

public abstract class Hogwarts {
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
    public void compareHogwarts(Hogwarts hogwarts){
        System.out.print("По силе магии ");
        if (getPower() > hogwarts.getPower()) {
            System.out.println(getName() + " лучше чем " + hogwarts.getName());
        } else if (getPower() == hogwarts.getPower()) {
            System.out.println(getName() + " такой же как " + hogwarts.getName());
        } else { System.out.println(hogwarts.getName() + " лучше чем " + getName()); }
        System.out.print("По расстоянию трансгрессии ");
        if (getDistance() > hogwarts.getDistance()) {
            System.out.println(getName() + " лучше чем " + hogwarts.getName());
        } else if (getDistance() == hogwarts.getDistance()) {
            System.out.println(getName() + " такой же как " + hogwarts.getName());
        } else { System.out.println(hogwarts.getName() + " лучше чем " + getName()); }
    }
}
