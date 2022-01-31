package com.javavariable.string;

public class StringCopy {
   public static void main(String[] args) {
      String str = "안녕 자바";
      String strCopy = str;
      System.out.println("변경전 문자열 str : " + str);
      System.out.println("변경전 문자열 strCopy : " + strCopy);
      strCopy = "안녕 c";
      System.out.println("변경후 문자열 str : " + str);
      System.out.println("변경후 문자열 strCopy : " + strCopy);
   }
}
