package com.hyonee.control;

public class ControlFor {
   public static void main(String[] args) {
      int index ;
      int num = 0;
      System.out.println("==== for 문 안에서 후위형 증감");
      for ( index = 0; index < 5; index++) {
         num = ++num;
         System.out.println(String.format("i : %s , num : %s", index, num));
      }
      System.out.println("==== for 문 안에서 전위형 증감");
      num = 0;
      for ( int i = 0; i < 5; i++) {
         num = num++;
         System.out.println(String.format("i : %s , num : %s", i, num));
      }
      System.out.println("==== 문자열 한 단어 씩 출력");
      String str = new String("자바 언어");
      for ( int i = 0; i < str.length(); i++) {
         System.out.println(String.format("i : %s , num : %s", i, str.charAt(i)));
      }

      System.out.println("==== 문자열 한 단어 씩 출력 ( foreach ) ");
      char[] chstr = str.toCharArray();  // 문자열을 문자 배열로 변환
      for ( char c : chstr) {
         System.out.println(String.format("c : %s" , c));
      }

   }
}
