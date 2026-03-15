package mca.report;

public class Student {
    private String name;
    private String roll;

    public Student(){}

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public void set(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }
}