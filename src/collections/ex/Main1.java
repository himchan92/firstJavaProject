package collections.ex;

import java.util.HashSet;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println(numbers.size());
        if(numbers.contains(3)) {
            System.out.println("3 포함되어있음");
        }
        else {
            System.out.println("3 없음");
        }

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        numbers.clear();
        System.out.println(numbers.isEmpty());
    }
}
