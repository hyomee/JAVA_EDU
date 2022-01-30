package com.javavariable;

public class InitVariable {
   private boolean mvBoolean;
   private char mvChar;
   private byte mvByte;
   private short mvShort;
   private int mvInt;
   private long mvLong;
   private float mvFloat;
   private double mvDouble;
   private Object mvObject;

   public InitVariable() {}

   public void printInitVariable() {
      int localNum; // 초기화 되지 않음 오류
      // System.out.println(String.format("localNum  :: %s", localNum));
      System.out.println(String.format("Field mvBoolean  :: %s", mvBoolean));
      System.out.println(String.format("Field mvChar :: %s", mvChar));
      System.out.println(String.format("Field mvByte :: %s", mvByte));
      System.out.println(String.format("Field mvShort :: %s", mvShort));
      System.out.println(String.format("Field mvInt :: %s", mvInt));
      System.out.println(String.format("Field mvLong :: %s", mvLong));
      System.out.println(String.format("Field mvFloat :: %s", mvFloat));
      System.out.println(String.format("Field mvDouble :: %s", mvDouble));
      System.out.println(String.format("Field mvObject :: %s", mvObject));
   }
}



