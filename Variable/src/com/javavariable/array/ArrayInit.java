package com.javavariable.array;

import java.util.Arrays;

public class ArrayInit {
   public static void main(String[] args) {
      boolean[] isArray = new boolean[2];
      int[] numArray = new int[2];
      double[] doubleArray = new double[2];

      System.out.println("boolean[] : " + Arrays.toString(isArray));
      System.out.println("int[] : " + Arrays.toString(numArray));
      System.out.println("double[] : " + Arrays.toString(doubleArray));
   }
}
