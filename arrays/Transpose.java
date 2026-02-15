import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}}; // square grid
        System.out.println("Original Matrix:");
        System.out.println(Arrays.deepToString(matrix));

        transpose(matrix);
        System.out.println("Transposed Matrix:");
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            } 
        }
    }
}