package com.javavariable;

public class PrimitiveTypeBooleanNumeric {
   public static void main(String[] args) {
      boolean isVar = true;
      if (isVar) {
         isVar = false;
      }
      // 정수 리터럴이 선언한 변수 범위에 있으면 선언한 형으로 인식 하지만
      // 범위 밖에 있으면 기본 int형으로 인식 하여 오류 발생 -> 형 변환 필요
      byte valueByte = 10;
      short valueShort = 10;
      int valueInt = 10;
      long valueLong = 10;
      long valueLongL = 10L;
      // 범위 밖에 값이면 오류 발생 ( 32768는 int로 인식 ) -> 형변환 해야 암
      //short valueByteOver = 32768;
      short valueByteOver = (short) 32768;

      System.out.println(String.format("boolean boolean = %s", isVar));
      System.out.println(String.format("byte    byte = %s", valueByte));
      System.out.println(String.format("short   short = %s", valueByte));
      System.out.println(String.format("int     int = %s", valueInt));
      System.out.println(String.format("long    long = %s", valueLong));
      System.out.println(String.format("long    long L = %s", valueLongL));
      System.out.println(String.format("short   범위밖 = %s", valueByteOver));
   }
}
