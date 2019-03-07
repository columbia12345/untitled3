package map;

import java.util.*;

public class MapSet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); //范型括号里面前后可以自己写任何类型
        map.put("Tom",10);  map.put("Ben",9);
        map.put("Jerry",9);  map.put("Tom",5);
        map.get("Tom");
        System.out.println(map.get("Tom"));

        java.util.Set<String> keys = map.keySet();
        //keys.add("zzzz");

/*        Set<String> keys1 = new HashSet<>();

        for(String key : keys)
            keys1.add(key);
        keys1.add("sss");*/




        for(String key : map.keySet()){
            System.out.printf("%-5s:%-3d", key, map.get(key));
        }

        System.out.println();

        map.forEach((k, v) -> System.out.printf("%-5s:%-3d", k, v));
    }
}
