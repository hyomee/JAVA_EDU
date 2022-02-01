package com.hyomee.operator;

public class TernaryOperator {
   public static void main(String[] args) {
      int value = ( 5 > 4) ? 3 : 4;
      System.out.println(String.format("( 5 > 4) ? 3 : 4  =>  %s", value));

      int numA = 10;
      int numB = 3;
      boolean bl = numA > numB ;
      System.out.println(String.format("%s > %s :  =>  %s", numA, numB, bl));

      value = numA > numB ? ++numB : numB;
      System.out.println(String.format("%s > %s ? ++numB(%s) : %s  =>  %s",
            numA, numB, ++numB, numB, value));

      value = numA > numB ? addNumB(numB) : numB;
      System.out.println(String.format("%s > %s ? ++numB(%s) : %s  =>  %s",
            numA, numB, ++numB, numB, value));
   }

   public static int addNumB(int numB) {
      return ++numB;
   }
}
