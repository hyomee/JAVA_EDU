package com.hyomee.operator;

public class LogicalOperator {
   public static void main(String[] args) {
      int numA = 5;  // 7
      int numB = 6;

      System.out.println(String.format("(%s > %s) && (%s < %s) : %s",
            numA, numB, numA, numB, (numA > numB) && (numA < numB)));

      System.out.println(String.format("(%s > %s) || (%s < %s) : %s",
            numA, numB, numA, numB, (numA > numB) || (numA < numB)));

      System.out.println(String.format("(%s > %s) ^ (%s < %s) : %s",
            numA, numB, numA, numB, (numA > numB) ^ (numA < numB)));

      System.out.println(String.format("!(%s > %s) : %s",
            numA, numB, !(numA > numB) ));

      System.out.println(String.format("(%s > %s) && ++numA(%s) <= %s : %s",
            numA, numB, ++numA, numB, (numA > numB) && (++numA >= numB)));
   }
}
