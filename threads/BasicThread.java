public class BasicThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);

        t.setName("My main");
        System.out.println(t);

        try {
            for (int n = 5; n > 0; n--) {
                Thread.sleep(2000);
                Thread.currentThread().interrupt();
                System.out.println(n);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}