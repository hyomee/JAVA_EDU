package com.hyonee.control;

public class ControlDoWhile {
   public static void main(String[] args) {
      int num = 0;
      System.out.println(String.format("시작 : num : %s", num));
      do {
         num = ++num;
         System.out.println(String.format("num : %s", num));
      } while ( num < 1);
      System.out.println(String.format("종료 : num : %s", num));

      do {
         num = ++num;
         System.out.println(String.format("num : %s", num));
      } while ( num < 5);
      System.out.println(String.format("종료 : num : %s", num));

      do {
         num = ++num;
         if (num == 8) {
            System.out.println(String.format("탈출 num : %s", num));
            break;
         }
         System.out.println(String.format("num : %s", num));
      } while ( num < 10);
      System.out.println(String.format("탈출 종료 : num : %s", num));
   }
}
