import java.util.Scanner;

class StoreSales {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int[][] sales;

        System.out.print("Enter number of stores: ");
        int numStores = scan.nextInt();
        sales = new int[numStores][];

        for (int i = 0; i < numStores; i++) {
            System.out.print("How many items did Store " + (i + 1) + " sell? ");
            int numItems = scan.nextInt();
            sales[i] = new int[numItems]; 

            System.out.print("Enter sales values for Store " + (i + 1) + ": ");
            for (int j = 0; j < numItems; j++) {
                sales[i][j] = scan.nextInt();
            }
        }

        long maxTotal = -1; 
        int topStoreIndex = -1;

        for (int i = 0; i < sales.length; i++) {
            long storeTotal = 0;
            
            for (int val : sales[i]) {
                storeTotal += val;
            }

            System.out.println("Store " + (i + 1) + " Total: " + storeTotal);

            if (storeTotal > maxTotal) {
                maxTotal = storeTotal;
                topStoreIndex = i;
            }
        }

        if (topStoreIndex != -1) {
            System.out.println("\nTop Performer: Store " + (topStoreIndex + 1) + 
                               " with " + maxTotal + " in sales.");
        } else {
            System.out.println("\nNo sales data entered.");
        }

        scan.close();
    }
}