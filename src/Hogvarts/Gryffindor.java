package Hogvarts;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name, int power, int distance, int nobility, int honor, int bravery) {
        super(name, power, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int allAbility(){
        return nobility + honor + bravery;
    }
    public void compareGryffindor(Gryffindor gryffindor){
        int abilities1 = allAbility();
        int abilities2 = gryffindor.allAbility();
        System.out.print("По навыкам, присущим студентам факультета Гриффиндор, ");
        if (abilities1 > abilities2) {
            System.out.println(getName() + " лучше чем " + gryffindor.getName());
        } else if (abilities1 == abilities2) {
            System.out.println(getName() + " такой же как " + gryffindor.getName());
        } else { System.out.println(gryffindor.getName() + " лучше чем " + getName()); }
    }
}
