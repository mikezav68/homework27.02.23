package Hogvarts;

public class PrintService {
    public void printStudents(Gryffindor[] gryffindors) {
        System.out.println("Список студентов Гриффиндора:");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor student = gryffindors[i];
            System.out.println(student.getName() + ", " + student.getPower() + ", " + student.getDistance() + ", " +
                    student.getNobility() + ", " + student.getHonor() + ", " + student.getBravery());
        }
    }
    public void printStudents(Puffenduy[] puffenduys) {
        System.out.println("Список студентов Пуффендуя:");
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy student = puffenduys[i];
            System.out.println(student.getName() + ", " + student.getPower() + ", " + student.getDistance() + ", " +
                    student.getIndustriousness() + ", " + student.getLoyalty() + ", " + student.getHonesty());
        }
    }
    public void printStudents(Kogtevran[] kogtevrans) {
        System.out.println("Список студентов Когтеврана:");
        for (int i = 0; i < kogtevrans.length; i++) {
           Kogtevran student = kogtevrans[i];
            System.out.println(student.getName() + ", " + student.getPower() + ", " + student.getDistance() + ", " +
                    student.getCleverness() + ", " + student.getWisdom() + ", "+ student.getWit() + ", " + student.getTalent());
        }
    }
    public void printStudents(Slizerin[] slizerins) {
        System.out.println("Список студентов Слизерина:");
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin student = slizerins[i];
            System.out.println(student.getName() + ", " + student.getPower() + ", " + student.getDistance() + ", " + student.getCunning() + ", " +
                    student.getDetermination() + ", " + student.getAmbition() + ", " + student.getResourcefulness() + ", " + student.getAuthority());
        }
    }
}
