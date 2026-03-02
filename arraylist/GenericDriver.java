import java.util.ArrayList;

class GenericDemo<T>  {
    public ArrayList<T> list;

    GenericDemo(T... values) {
        list = new ArrayList<>();
        for (T value : values) {
            list.add(value);
        }
    }

    public boolean search(T val) {
        return list.contains(val);
    }
}




public class GenericDriver {
    public static void main(String[] args) {
        GenericDemo<Integer> list1 = new GenericDemo<>(1, 2, 3, 4, 5);
        System.out.println(list1.search(0));
        System.out.println(list1.search(2));

        GenericDemo<Float> list2 = new GenericDemo<>(1.0f, 1.1f, 1.2f, 1.4f);
        System.out.println(list2.search(1.1f));
    }
}