package com.company;

import java.util.*;

public class DemoQueue {
    public void demo() {
        /** Queue */
//        Queue<String> qu = new LinkedList<>();  // Since Queue is an abstract
//        qu.offer("baby");
//
//        qu.add("jitto");
//        qu.add("jithin");
//        qu.add("jeena");
//        qu.offer("ancy");
//
//        System.out.println("Removing from head (poll or remove) "+ qu.poll());
//        System.out.println("getting first element (peek or element) "+qu.peek());
//
//        for (String name: qu) {
//            System.out.println(name);
//        }
//
//        while(!qu.isEmpty()) {
//            System.out.println("removing "+ qu.remove());
//        }

        /** Priority Queue */
//        Queue<Person> queue = new PriorityQueue<>();
//        queue.add(new Person("Jitto", 32));
//        queue.add(new Person("Jithin", 28));
//        queue.add(new Person("Jeena", 27));
//
//        while (queue.peek() != null) {
//            System.out.println(queue.poll());
//        }

        /** ArrayDeque */
        // Double ended queue
        // FIFO
        Deque<Integer> arrDeq = new ArrayDeque<>();
        arrDeq.offer(1);
        arrDeq.offer(10);
        arrDeq.offer(100);
        arrDeq.offer(1000);

        System.out.println("----FIFO----");
        while (!arrDeq.isEmpty()) {
            System.out.println(arrDeq.poll()); // pollLast ie; LIFO
        }

        // LIFO
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        System.out.println("----LIFO----");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}

