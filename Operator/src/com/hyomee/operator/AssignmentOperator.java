package com.hyomee.operator;

public class AssignmentOperator {
   public static void main(String[] args) {
      int numA = 10;
      int numB = 3;

      numA += numB;
      System.out.println(String.format("numA += numB  : %s", numA));
      numA %= numB;
      System.out.println(String.format("numA %%= numB  : %s", numA));
   }
}
