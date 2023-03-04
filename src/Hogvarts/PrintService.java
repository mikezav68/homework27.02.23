package Hogvarts;

public class PrintService {
    public void printStudent(Gryffindor gryffindor) {
        System.out.println(gryffindor.getName() + ", " + gryffindor.getPower() + ", " + gryffindor.getDistance() + ", " +
                    gryffindor.getNobility() + ", " + gryffindor.getHonor() + ", " + gryffindor.getBravery());
    }
    public void printStudent(Puffenduy puffenduy) {
        System.out.println(puffenduy.getName() + ", " + puffenduy.getPower() + ", " + puffenduy.getDistance() + ", " +
                    puffenduy.getIndustriousness() + ", " + puffenduy.getLoyalty() + ", " + puffenduy.getHonesty());
    }
    public void printStudent(Kogtevran kogtevran) {
        System.out.println(kogtevran.getName() + ", " + kogtevran.getPower() + ", " + kogtevran.getDistance() + ", " +
                    kogtevran.getCleverness() + ", " + kogtevran.getWisdom() + ", "+ kogtevran.getWit() + ", " + kogtevran.getTalent());
    }
    public void printStudent(Slizerin slizerin) {
        System.out.println(slizerin.getName() + ", " + slizerin.getPower() + ", " + slizerin.getDistance() + ", " + slizerin.getCunning() + ", " +
                    slizerin.getDetermination() + ", " + slizerin.getAmbition() + ", " + slizerin.getResourcefulness() + ", " + slizerin.getAuthority());
    }
}
