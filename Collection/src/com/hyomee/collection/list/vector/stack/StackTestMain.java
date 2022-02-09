package com.hyomee.collection.list.vector.stack;

import java.util.Stack;

public class StackTestMain {
  public static void main(String... args) {
    Stack<Integer> stack = new Stack<>();
    System.out.println(stack.empty());          // true
    // STACK에 넣기
    System.out.println(stack.push(10));     // 10
    System.out.println(stack.push(20));     // 20
    System.out.println(stack.push(30));     // 30
    System.out.println(stack.toString());       // [10, 20, 30]
    System.out.println(stack.peek());           // 30
    System.out.println(stack.search(10));     // 1
    System.out.println(stack.empty());          // false
    System.out.println(stack.pop());            // 30
    System.out.println(stack.pop());            // 20
    System.out.println(stack.pop());            // 10
    System.out.println(stack.empty());          // true
  }
}
