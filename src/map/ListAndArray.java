package map;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAndArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 4, 2, 6, 7, 8,};

        List<Integer> list = Arrays.asList(arr);//asList将数组转为集合
        list.forEach(e -> System.out.printf("%-3d", e));
        //list.add(9); 抛出异常

        System.out.println();

        List<Integer> list1 = new ArrayList<>(list);
        list1.add(9);
        list1.forEach(e -> System.out.printf("%-3d", e));
        System.out.println();

        //---------------------------------------------------------------------------------
        Object[] arr1 = list1.toArray(); //toArray将集合转为数组，永远都返回Object类型，是不能变的
        Arrays.stream(arr1).forEach(e-> System.out.printf("%-3d", e));

        Integer[] arr2 = list1.toArray(new Integer[0]); //避免全部成为Object类型
        Arrays.stream(arr2).forEach(e-> System.out.printf("%-3d", e));

        list1.subList(1,3).forEach(e->System.out.printf("%-3d", e));

        List<Integer> list2 = Collections.unmodifiableList(list1);
    }
}
