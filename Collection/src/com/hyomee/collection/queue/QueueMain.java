package com.hyomee.collection.queue;


import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
  public static void main(String... args) {
    Queue<Integer> queue = new LinkedList<Integer>();

    System.out.println(queue.peek());                             // null

    System.out.println(queue.add(10) + " :" + queue.toString());  // true :[10]
    System.out.println(queue.add(20) + " :" + queue.toString());  // true :[10, 20]
    System.out.println(queue.add(30) + " :" + queue.toString());  // true :[10, 20, 30]
    System.out.println(queue.element());                          // 10
    System.out.println(queue.remove() + " :" + queue.toString()); // 10 :[20, 30]
    System.out.println(queue.remove() + " :" + queue.toString()); // 20 :[30]
    System.out.println(queue.poll() + " :" + queue.toString());   // 30 :[]
    System.out.println(queue.peek());                             // null
  }
}
