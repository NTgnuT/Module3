package BT;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class baitap1 {
    // Viết chương trình sử dụng queue để lưu trữ và in ra các phần tử của một danh sách đầu vào.
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(stack);
        stack.add(1, 7);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");
        System.out.println(queue);

        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.peek());



    }
}
