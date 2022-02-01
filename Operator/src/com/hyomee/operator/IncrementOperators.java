package com.hyomee.operator;

public class IncrementOperators {
   public static void main(String[] args) {
      int num = 10;
      int postfixIncrementNum = num ++;
      System.out.println("num = " + num);
      System.out.println("postfixIncrementNum = " + postfixIncrementNum);

      int num01 = 10;
      int prefixIncrementNum = ++num01;
      System.out.println("num01 = " + num01);
      System.out.println("prefixIncrementNum = " + prefixIncrementNum);
   }
}
