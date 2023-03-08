package dataStructures.stack.queu;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Queue queu2 = new PriorityQueue();

        queue.add("1");
        queue.add("3");
        queue.add("2");
        queue.add("7");

        System.out.println("Peek "+queue.peek());

        while(queue.size() >0){
            System.out.println("size before "+queue.size());
            System.out.println(queue.poll());
            System.out.println("size after "+queue.size());
        }
    }
}
