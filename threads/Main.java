public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("Arjun");
        System.out.println(Thread.currentThread().getId());
    }
}