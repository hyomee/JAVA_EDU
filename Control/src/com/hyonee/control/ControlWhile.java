package com.hyonee.control;

public class ControlWhile {
   public static void main(String[] args) {
      int num = 0;
      System.out.println(String.format("시작 : num : %s", num));
      while ( num < 5) {
         num = ++num;
         System.out.println(String.format("num : %s", num));
      }
      System.out.println(String.format("종료 : num : %s", num));
      while ( num < 10) {
         num = ++num;
         if ( num == 8 ) {
            System.out.println(String.format("beak 탈출 num : %s", num));
            break;
         }
         System.out.println(String.format("num : %s", num));
      }
      System.out.println(String.format("종료 : num : %s", num));
   }
}

