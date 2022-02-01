package com.hyomee.operator;

public class BitOperator {
   public static void main(String[] args) {
      int numA = 3;
      int numB = 2;

      int numC = numA & numB;
      System.out.println(String.format("%s & %s = %s",
            Integer.toBinaryString(numA),
            Integer.toBinaryString(numB),
            Integer.toBinaryString(numC)));

      System.out.println(String.format("%s & %s = %s", numA, numB,  numC));

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
            10,
            Integer.parseInt(Integer.toBinaryString(10),2),
            Integer.parseInt(Integer.toOctalString(10),8),
            Integer.parseInt(Integer.toHexString(10),16))       );

      System.out.println(String.format("~%s = %s",
            Integer.toBinaryString(numA),
            ~numA ));
   }
}
