class A {
    static String name;
    void disp() {
        System.out.println("P: " + name);
    }
    static void set (String arg) {
        name = new String(arg);
    }
    A(String arg) {
        set(arg);
    }
    // A() {}
}

class B extends A {
    void disp() {
        System.out.println("C: " + name);
    }
    static void set (String arg) {
        name = new String(arg);
    }
    B(String arg) {
        super(arg); 
        // super();
        // set(arg);
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A("Object 1");
        a.disp();
        A b = new B("Object 2");
        b.disp();
    }
}