package com.javavariable;

public class DecimalConversion {
   public static void main(String[] args) {

      int decomalNum = 12;
      String binaryNum = "1100";
      String octalNum = "14";
      String hexNum = "c";

      System.out.println("2진수 변환 = "
              + Integer.toBinaryString(decomalNum));  // 1100
      System.out.println("8진수 변환 = "
              + Integer.toOctalString(decomalNum));   // 14
      System.out.println("16진수 변환 = "
              + Integer.toHexString(decomalNum));     // c

      System.out.println("2진수->10진수 변환 = "
              + Integer.parseInt(binaryNum,2)); // 12
      System.out.println("8진수->10진수 변환 = "
              + Integer.parseInt(octalNum,8));  // 12
      System.out.println("16진수->10진수 변환 = "
              + Integer.parseInt(hexNum,16));   // 12

   }
}


