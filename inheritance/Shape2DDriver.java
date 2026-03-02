class TwoDShape {
    private String shapeId;
    protected double dimension; 
    private static int shapeCount = 0;

    public TwoDShape(String shapeId, double dimension) {
        this.shapeId = shapeId;
        this.dimension = dimension;
        shapeCount++;
    }

    public void display() {
        System.out.println("Shape ID: " + shapeId);
        System.out.println("Dimension: " + dimension);
    }

    public static int getShapeCount() {
        return shapeCount;
    }
}

class Circle extends TwoDShape {
    public Circle(String shapeId, double radius) {
        super(shapeId, radius); 
    }

    public double calculateArea() {
        return Math.PI * dimension * dimension; 
    }

    @Override
    public void display() {
        System.out.println("Circle Details");
        super.display(); 
        System.out.printf("Area: %.2f sq units\n", calculateArea());
    }
}

public class Shape2DDriver {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        
        circles[0] = new Circle("C-101", 5.5);
        circles[1] = new Circle("C-102", 7.0);
        circles[2] = new Circle("C-103", 10.2);

        for (Circle circle : circles) {
            circle.display();
            System.out.println();
        }

        System.out.println("Total 2D Shapes created: " + TwoDShape.getShapeCount());
    }
}