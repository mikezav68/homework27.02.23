package Hogvarts;

public class Main {
    public static void main(String[] args) {
        Gryffindor gryffindors[] = {
                new Gryffindor("HarryPotter", 100, 50, 60, 57, 33),
                new Gryffindor("GermionaGranger", 60, 25, 34, 76, 64),
                new Gryffindor("RonWeasley", 44, 53, 78, 23, 69)};
        Puffenduy puffenduys[] = {
                new Puffenduy("ZahariaSmith", 35, 60, 56, 11, 89),
                new Puffenduy("CedricDigorry", 58, 78, 96, 65, 45),
                new Puffenduy("JustinFinch-Fletchley", 49, 32, 17, 94, 83)};
        Kogtevran kogtevrans[] = {
                new Kogtevran("ChoChang", 34, 42, 57, 48, 36, 71),
                new Kogtevran("PadmaPatil", 45, 43, 58, 69, 54, 87),
                new Kogtevran("MarcusBelby", 55, 65, 52, 39, 49, 38)};
        Slizerin slizerins[] = {
                new Slizerin("DracoMalfoy", 22, 54, 61, 43, 45, 66, 77),
                new Slizerin("GrahamMontague", 33, 64, 54, 65, 49, 87, 49),
                new Slizerin("GregoryGoyle", 52, 68, 45, 55, 65, 54, 64)};

        PrintService printService = new PrintService();
        printService.printStudents(gryffindors);
        printService.printStudents(puffenduys);
        printService.printStudents(kogtevrans);
        printService.printStudents(slizerins);
    }
}