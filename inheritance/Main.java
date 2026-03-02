abstract class TwoDShape {
    private String shapeID;
    protected double dim1;
    protected double dim2; 
    private static int shapeCount = 0;

    public TwoDShape(String id, double d1, double d2) {
        this.shapeID = id;
        this.dim1 = d1;
        this.dim2 = d2;
        shapeCount++;
    }

    public static int getShapeCount() { return shapeCount; }

    public void displayInfo() {
        System.out.print("[" + shapeID + "] ");
    }
}

abstract class ThreeDShape {
    private String shapeID;
    protected double d1, d2, d3; 
    private static int shapeCount3D = 0;

    public ThreeDShape(String id, double d1, double d2, double d3) {
        this.shapeID = id;
        this.d1 = d1; this.d2 = d2; this.d3 = d3;
        shapeCount3D++;
    }

    public static int getCount3D() { return shapeCount3D; }

    public void displayInfo() {
        System.out.print("[" + shapeID + "] ");
    }
}

class Circle extends TwoDShape {
    public Circle(String id, double radius) {
        super(id, radius, 0); // dim2 is not needed for circle
    }

    public double calculateArea() { return Math.PI * dim1 * dim1; }

    public void display() {
        super.displayInfo();
        System.out.printf("Circle - Radius: %.1f | Area: %.2f\n", dim1, calculateArea());
    }
}

class Rectangle extends TwoDShape {
    public Rectangle(String id, double length, double width) {
        super(id, length, width);
    }

    public double calculateArea() { return dim1 * dim2; }

    public void display() {
        super.displayInfo();
        System.out.printf("Rectangle - L: %.1f, W: %.1f | Area: %.2f\n", dim1, dim2, calculateArea());
    }
}


class Cylinder extends ThreeDShape {
    public Cylinder(String id, double radius, double height) {
        super(id, radius, 0, height); // d1=radius, d3=height
    }

    public double calculateSurfaceArea() {
        return 2 * Math.PI * d1 * (d1 + d3);
    }

    public double calculateVolume() { return Math.PI * d1 * d1 * d3; }

    public void display() {
        super.displayInfo();
        System.out.printf("Cylinder - R: %.1f, H: %.1f | Surface Area: %.2f, Volume: %.2f\n", d1, d3, calculateSurfaceArea(), calculateVolume());
    }
}

class Box extends ThreeDShape {
    public Box(String id, double l, double w, double h) {
        super(id, l, w, h);
    }

    public double calculateSurfaceArea() {
        return 2 * (d1 * d2 + d1 * d3 + d2 * d3);
    }

    public double calculateVolume() { return d1 * d2 * d3; }

    public void display() {
        super.displayInfo();
        System.out.printf("Box - L: %.1f, W: %.1f, H: %.1f | Surface Area: %.2f, Volume: %.2f\n", d1, d2, d3, calculateSurfaceArea(), calculateVolume());
    }
}

public class Main {
    public static void main(String[] args) {
        TwoDShape[] shapes2D = {
            new Circle("C1", 5.0),
            new Rectangle("R1", 4.0, 6.0)
        };

        System.out.println("\nTotal 2D Shapes: " + TwoDShape.getShapeCount());
        for (TwoDShape s : shapes2D) {
            if (s instanceof Circle) ((Circle)s).display();
            if (s instanceof Rectangle) ((Rectangle)s).display();
        }

        ThreeDShape[] shapes3D = {
            new Cylinder("CY1", 3.0, 10.0),
            new Box("B1", 2.0, 3.0, 4.0)
        };

        System.out.println("\nTotal 3D Shapes: " + ThreeDShape.getCount3D());
        for (ThreeDShape s : shapes3D) {
            if (s instanceof Cylinder) ((Cylinder)s).display();
            if (s instanceof Box) ((Box)s).display();
        }
    }
}
