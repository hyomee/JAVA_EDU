package com.javavariable.array;

import java.util.Arrays;

public class ArraySpec {
   public static void main(String[] args){
      int numA = 10;
      int numB = numA;
      numB = 20;
      System.out.println("numA : " + numA);
      System.out.println("numB : " + numB);

      int[] numArrayA = new int[] {10,20,30};
      int[] numArrayB = numArrayA;
      System.out.println("변경전 numArrayA : " + Arrays.toString(numArrayA));
      System.out.println("변경전 numArrayB : " + Arrays.toString(numArrayB));
      numArrayB[1] = 40;
      System.out.println("변경후 numArrayA : " + Arrays.toString(numArrayA));
      System.out.println("변경후 numArrayB : " + Arrays.toString(numArrayB));
   }
}

