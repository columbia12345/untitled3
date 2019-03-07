package Set;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        LinkedList<String> LinkedList = new LinkedList<>();
        LinkedList.add("abc");
        LinkedList.add("def"); //其实也是默认在最后一个位置插入（但有addLast的时候在这个之前）
        LinkedList.addFirst("aaa");//首位插入
        LinkedList.addLast("bbb");//末尾插入


        LinkedList.forEach(System.out::print);


    }
}
