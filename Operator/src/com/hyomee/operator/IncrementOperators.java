package com.hyomee.operator;

public class IncrementOperators {
   public static void main(String[] args) {
      int num = 10;
      int postFixNum = num ++;
      System.out.println("num = " + num);             // 11
      System.out.println("전위형 = " + postFixNum);    // 10

      int num01 = 10;
      int preFix = ++num01;
      System.out.println("num01 = " + num01);         // 11
      System.out.println("후위형 = " + preFix);        // 11
   }
}
