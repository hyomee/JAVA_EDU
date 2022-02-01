package com.hyomee.operator;

public class ShiftOperators {
   public static void main(String[] args) {
      int flags = 0b00110011;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flags), Integer.toBinaryString(flags)));
      flags = flags << 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flags), Integer.toBinaryString(flags)));
      flags = flags << 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flags), Integer.toBinaryString(flags)));

      int flagsNegative = -0b00110011;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsNegative), Integer.toBinaryString(flagsNegative)));
      flagsNegative = flagsNegative << 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsNegative), Integer.toBinaryString(flagsNegative)));
      flagsNegative = flagsNegative << 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsNegative), Integer.toBinaryString(flagsNegative)));

      int flagsRight = 0b00110011;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsRight), Integer.toBinaryString(flagsRight)));
      flagsRight = flagsRight >> 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsRight), Integer.toBinaryString(flagsRight)));
      flagsRight = flagsRight >> 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsRight), Integer.toBinaryString(flagsRight)));

      int flagsRightNegative = -0b00110011;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsRightNegative), Integer.toBinaryString(flagsRightNegative)));
      flagsRightNegative = flagsRightNegative << 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsRightNegative), Integer.toBinaryString(flagsRightNegative)));
      flagsRightNegative = flagsRightNegative << 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsRightNegative), Integer.toBinaryString(flagsRightNegative)));

      int flagsLogic = 0b00110011;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsLogic), Integer.toBinaryString(flagsLogic)));
      flagsLogic = flagsLogic >>> 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsLogic), Integer.toBinaryString(flagsLogic)));
      flagsLogic = flagsLogic >>> 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsLogic), Integer.toBinaryString(flagsLogic)));

      int flagsLogicNegative = -0b00110011;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsLogicNegative), Integer.toBinaryString(flagsLogicNegative)));
      flagsLogicNegative = flagsLogicNegative >>> 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsLogicNegative), Integer.toBinaryString(flagsLogicNegative)));
      flagsLogicNegative = flagsLogicNegative >>> 1;
      System.out.println(String.format("십진수 : %s, 이진수 : %s",
            Integer.valueOf(flagsLogicNegative), Integer.toBinaryString(flagsLogicNegative)));

   }
}
