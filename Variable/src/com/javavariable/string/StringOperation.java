package com.javavariable.string;

public class StringOperation {
   public static void main(String[] args) {
      String str01 = "안녕";
      str01 = str01 + "자바";
      System.out.println("안녕 + 자바 : str01 = " + str01);

      int num01 = 1;
      int num02 = 2;
      str01 = num01 + num02 + str01;
      System.out.println("안녕 + 자바 : str01 = " + str01);
   }
}
