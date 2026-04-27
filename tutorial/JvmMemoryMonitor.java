public class JvmMemoryMonitor {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());

        // Current total memory allocated to the JVM
        long totalMemory = runtime.totalMemory();

        // Free memory within that allocated total
        long freeMemory = runtime.freeMemory();

        // Max memory the JVM can potentially use (-Xmx)
        long maxMemory = runtime.maxMemory();

        // Actual used memory (Total - Free)
        long usedMemory = totalMemory - freeMemory;


        System.out.println(maxMemory);
        System.out.println(totalMemory);
        System.out.println(freeMemory);
        System.out.println(usedMemory);

        System.out.println(runtime.getClass());
        System.out.println(Runtime.version());
        System.out.println(runtime.toString());
        System.gc();
        System.out.println("Hi");
        runtime.exit(1);
    }
}