
class Battery {
    int capacity;
    int health;

    Battery(int capacity, int health) {
        this.capacity = capacity;
        this.health = health;
    }
}

class Processor {
    String brand;
    float speed;

    Processor(String brand, float speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Keyboard {
    String type;
    Keyboard(String type) {
        this.type = type;
    }
}

class Display {
    float size;
    String resolution;
    Display(float size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }
}

public class Laptop {
    Battery battery;
    Processor processor;
    Keyboard keyboard;
    Display display;

    public Laptop(int batteryCapacity, int batteryHealth, String processorBrand, float processorSpeed, String keyboardType, float displaySize, String displayResolution) {
        battery = new Battery(batteryCapacity, batteryHealth);
        processor = new Processor(processorBrand, processorSpeed);
        keyboard = new Keyboard(keyboardType);
        display = new Display(displaySize, displayResolution);
    }

    public String toString() {
        return "Laptop [Battery: capacity=" + battery.capacity + ", health=" + battery.health +
                "; Processor: brand=" + processor.brand + ", speed=" + processor.speed +
                "; Keyboard: type=" + keyboard.type +
                "; Display: size=" + display.size + ", resolution=" + display.resolution + "]\n";
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop(5000, 95, "Intel", 2.5f, "Membrane", 15.6f, "1920x1080");
        System.out.println(laptop);

        int n = 5;
        Laptop[] laptops = new Laptop[n];
        for (int i = 0; i < n; i++) {
            laptops[i] = new Laptop(5000 + i * 1000, 90 + i, "Intel", 2.5f + i * 0.5f, "Mechanical", 15.6f + i, "1920x1080");
            System.out.println(laptops[i]);
        } 
    }
}