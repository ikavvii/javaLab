package mca;

public interface Header {
    default void headPrint() {
        System.out.println("PSG COLLEGE OF TECHNOLOGY");
        System.out.println("MCA DEGREE PROGRAMME");
        System.out.println("Mark Statement    Academic Year 2025-26");
        System.out.println();
    }

    void printGrades();
}