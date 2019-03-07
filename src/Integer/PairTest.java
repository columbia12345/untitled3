package Integer;

import java.io.Serializable;

class ArrayAlg {
    public static <T> T getMiddle(T... a) {//可变参数列表，可以作为一个数组使用,a的类型就是一个T类型
        //如果你要写一个范型方法，那你就要在返回值的前面加一个<>
        //<>只是一个语法，表示范型方法
        return a[a.length / 2];
    }

    public static <T extends Object & Comparable & Serializable & Cloneable> T min(T[] a) {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0) smallest = a[i];

        }
        return smallest;
    }

    public static <T extends Comparable> Pair minmax(T[] a) {//范型类作为返回值
        //圆括号之前紧跟着的一定是方法名，再往前一定是返回值类型
        //一定是返回值和方法名放在一起
        //一个类当然可以作返回值，比如返回一个日期，一个double
        if (a == null || a.length == 0) return null;
        T min, max;
        min = max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}

public class PairTest {
    public static void main(String[] args) {
        /*String[] words = {"Marry" , "had" , "a" , "little" , "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.printf("%s  %s", mm.getFirst(), mm.getSecond());
*/
        System.out.println(ArrayAlg.<String>getMiddle("John","Q.","Public"));
        System.out.println(ArrayAlg.getMiddle(1, 2, 3, 4, 5, 6, 7, 8, 9));

        double d = ArrayAlg.<Double>getMiddle(1.0, 2.0);
    }
}
