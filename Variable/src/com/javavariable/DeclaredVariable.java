package com.javavariable;

public class DeclaredVariable {

   public static void main(String[] args) {
      // 1. 변수 선언과 값 대입 분리
      int num;       // 정수형 변수 num 선언
      num = 3;       // 정수형 변수 num에 3 저장

      // 2. 변수 선언과 값 대입 동시
      int initNum = 3;
      System.out.println(String.format("정수 num=%s, initNum=%s", num, initNum));

      double doubleNum = 5;
      doubleNum = 7.2;
      System.out.println(String.format("실수 doubleNum=%f", doubleNum));

      String str = "자바 안녕";
      // str = 10;   // 오류 :: String 형에는 문자만 가능
      System.out.println(String.format("문자열 str=%s", str));
   }
}

