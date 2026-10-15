package CollectionInterals;


import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 100);
        map.put("Python", 200);
        map.put("Spring", 300);

        System.out.println(map.get("Java"));

        System.out.println(map.containsKey("Python"));
        System.out.println("Java123".hashCode());
        System.out.println("FB".hashCode());

        System.out.println("Ea".hashCode());
    }
}

