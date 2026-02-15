import java.util.Arrays;
import java.util.Scanner;

class Student {
    private String name;
    private long[] marks;
    private int total;
    private float percentage;

    private static int count = 0;

    Student(String name, long[] marks) {
        this.name = name;
        this.marks = marks;
        count++;
    }

    public void manipulateMarks() {
        total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        percentage = (float) total / marks.length;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        System.out.println(Arrays.toString(marks));
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }

    public static int getCount() {
        return count;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter the number of subjects: ");
            int m = sc.nextInt();
            long[] marks = new long[m];
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            for (int j = 0; j < m; j++) {
                marks[j] = sc.nextLong();
            }
            students[i] = new Student(name, marks);
        }

        for (Student student : students) {
            student.manipulateMarks();
            student.display();
        }

        System.out.println("Total number of students: " + Student.getCount());
        sc.close();
    }
}