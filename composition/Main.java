class Battery {
    int capacity;
    Battery(int capacity) { this.capacity = capacity; }
}

class Processor {
    String brand;
    Processor(String brand) { this.brand = brand; }
}

class Laptop {
    Battery battery;
    Processor processor;

    public Laptop(Battery battery, Processor processor) {
        this.battery = battery;
        this.processor = processor;
    }

    public void showSpecs() {
        System.out.println("Laptop with " + processor.brand + " and " + battery.capacity + "mAh");
    }
}

class LaptopIoCContainer {
    // This class acts as the "Container" 
    // It manages the creation and  of objects.
    public static Laptop getLaptop(String type) {
        if (type.equalsIgnoreCase("Gaming")) {
            // The container decides what goes inside
            return new Laptop(new Battery(9000), new Processor("AMD Ryzen 9"));
        } else {
            return new Laptop(new Battery(4000), new Processor("Intel i3"));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = LaptopIoCContainer.getLaptop("Gaming");
        myLaptop.showSpecs();
    }
}