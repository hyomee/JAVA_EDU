package com.hyomee.operator;

public class BitOperator {
   public static void main(String[] args) {
      int numA = 3;
      int numB = 2;

      int numC = numA & numB;

      System.out.println(String.format("%s & %s = %s", numA, numB,  numC));

      System.out.println(String.format("%s & %s = %s",
            Integer.toBinaryString(numA),
            Integer.toBinaryString(numB),
            Integer.toBinaryString(numC)));



      System.out.println(String.format("%s | %s = %s",
               Integer.toBinaryString(numA),
               Integer.toBinaryString(numB),
               numA | numB));

      System.out.println(String.format("십진수 : %s\n 이진수 : %s\n 8진수 : %s\n 16진수 : %s",
               10,
               Integer.toBinaryString(10),
               Integer.toOctalString(10),
               Integer.toHexString(10)));

      System.out.println( String.format("십진수 : %s\n 십진수 : %s\n 십진수 : %s\n 십진수 : %s",
               100,
               Integer.parseInt("1010",2),
               Integer.parseInt("12",8),
               Integer.parseInt("a",16))       );

      System.out.println(String.format("~%s = %s",
               Integer.toBinaryString(numA),
              Integer.toBinaryString(~numA) ));
   }
}
