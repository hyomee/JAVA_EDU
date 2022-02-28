package com.javavariable;

public class PrimitiveChar {
   public static void main(String[] arg) {
      char charliteralToChar = 'A';
      char charIntegerliteralToChar = '3';
      // '10'은 문자 2개로 char 범위 밖으로 오류
      // char charIntegerliteralToChar = '10';
      char integerliteralToChar = 65;
      char bianeyliteralToChar = 0b1000001;
      char octalliteralToChar = 00101;
      char hexadecimalToChar = 0x0041;
      char unicodeToChar = '\u0041';

      System.out.println(String.format("문자      = %s"
              , charliteralToChar));         // A
      System.out.println(String.format("숫자문자   = %s"
              , charIntegerliteralToChar));  // 3
      System.out.println(String.format("10진수    = %s"
              , integerliteralToChar));      // A
      System.out.println(String.format("2진수     = %s"
              , bianeyliteralToChar));       // A
      System.out.println(String.format("8진수     = %s"
              , octalliteralToChar));        // A
      System.out.println(String.format("16진수    = %s"
              , hexadecimalToChar));         // A
      System.out.println(String.format("유니코드   = %s"
              , unicodeToChar));             // A
   }
}
