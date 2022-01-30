package com.javavariable;

public class TypeCasting {
   public static void main(String[] args) {

      // 자동 변환
      long valueLong = 10;       // int -> long ( Up )
      float valueFloat = 10;     // int -> float ( Up )
      double valueDouble = 10;   // int -> double ( Up )
      byte valueByte = 10;       // int -> byte
      short valueShort = 10;     // int -> short

      System.out.println("int -> long ( Up ) = " + valueLong);
      System.out.println("int -> float ( Up ) = " + valueFloat);
      System.out.println("int -> double ( Up ) = " + valueDouble);
      System.out.println("int -> byte = " + valueByte);
      System.out.println("int -> short = " + valueShort);

      // 수동 변환
      byte valueByteCasting = (byte) 100;       // int -> byte ( Down )
      int valueIntCasting = (int) 3.5;          // double -> int ( Down )
      float valueFloatCasting = (float) 3.5;    // double -> float ( Down )

      System.out.println("int -> byte ( Down ) = " + valueByteCasting);
      System.out.println("double -> int ( Down ) = " + valueIntCasting);
      System.out.println("double -> float ( Down ) = " + valueFloatCasting);

      // 정수형은 작은 범위의 자료형으로 down Castring 하면 서쿨러 구조 임
      byte valueByte128 = (byte) 128;
      byte valueByte129 = (byte) 129;
      byte valueByte_129 = (byte) -129;
      byte valueByte_130 = (byte) -130;
      System.out.println("(byte) 128 = " + valueByte128);
      System.out.println("(byte) 129 = " + valueByte129);
      System.out.println("(byte) -129 = " + valueByte_129);
      System.out.println("(byte) -130 = " + valueByte_130);
   }
}


