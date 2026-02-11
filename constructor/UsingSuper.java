class Animal {
    String type;
    // Animal(){}
    Animal(String type) {
        this.type = type;
        System.out.println("Animal Type: " + type);
    }
}

class Dog extends Animal {
    // Dog() {}
    Dog(String type) {
        super(type);   // Calling parent constructor
        System.out.println("Dog Constructor");
    }
}

class Puppy extends Dog {
    Puppy(String type) {
        super(type);
        System.out.println("Puppy Constructor");
    }
}

class UsingSuper {
    public static void main(String[] args) {
        Puppy p = new Puppy("Mammal");
    }
}

