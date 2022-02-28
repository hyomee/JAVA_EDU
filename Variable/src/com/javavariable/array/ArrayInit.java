package com.javavariable.array;

import java.util.Arrays;

public class ArrayInit {
   public static void main(String[] args) {

      int num = 0;
      int[] arrayNum = null;
      System.out.println("기본 자료형 : " + num);                // 0
      System.out.println("참조 저료형 배열 : " + arrayNum);       // null


      boolean[] isArray = new boolean[2];
      int[] numArray = new int[2];
      double[] doubleArray = new double[2];

      System.out.println("boolean[] : " + Arrays.toString(isArray));    // [false, false]
      System.out.println("int[] : " + Arrays.toString(numArray));       // [0, 0]
      System.out.println("double[] : " + Arrays.toString(doubleArray)); // [0.0, 0.0]

   }
}
