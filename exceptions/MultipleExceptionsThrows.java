package exceptions;

public class MultipleExceptionsThrows {

    /**
     * This method performs operations that might fail.
     * @param divisor The number to divide by (could be 0)
     * @param index The array index to access (could be out of bounds)
     * @throws ArithmeticException, ArrayIndexOutOfBoundsException
     */
    public void riskyOperation(int divisor, int index) 
            throws ArithmeticException, ArrayIndexOutOfBoundsException {
        
        int[] numbers = {10, 20, 30};

        // Potential ArithmeticException (if divisor is 0)
        int result = 100 / divisor;
        System.out.println("Division result: " + result);

        // Potential ArrayIndexOutOfBoundsException (if index > 2)
        int value = numbers[index];
        System.out.println("Array value: " + value);
    }

    public static void main(String[] args) {
        MultipleExceptionsThrows example = new MultipleExceptionsThrows();
        
        try {
            example.riskyOperation(1, 3); 
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an error: " + e.getMessage());
        }
    }
}