package Hogvarts;

public class Main {

    public static void main(String[] args) {
        Gryffindor gryffindor[] = {
                new Gryffindor("Harry Potter", 100, 50, 60, 57, 33),
                new Gryffindor("Germiona Granger", 60, 25, 34, 76, 64),
                new Gryffindor("Ron Weasley", 44, 53, 78, 23, 69)};
        Puffenduy puffenduy[] = {
                new Puffenduy("Zaharia Smith", 35, 60, 56, 11, 89),
                new Puffenduy("Cedric Digorry", 58, 78, 96, 65, 45),
                new Puffenduy("Justin Finch-Fletchley", 49, 32, 17, 94, 83)};
        Kogtevran kogtevran[] = {
                new Kogtevran("Cho Chang", 34, 42, 57, 48, 36, 71),
                new Kogtevran("Padma Patil", 45, 43, 58, 69, 54, 87),
                new Kogtevran("Marcus Belby", 55, 65, 52, 39, 49, 38)};
        Slizerin slizerin[] = {
                new Slizerin("Draco Malfoy", 22, 54, 61, 43, 45, 66, 77),
                new Slizerin("Graham Montague", 33, 64, 54, 65, 49, 87, 49),
                new Slizerin("Gregory Goyle", 52, 28, 45, 55, 65, 54, 64)};

        // пример вывода описания студента:
        printStudent(kogtevran[1]);
        // пример сравнения любых студентов по базовым навыкам:
        kogtevran[1].compareHogwarts(slizerin[2]);
        // пример сравнения студентов одного факультета:
        gryffindor[0].compareGryffindor(gryffindor[2]);
    }
    // перегрузка метода вывода описания студента:
    public static void printStudent(Gryffindor gryffindor) {
        System.out.println("Студент факультета Гриффиндор " + gryffindor.getName() +
                ", магия " + gryffindor.getPower() + ", трансгрессия " + gryffindor.getDistance() +
                ", благородство " + gryffindor.getNobility() + ", честь " + gryffindor.getHonor() +
                ", храбрость " + gryffindor.getBravery());
    }

    public static void printStudent(Puffenduy puffenduy) {
        System.out.println("Студент факультета Пуффендуй " + puffenduy.getName() +
                ", магия " + puffenduy.getPower() + ", трансгрессия " + puffenduy.getDistance() +
                ", трудолюбие " + puffenduy.getIndustriousness() + ", верность " + puffenduy.getLoyalty() +
                ", честность " + puffenduy.getHonesty());
    }

    public static void printStudent(Kogtevran kogtevran) {
        System.out.println("Студент факультета Когтевран " + kogtevran.getName() +
                ", магия " + kogtevran.getPower() + ", трансгрессия " + kogtevran.getDistance() +
                ", ум " + kogtevran.getCleverness() + ", мудрость " + kogtevran.getWisdom() +
                ", остроумие "+ kogtevran.getWit() + ", талант " + kogtevran.getTalent());
    }

    public static void printStudent(Slizerin slizerin) {
        System.out.println("Студент факультета Слизерин " + slizerin.getName() +
                ", магия " + slizerin.getPower() + ", трансгрессия" + slizerin.getDistance() +
                ", хитрость " + slizerin.getCunning() + ", решительность " + slizerin.getDetermination() +
                ", амбициозность " + slizerin.getAmbition() + ", находчивость " + slizerin.getResourcefulness() +
                ", властность " + slizerin.getAuthority());
    }
}