package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Alg {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);list.add(8);list.add(1);
        list.add(3);list.add(2);list.add(9);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list)); //最大值最小值

        Collections.reverse(list);
        list.forEach(e-> System.out.printf("%-3d",e));

        System.out.println();

        Collections.sort(list);
        list.forEach(e-> System.out.printf("%-3d",e));

        System.out.println();

        Collections.shuffle(list);
        list.forEach(e-> System.out.printf("%-3d",e));

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,7));

    }
}
