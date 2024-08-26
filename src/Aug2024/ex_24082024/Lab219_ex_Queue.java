package Aug2024.ex_24082024;

import java.util.PriorityQueue;

public class Lab219_ex_Queue {
    public static void main(String[] args) {
        // Queue -> 1% in Automation
        // Follow FIFO : First come first out
        PriorityQueue pq = new PriorityQueue();
        pq.add("1");
        // offer() is same as the add() function
        pq.offer("2");
        pq.offer("4");
        pq.offer("3");
        System.out.println(pq);
        System.out.println(pq.peek()); // peek() means first
        System.out.println(pq.poll()); // Remove the first element
        System.out.println(pq);

    }
}
