package com.javavariable;

public class PrimitiveFloat {
   public static void main(String[] args) {
      // 실수형 자료형에서 실수 리터럴은 기본이 double 형
      // 소수점 (실수 리터럴)은 float형에 넣으면 오류 발생 -> 형반환 필요
      // 정수형 리터럴은 자동 변환 됨

      float numericLiteralToFloat = 10;
      float floatingLiteralToFloat = 10.25F;

      // 오류 : 형변환 필요
      // float valueFloat = 10.25;
      float floatingLiteralToCastingFloat = (float) 10.25;

      double floatingLiteralTeDouble = 10.25;
      double numericLiteralToDouble = 10;

      System.out.println(String.format("float numericLiteralToFloat = %f"
              , numericLiteralToFloat));           // 10.000000
      System.out.println(String.format("float floatingLiteralToFloat = %f"
              , floatingLiteralToFloat));          // 10.250000
      System.out.println(String.format("float floatingLiteralToCastingFloat = %f"
              , floatingLiteralToCastingFloat));   // 10.250000
      System.out.println(String.format("double floatingLiteralTeDouble = %f"
              , floatingLiteralTeDouble));         // 10.250000
      System.out.println(String.format("double numericLiteralToDouble = %f"
              , numericLiteralToDouble));          // 10.000000
   }
}

