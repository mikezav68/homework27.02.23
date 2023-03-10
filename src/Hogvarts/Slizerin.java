package Hogvarts;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;
    public Slizerin(String name, int power, int distance, int cunning,
                    int determination, int ambition, int resourcefulness, int authority) {
        super(name, power, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
    private int allAbility(){
        return cunning + determination + ambition + resourcefulness + authority;
    }

    public void compareSlizerin(Slizerin slizerin){
        int abilities1 = allAbility();
        int abilities2 = slizerin.allAbility();
        System.out.print("По навыкам, присущим студентам факультета Слизерин, ");
        if (abilities1 > abilities2) {
            System.out.println(getName() + " лучше чем " + slizerin.getName());
        } else if (abilities1 == abilities2) {
            System.out.println(getName() + " такой же как " + slizerin.getName());
        } else { System.out.println(slizerin.getName() + " лучше чем " + getName()); }
    }
}
