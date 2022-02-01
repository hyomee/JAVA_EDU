package com.hyomee.operator;

public class ComparisonOperators {
   public static void main(String[] args) {
      int numA = 10;
      int numB = 20;

      System.out.println(String.format("%s > %s : %s", numA, numB, (numA > numB)));
      System.out.println(String.format("%s < %s : %s", numA, numB, (numA < numB)));
      System.out.println(String.format("%s >= %s : %s", numA, numB, (numA < numB)));
      System.out.println(String.format("%s <= %s : %s", numA, numB, (numA < numB)));

      System.out.println(String.format("%s == %s : %s", numA, numB, (numA == numB)));
      System.out.println(String.format("%s != %s : %s", numA, numB, (numA != numB)));

      String str01 = new String("안녕");
      String str02 = new String("안녕");

      System.out.println(String.format("%s == %s : %s", str01, str02, (str01 == str02)));
      System.out.println(String.format("%s equals %s : %s", str01, str02, (str01.equals(str02))));

      System.out.println(String.format("%s = %s : %s", numA, numB, (numA = numB)));
   }
}
