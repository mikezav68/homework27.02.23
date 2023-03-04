package Hogvarts;

public class Kogtevran extends Hogwarts {
private int cleverness;
private int wisdom;
private int wit;
private int talent;

    public Kogtevran(String name, int power, int distance, int cleverness, int wisdom, int wit, int talent) {
        super(name, power, distance);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.talent = talent;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getTalent() {
        return talent;
    }

    public void setTalent(int talent) {
        this.talent = talent;
    }
    private int allAbility(){
        return cleverness + wisdom + wit + talent;
    }

    public void compareKogtevran(Kogtevran kogtevran){
        int abilities1 = allAbility();
        int abilities2 = kogtevran.allAbility();
        System.out.print("По навыкам, присущим студентам факультета Когтевран, ");
        if (abilities1 > abilities2) {
            System.out.println(getName() + " лучше чем " + kogtevran.getName());
        } else if (abilities1 == abilities2) {
            System.out.println(getName() + " такой же как " + kogtevran.getName());
        } else { System.out.println(kogtevran.getName() + " лучше чем " + getName()); }
    }
}
