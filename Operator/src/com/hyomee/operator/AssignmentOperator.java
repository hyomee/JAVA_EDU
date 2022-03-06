package com.hyomee.operator;

public class AssignmentOperator {
   public static void main(String[] args) {
      int numA = 10;    // 10을 정수자료형 numA에 저장
      int numB = 3;     // 3을 정수자료형 numA에 저장

      numA += numB;     // numA = numA + numB의 축약
      System.out.println(String.format("numA += numB  : %s", numA)); // 13
      numA %= numB;     // numA = numA % numB의 축약
      System.out.println(String.format("numA %%= numB  : %s", numA)); // 1
   }
}
