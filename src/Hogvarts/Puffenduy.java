package Hogvarts;

public class Puffenduy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Puffenduy(String name, int power, int distance, int industriousness, int loyalty, int honesty) {
        super(name, power, distance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int allAbility(){
        return industriousness + loyalty + honesty;
    }

    public void comparePuffenduy(Puffenduy puffenduy){
        int abilities1 = allAbility();
        int abilities2 = puffenduy.allAbility();
        System.out.print("По навыкам, присущим студентам факультета Пуффендуй, ");
        if (abilities1 > abilities2) {
            System.out.println(getName() + " лучше чем " + puffenduy.getName());
        } else if (abilities1 == abilities2) {
            System.out.println(getName() + " такой же как " + puffenduy.getName());
        } else { System.out.println(puffenduy.getName() + " лучше чем " + getName()); }
    }
}
