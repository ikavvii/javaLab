package exceptions;

public class ThrowThrows {
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    private static void checkNumber(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
    }
}