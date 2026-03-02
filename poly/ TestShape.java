class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle("C1", "red", 5.0);
        circle.displayInfo();
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));

        System.out.println();

        Cuboid cube = new Cuboid("CB1", "blue", 3.0, 4.0, 5.0);
        cube.displayInfo();
        System.out.println("Volume: " + String.format("%.2f", cube.getVolume()));
        
        System.out.println("\nTotal Shapes: " + Shapes.countInfo());
    }
}