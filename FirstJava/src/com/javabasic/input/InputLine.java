package com.javabasic.input;

import java.util.Scanner;

public class InputLine {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("문자를 입력 하세요.:");
      String str = sc.nextLine();
      System.out.println("입력한 문자 : " + str);
   }
}
