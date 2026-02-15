import java.util.*;

class StudentMarks {
    public static void main(String[] a) {
        // allocate, input, calculate
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of subjects for student " + (i + 1) + ": ");
            int m = sc.nextInt();
            marks[i] = new int[m];
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            for (int j = 0; j < m; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            double average = (double) sum / marks[i].length;
            System.out.println("Student " + (i + 1) + " Total= " + sum + " Average= " + String.format("%.2f", average));
        }

    }
}