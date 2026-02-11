class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog Constructor");
    }
}

class Puppy extends Dog {

    Puppy() {
        System.out.println("Puppy Constructor");
    }
}

class ThreeLevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
    }
}
