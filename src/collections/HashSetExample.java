package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);

        fruits.add("Apple"); //중복제거
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Banana"));
        System.out.println(fruits.isEmpty());
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        fruits.clear();
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
    }
}
