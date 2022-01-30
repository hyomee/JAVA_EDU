package com.javabasic.input;

import java.util.Scanner;

public class Input {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("문자를 입력 하세요.:");
      String str = sc.next();
      System.out.println("입력한 문자 : "+ str);
      float fo = sc.nextFloat();
      System.out.printf("입력한 실수는 %f : ", fo);
   }
}

