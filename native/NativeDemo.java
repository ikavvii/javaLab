public class NativeDemo {
    // Declare the native method
    public native void sayHello();
    
    // Load the library containing the implementation
    static {
        System.loadLibrary("MyNativeLib");
    }

    public static void main(String[] args) {
        new NativeDemo().sayHello(); // Call the native method
    }
}
