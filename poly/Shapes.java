class Shapes {
    protected String color;
    protected String name;
    protected int sno;
    private static int count;

    Shapes(String n, String c) {
        color = c;
        name = n;
        sno = ++count;
    }

    public void displayInfo() 
    {
        System.out.println("S. no: " + sno);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public static int countInfo() {
        return count;
    }
}


abstract class TwoDShapes extends Shapes {
    protected double dim1, dim2;

    TwoDShapes(String n, String c, double d1, double d2) {
        super(n, c);
        dim1 = d1;
        dim2 = d2;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dim1: " + dim1);
        System.out.println("Dim2: " + dim2);
    }
    public abstract double getArea();
}

abstract class ThreeDShapes extends Shapes {
    protected double length;
    protected double width;
    protected double height;

    ThreeDShapes(String n, String c, double l, double w, double h) {
        super(n, c);
        length = l; width = w; height = h;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public abstract double getVolume();
}

class Circle extends TwoDShapes {

    public Circle(String n, String c, double radius) {
        super(n, c, radius, 0);
    }

    public void displayInfo() {
        System.out.println("S. no: " + sno);
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Radius: " + dim1);
    }
    public double getArea() {
        return Math.PI * dim1 * dim1;
    }
}

class Cuboid extends ThreeDShapes {
    public Cuboid (String n, String c, double l, double w, double h) {
        super(n, c, l, w, h);
    }

    public double getVolume() {
        return length * width * height;
    }
}
