package com.javavariable.string;

public class StringSharing {
   public static void main(String[] args) {
      String strA = "안녕 자바";
      String strB = "안녕 자바";
      String strC = new String("안녕 자바");
      String strD = new String("안녕 자바");

      System.out.println("문자열 리터럴 : 문자열 리터럴 = " + (strA == strB) );
      System.out.println("문자열 리터럴 : new String = " + (strA == strC) );
      System.out.println("new String : new String = " + (strC == strD) );

      strB = "안녕 C";
      System.out.println("문자열 리터럴 : 문자열 리터럴 = " + (strA == strB) );
   }
}
