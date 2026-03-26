package exceptions;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    private static void method1() throws Exception {
        throw new Exception("This is an exception from method1");
    }

    private static void method2() throws Exception {
        method1();
    }
}