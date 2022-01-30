package com.javavariable;

public class DecimalConversion {
   public static void main(String[] args) {
      int decomalNum = 12;
      String binaryNum = "1100";
      String octalNum = "14";
      String hexNum = "c";

      System.out.println("2진수 변환 = " + Integer.toBinaryString(decomalNum));
      System.out.println("8진수 변환 = " + Integer.toOctalString(decomalNum));
      System.out.println("16진수 변환 = " + Integer.toHexString(decomalNum));

      System.out.println("2진수->10진수 변환 = " + Integer.parseInt(binaryNum,2));
      System.out.println("8진수->10진수 변환 = " + Integer.parseInt(octalNum,8));
      System.out.println("16진수->10진수 변환 = " + Integer.parseInt(hexNum,16));
   }
}


