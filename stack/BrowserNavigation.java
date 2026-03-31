import java.util.Scanner;
import java.util.Stack;

public class BrowserNavigation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        // // Start background thread
        // StatusThread status = new StatusThread(backStack, forwardStack);
        // status.setDaemon(true);
        // status.start();

        String currentPage = "Home";
        int choice;

        do {
            System.out.println("\n*** Browser Menu ***");
            System.out.println("Current Page: " + currentPage);
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Peek Current Page");
            System.out.println("5. Show Back History");
            System.out.println("6. Show Forward History");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String newPage = sc.nextLine();

                    backStack.push(currentPage);   // save current
                    currentPage = newPage;

                    forwardStack.clear();
                    System.out.println("Visited: " + newPage);
                    break;

                case 2:
                    if (!backStack.isEmpty()) {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Went Back to: " + currentPage);
                    } else {
                        System.out.println("No pages to go back.");
                    }
                    break;

                case 3:
                    if (!forwardStack.isEmpty()) {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("Went Forward to: " + currentPage);
                    } else {
                        System.out.println("No pages to go forward.");
                    }
                    break;

                case 4:
                    System.out.println("Current Page: " + currentPage);
                    break;

                case 5:
                    System.out.println("Back History:");
                    if (backStack.isEmpty()) {
                        System.out.println("Empty");
                    } else {
                        for (int i = backStack.size() - 1; i >= 0; i--) {
                            System.out.println(backStack.get(i));
                        }
                    }
                    break;

                case 6:
                    System.out.println("Forward History:");
                    if (forwardStack.isEmpty()) {
                        System.out.println("Empty");
                    } else {
                        for (int i = forwardStack.size() - 1; i >= 0; i--) {
                            System.out.println(forwardStack.get(i));
                        }
                    }
                    break;

                case 7:
                    System.out.println("Exiting Browser...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}


// Background thread to show status
class StatusThread extends Thread {
    private Stack<String> backStack;
    private Stack<String> forwardStack;

    public StatusThread(Stack<String> back, Stack<String> forward) {
        this.backStack = back;
        this.forwardStack = forward;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(7000);
                System.out.println("\n[Status] Back: " + backStack.size() +
                        " | Forward: " + forwardStack.size());
            }
        } catch (InterruptedException e) {
            System.out.println("[Status Thread Stopped]");
        }
    }
}
