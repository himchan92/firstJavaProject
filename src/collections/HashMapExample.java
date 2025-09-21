package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Cherry", 20);
        map.put("Durian", 25);

        System.out.println(map.get("Apple"));
        map.remove("Banana");
        System.out.println(map);
        System.out.println(map.containsKey("Cherry"));
        System.out.println(map.containsValue(10));
        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
}
