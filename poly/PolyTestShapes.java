public class PolyTestShapes {
    public static void main(String[] args) {
        Shapes[] mixedShapes = {
            new Circle("Bubble", "Clear", 1.2),
            new Cuboid("Brick", "Red", 4, 2, 1),
            new Circle("Disk", "Silver", 3.0)
        };

        for (Shapes s : mixedShapes) {
            s.displayInfo();

            if (s instanceof TwoDShapes) {
                System.out.println("Area: " + ((TwoDShapes) s).getArea());
            } else if (s instanceof ThreeDShapes) {
                System.out.println("Volume: " + ((ThreeDShapes) s).getVolume());
            }
            System.out.println();
        }  
    }
}