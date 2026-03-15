package mca;

import mca.report.Sem1;
import mca.report.semester2.Sem2;

public class Main {
    public static void main(String[] args) {
        Sem1 sem1 = new Sem1(8.5, 9.0);
        sem1.set("Kavin", "25MX114");
        double sem1SGPA = sem1.SGPA();

        Sem2 sem2 = new Sem2(9.0, 8.0);
        sem2.set("Kavin", "25MX114");

        sem2.headPrint();
        sem1.printGrades();
        sem2.printGrades();
        System.out.println("CGPA: " +  String.format("%.2f", sem2.CGPA(sem1SGPA)));
    }
}