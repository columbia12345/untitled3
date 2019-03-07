package Set;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();//优先级队列
        //ArrayDeque<>();//双端队列
        queue.offer(55);//元素放入队列（入队列）
        queue.offer(44);queue.offer(33);
        System.out.println(queue.peek());
        //查看队列第一个元素，不取出
        System.out.println(queue.poll());
        //取出第一个元素（出队列）
        queue.forEach(System.out::println);


        Stack<Integer> stack = new Stack<>();
        stack.push(3);//放入
        stack.push(5);stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop()); //将栈顶元素弹出（是最后来的元素）

    }


}
