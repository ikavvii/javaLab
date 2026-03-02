import java.util.ArrayList;

public class GenericDemo<T>  {
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

