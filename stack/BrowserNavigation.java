import java.util.Scanner;
import java.util.Stack;

public class BrowserApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // change type here (String, Integer, etc.)
        Browser<String> browser = new Browser<>("Home");

        StatusThread<String> status = new StatusThread<>(browser);
        status.setDaemon(true);
        status.start();

        int choice;

        do {
            System.out.println("\n===== Browser Menu =====");
            System.out.println("Current Page: " + browser.getCurrent());
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Peek Current");
            System.out.println("5. Exit");

            status.setUserTyping(true);
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            status.setUserTyping(false);

            switch (choice) {

                case 1:
                    System.out.print("Enter page: ");
                    String page = sc.nextLine();
                    browser.visit(page);
                    break;

                case 2:
                    if (browser.goBack() != null) {
                        System.out.println("Went back to: " + browser.getCurrent());
                    } else {
                        System.out.println("No back history.");
                    }
                    break;

                case 3:
                    if (browser.goForward() != null) {
                        System.out.println("Went forward to: " + browser.getCurrent());
                    } else {
                        System.out.println("No forward history.");
                    }
                    break;

                case 4:
                    System.out.println("Current: " + browser.getCurrent());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}


class Browser<T> {
    private Stack<T> backStack = new Stack<>();
    private Stack<T> forwardStack = new Stack<>();
    private T current;

    public Browser(T home) {
        this.current = home;
    }

    public void visit(T page) {
        backStack.push(current);
        current = page;
        forwardStack.clear();
    }

    public T goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(current);
            current = backStack.pop();
            return current;
        }
        return null;
    }

    public T goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(current);
            current = forwardStack.pop();
            return current;
        }
        return null;
    }

    public T getCurrent() {
        return current;
    }

    public int backSize() {
        return backStack.size();
    }

    public int forwardSize() {
        return forwardStack.size();
    }

    public Stack<T> getBackStack() {
        return backStack;
    }

    public Stack<T> getForwardStack() {
        return forwardStack;
    }
}

class StatusThread<T> extends Thread {
    private Browser<T> browser;
    private volatile boolean isUserTyping = false;

    public StatusThread(Browser<T> browser) {
        this.browser = browser;
    }

    public void setUserTyping(boolean typing) {
        this.isUserTyping = typing;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(5000);

                if (!isUserTyping) {
                    System.out.println("\n[Status] Back: " + browser.backSize()
                            + " | Forward: " + browser.forwardSize());
                    System.out.print("Enter choice/page: ");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("[Status Thread Stopped]");
        }
    }
}

