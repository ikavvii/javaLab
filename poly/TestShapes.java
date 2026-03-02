public class TestShapes {
    public static void main(String[] args) {
        Shapes[] shapeList = new Shapes[3];
        shapeList[0] = new Circle("C1", "Green", 2.5);
        shapeList[1] = new Cuboid("Container1", "Grey", 10, 5, 5);
        shapeList[2] = new Circle("Container2", "Yellow", 10.0);

        for (int i = 0; i < shapeList.length; i++) {
            System.out.println("Item " + (i + 1));
            shapeList[i].displayInfo();
            System.out.println();
        }
    }
}