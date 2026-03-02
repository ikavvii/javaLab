import java.util.ArrayList;

public class Main {
    public static void main(String[] args ) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("volvo");
        cars.add("bmw");
        System.out.println(cars.add("ford"));;
        System.out.println(cars);
        
        cars.add(0, "mazda");
        System.out.println(cars);

        System.out.println(cars.get(0));

        cars.set(0, "opel");
        System.out.println(cars);

        System.out.println(cars.remove(0));
        System.out.println(cars.remove("bmw"));
        System.out.println(cars);

        cars.clear();
        System.out.println();
    }
}