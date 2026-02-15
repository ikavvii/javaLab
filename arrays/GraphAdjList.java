import java.util.Scanner;

class GraphAdjList {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int[][] graph;

        System.out.print("Enter number of nodes: ");
        int n = scan.nextInt();
        graph = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("How many neighbors for Node " + i + "? ");
            int degree = scan.nextInt(); 
            
            graph[i] = new int[degree]; 
            
            if (degree > 0) {
                System.out.print("Enter neighbors for Node " + i + ": ");
                for (int j = 0; j < degree; j++) {
                    graph[i][j] = scan.nextInt();
                    if (graph[i][j] < 0 || graph[i][j] >= n) {
                        System.out.println("Invalid neighbor index. Please enter a value between 0 and " + (n - 1));
                        j--; // Decrement j to retry input for this neighbor
                    }
                }
            }
        }

        System.out.println("\nAdjacency List Representation");
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " -> ");
            if (graph[i].length == 0) {
                System.out.print("Disconnected");
            } else {
                for (int neighbor : graph[i]) {
                    System.out.print(neighbor + " ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}