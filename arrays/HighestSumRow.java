public class HighestSumRow {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 10, 20}
        };

        int highestSumRowIndex = findHighestSumRow(arr);
        System.out.println("The row with the highest sum is: " + highestSumRowIndex);
    }

    private static int findHighestSumRow(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int currentRowSum = 0;
            for (int value : arr[i]) {
                currentRowSum += value;
            }
            if (currentRowSum > maxSum) {
                maxSum = currentRowSum;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }
}