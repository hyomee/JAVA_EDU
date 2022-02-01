package com.hyonee.control;

public class ControlBreakContinue {
   public static void main(String[] args) {
      int num = 0;
      for (int x = 0; x < 5; x++) {
         if (x == 4) {
            System.out.println(String.format("스킵 x : %s ,  num : %s", x, num));
            continue;
         }
         for (int y = 0; y < 5; y++) {
            num = ++num;
            if (y == 3) {
               System.out.println(String.format("탈출 x : %s , y : %s,  num : %s", x, y, num));
               break;
            }
            System.out.println(String.format("x : %s , y : %s,  num : %s", x, y, num));
         }
      }
   }
}
