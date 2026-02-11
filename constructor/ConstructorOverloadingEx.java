class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Student(String name) {
        this.name = name;
        System.out.println("Constructor with Name Called");
    }

    // Overloaded Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with Name and Age Called");
    }
}

class ConstructorOverloadingEx {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Arun");
        Student s3 = new Student("Bala", 20);
    }
}
