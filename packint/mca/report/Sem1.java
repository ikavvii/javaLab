package mca.report;

import mca.Header;

public class Sem1 extends Student implements Header {
    public static final int CREDIT1 = 2;
    public static final int CREDIT2 = 4;

    private double sub1;
    private double sub2;

    public Sem1 (double x, double y) {
        sub1 = x; sub2 = y;
    }

    public void printGrades() {
        System.out.println("Student name: " + getName() + "    Roll No: " + getRoll());
        System.out.println("Semester " + getClass().getSimpleName().charAt(3));
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("SGPA: " + String.format("%.2f", SGPA()));
        System.out.println();
    }

    public double SGPA() {
        return (sub1 * CREDIT1 + sub2 * CREDIT2) / (CREDIT1 + CREDIT2);
    }
}