package map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapSet2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(1);list.add(1);
        Set<Integer> keys2 = new HashSet(list);
        keys2.forEach(System.out::println);
    }


}
