package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println(list.get(1));
        list.set(1, "Durian");
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
