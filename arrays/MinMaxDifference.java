public class MinMaxDifference {
    public static void main(String[] args) {
        int[] arr = { 22, 18, 25, 30, 15, 21, 28 };

        int[] minMax = minMax(arr, 0, arr.length - 1);
        int difference = minMax[0] - minMax[1];
        System.out.println("Difference between max and min: " + difference);
    }

    private static int[] minMax(int[] arr, int i, int j) {
        if (i == j) {
            return new int[] { arr[i], arr[i] };
        } else if (i == j - 1) {
            return new int[] { Math.max(arr[i], arr[j]), Math.min(arr[i], arr[j]) };
        }

        int mid = i + (j - i) / 2;
        int[] leftMinMax = minMax(arr, i, mid);
        int[] rightMinMax = minMax(arr, mid + 1, j);

        return new int[] {
                Math.max(leftMinMax[0], rightMinMax[0]),
                Math.min(leftMinMax[1], rightMinMax[1])
        };
    }
}