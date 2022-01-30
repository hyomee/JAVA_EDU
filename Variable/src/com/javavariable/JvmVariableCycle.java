package com.javavariable;

public class JvmVariableCycle {
   static int counter;
   public static void main(String[] args) {
      int total = sum(10, 30);
      System.out.println("합계 = " + total);
   }

   static int sum(int i, int j) {
      int sum = i + j;
      counter = counter + 1;
      return sum;
   }
}

