class Vehicle {

    Vehicle() {
        System.out.println("Vehicle Default Constructor");
    }

    Vehicle(String brand) {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {

    Car() {
        super();    // Calling Vehicle()
        System.out.println("Car Default Constructor");
    }

    Car(String brand) {
        super(brand);
        System.out.println("Car Parameterized Constructor");
    }
}

class ElectricCar extends Car {

    ElectricCar(String brand) {
        super(brand);
        System.out.println("Electric Car Constructor");
    }
}

class InheritanceEx {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("Tesla");
    }
}
