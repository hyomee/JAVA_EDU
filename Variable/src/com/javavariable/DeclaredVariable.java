package com.javavariable;

public class DeclaredVariable {

   public static void main(String[] args) {

      // 변수 선언과 값 대입 분리
      int num;          // 정수형 변수 num 선언
      num = 3;          // 정수형 변수 num에 3 저장

      // 변수 선언과 값 대입 동시
      int initNum = 3;  // 정수형 변수 initNum을 선언하고 값 3을 저장
      System.out.println(String.format("정수 num=%s, initNum=%s", num, initNum));


      double doubleNum ;   // double 형 변수를 선언
      doubleNum = 7.2;     // 7.2를 변수 doubleNum에 저장
      System.out.println(String.format("실수 doubleNum=%f", doubleNum));

      String str = "자바 안녕";   // 문자열 변수 str를 선언 하고 자바 안녕을 저장 한다,
      System.out.println(String.format("문자열 str=%s", str));
   }

}

