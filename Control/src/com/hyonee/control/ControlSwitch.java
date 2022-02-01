package com.hyonee.control;

public class ControlSwitch {
   public static void main(String[] args) {
      int num = 2;
      switch(num) {
         case 0:
         case 1:
         case 2:
            System.out.println("인위적을 1,2,3 수용");
            break;
         case 3:
            System.out.println("num = 3");
            break;
         case 4:
            System.out.println("num = 4");
            break;
         case 5:
            System.out.println("num = 5");
            break;
         default:
            System.out.println("num가 5 보다 큽니다.");
      }
   }
}


