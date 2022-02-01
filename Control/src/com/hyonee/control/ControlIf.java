package com.hyonee.control;

public class ControlIf {
   public static void main(String[] args) {
      int num01 = 10;
      int num02 = 20;

      if ( num01 < num02 )  {
         System.out.println(String.format("if :: %s < %s 는 만족 합니다.", num01, num02));
      }

      if ( num01 < num02 )  {
         System.out.println(String.format("if - else :: %s < %s 는 만족 합니다.", num01, num02));
      } else {
         System.out.println(String.format("if - else :: %s < %s 는 불만족 합니다.", num01, num02));
      }

      int score = 88;
      if ( score < 80 )  {
         System.out.println(String.format("if - else if - else  :: %s 는 80이하 입니다.", score));
      } else if ( score >= 80 && score < 90 )  {
         System.out.println(String.format("if - else if - else  :: %s 는 80이상 90이하 입니다.", score));
      } else if ( score >= 90 && score < 100 )  {
         System.out.println(String.format("if - else if - else  :: %s 는 90이상 1000이하 입니다.", score));
      } else if (  score == 100 )  {
         System.out.println(String.format("if - else if - else  :: %s 는 100 입니다.", score));
      } else {
         System.out.println(String.format("if - else if - else  :: %s 는 잘못 입력된 점수 입니다.", score));
      }
   }
}
