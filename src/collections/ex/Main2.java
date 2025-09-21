package collections.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("홍길동");
        students.add("김길벗");
        students.add("이코천");
        students.add("홍길동");
        System.out.println(students);
        HashSet<String> set = new HashSet<>();
        set.addAll(students);
        set.add("강남순");
        System.out.println(set);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("홍길동", 85);
        map.put("김길벗", 92);
        map.put("이코천", 78);
        map.put("강남순", 90);
        if(map.containsKey("홍길동")) {
            System.out.println(map.get("홍길동"));
        }
    }
}
