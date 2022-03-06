package com.hyomee.operator;

public class ArithmeticOperator {
   public static void main(String[] args) {
      int numA = 10;
      int numB = 3;

      System.out.println("numA + numB = " + (numA + numB) );   // 13
      System.out.println("numA - numB = " + (numA - numB) );   // 7
      System.out.println("numA * numB = " + (numA * numB) );   // 30
      System.out.println("numA / numB = " + (numA / numB) );   // 3
      System.out.println("numA % numB = " + (numA % numB) );   // 1

      double doubleA = 10.27;
      double doubleB = 3.5;

      System.out.println("doubleA + doubleB = " + (doubleA + doubleB) );   // 13.77
      System.out.println("doubleA - doubleB = " + (doubleA - doubleB) );   // 6.77
      System.out.println("doubleA * doubleB = " + (doubleA * doubleB) );   // 35.945
      System.out.println("doubleA / doubleB = " + (doubleA / doubleB) );   // 2.934285714285714
      System.out.println("doubleA % doubleB = " + (doubleA % doubleB) );   // 3.2699999999999996
   }
}
