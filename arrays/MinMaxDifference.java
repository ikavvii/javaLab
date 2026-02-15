public class MinMaxDifference {
    public static void main(String[] args) {
        int[] arr = {22, 18, 25, 30, 15, 21, 28};

        int[] minMax = minMax(arr, 0, arr.length - 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int difference = minMax[0] - minMax[1];
        System.out.println("Difference between max and min: " + difference);
    }

    private static int[] minMax(int[] arr, int i, int j, int max, int min) {
        if (i == j) {
            max = arr[i]; min = arr[i];
            return new int[]{max, min};
        } else if (i == j - 1) {
            if (arr[i] < arr[j]) {
                max = arr[j]; min = arr[i];
            } else {
                max = arr[i]; min = arr[j];
            }
        } else {
            int mid = i + (j - i) / 2;
            int[] leftMinMax = minMax(arr, i, mid, max, min);
            int[] rightMinMax = minMax(arr, mid + 1, j, max, min);

            max = Math.max(leftMinMax[0], rightMinMax[0]);
            min = Math.min(leftMinMax[1], rightMinMax[1]);
        }
        return new int[]{max, min};
    }
}