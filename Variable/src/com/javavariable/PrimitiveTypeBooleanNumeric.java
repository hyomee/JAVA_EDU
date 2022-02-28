package com.javavariable;

public class PrimitiveTypeBooleanNumeric {
   public static void main(String[] args) {
      // boolean 자료형은 true/false
      boolean isVar = true;         // isVar은 boolean 자료형으로 true를 저장
      if (isVar) {                  // isVar의 값이 참이면
         isVar = false;             // isVar를 거짓으로 저장
      }
      // 정수 리터럴이 선언한 변수 범위에 있으면 선언한 형으로 인식 하지만
      // 범위 밖에 있으면 기본 int형으로 인식 하여 오류 발생 -> 형 변환 필요
      byte valueByte = 10;          // byte 형 변수 valueByte 에 10 저장
      short valueShort = 10;        // short 형 변수 valueShort 에 10 저장
      int valueInt = 10;            // int 형 변수 valueInt 에 10 저장
      long valueLong = 10;          // long 형 변수 valueLong 에 10 저장
      long valueLongL = 10L;        // long 형 변수 valueLongL 에 10 저장

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
