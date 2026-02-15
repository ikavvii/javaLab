public class CountZeros {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1},
            {0, 0, 1},
            {1, 1, 0}
        };

        int zeroCount = countZeros(matrix);
        System.out.println("Number of zeros in the matrix: " + zeroCount);
    }

    private static int countZeros(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}