// Parent Class
class ThreeDShape {
    private String shapeId;
    
    protected double radius;
    protected double height;
    
    private static int shapeCount = 0;

    public ThreeDShape(String shapeId, double radius, double height) {
        this.shapeId = shapeId;
        this.radius = radius;
        this.height = height;
        shapeCount++;
    }

    public void displayDimensions() {
        System.out.println("Shape ID: " + shapeId);
        System.out.println("Radius: " + radius + ", Height: " + height);
    }

    public static int getShapeCount() {
        return shapeCount;
    }
}

class Cylinder extends ThreeDShape {

    public Cylinder(String shapeId, double radius, double height) {
        super(shapeId, radius, height);
    }

    public double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    public void displayDetails() {
        System.out.println("Cylinder Details");
        super.displayDimensions(); 
        System.out.printf("Surface Area: %.2f sq units\n", calculateSurfaceArea());
        System.out.printf("Volume: %.2f cubic units\n", calculateVolume());
    }
}

public class Shape3DDriver {
    public static void main(String[] args) {
        Cylinder[] cylinders = new Cylinder[2];
        
        cylinders[0] = new Cylinder("CYL-01", 3.0, 5.0);
        cylinders[1] = new Cylinder("CYL-02", 4.5, 8.2);

        for (Cylinder cylinder : cylinders) {
            cylinder.displayDetails();
            System.out.println();
        }

        System.out.println("Total 3D Shapes created: " + ThreeDShape.getShapeCount());
    }
}