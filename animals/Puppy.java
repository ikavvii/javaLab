package animals;

// Level 3 (Child)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}
