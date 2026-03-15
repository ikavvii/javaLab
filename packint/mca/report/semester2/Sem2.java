package mca.report.semester2; 

import mca.Header;          
import mca.report.Student;

public class Sem2 extends Student implements Header {
    public static final int CREDIT3 = 3;
    public static final int CREDIT4 = 4;

    private double sub3;
    private double sub4;

    public Sem2 (double x, double y) {
        sub3 = x; sub4 = y;
    }

    public void printGrades() {
        System.out.println("Student name: " + getName() + "    Roll No: " + getRoll());
        System.out.println("Semester " + getClass().getSimpleName().charAt(3));
        System.out.println("Subject 3: " + sub3);
        System.out.println("Subject 4: " + sub4);
        System.out.println("SGPA: " + String.format("%.2f",  SGPA()));
        System.out.println();
    }

    double SGPA() {
        return (sub3 * CREDIT3 + sub4 * CREDIT4) / (CREDIT3 + CREDIT4);
    }

    public double CGPA(double sem1SGPA) {
        return (SGPA() + sem1SGPA) / 2;
    }
}