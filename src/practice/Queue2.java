package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.offer("c");

        queue.remove();
//        queue.poll();
        queue.clear();
        System.out.println(queue);
    }
}
