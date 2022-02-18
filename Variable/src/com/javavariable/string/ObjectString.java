package com.javavariable.string;



public class ObjectString {


  public static void main(String... args) {
    String str01 = new String("JAVA C");
    String str02 = new String("공부");

    // 문자열 길이
    stringLength(str01);

    // 문자열 비어 있는지 확인
    stringisEmpty(str01);

    // 문자열(String)을 특정 문자를 찾는 방법
    stringToChars(str01);

    // 문자열의 특정 위치의 값을 배열에 복사 함
    replaceStringRangeToChars(str01);

    // 문자열값 비교
    stringEqualstring(str01);

    // 대소문자 구분 없이 문자열의 실제 내용 비교
    stringEqualIgnoreCaseString(str01);

    // 해당 문자열과 매개변수의 문자열을 사전 순으로 비교
    stringCompareToString();

    // 대소문자 구분 없이 해당 문자열과 매개변수의 문자열을 사전 순으로 비교
    stringcompareToIgnoreCaseString();


  }

  /**
   * 문자열 길이
   * Method : String.length()
   */
  static void stringLength(String str) {
    System.out.println("문자열 길이 : str01.length() = " + str.length());
  }

  /**
   * 문자열 Object의 값이 있는지 없는지 비교
   * Method : String.length()
   */
  static void stringisEmpty(String str) {
    String msg = "";
    if (str.isEmpty()) {
      msg = "문자열이 비어 있습니다.";
    } else {
      str = "문자열이 비어 있지 않습니다.";
    }
    System.out.println( String.format("%s str01.isEmpty() = %s"
            , msg , str.isEmpty()) );

  }

  /**
   * 문자열(String)을 특정 문자를 찾는 방법
   * 1. Char 배열로 변환 후 위치 값으로 찾음
   * 2. chatAt(index) 사용 : index
   */
  private static void stringToChars(String str) {
    // 1. .toCharArray() : Char 배열로 변환 후 위치 값으로 찾음 :
    char[] chars = str.toCharArray();
    System.out.println("문자 : 두번째 문자 = " + chars[2]);

    // 전부 출력
    for (char ch: str.toCharArray()) {
      System.out.println("문자 : " + ch);
    }

    // 2. charAt(index) : index는 찾고자 하는 문자 위치
    System.out.println("문자 : 두번째 문자 = " + str.charAt(2));
    // 전부 출력
    for (int index = 0; index < str.length() ; index ++ ) {
      System.out.println(String.format("문자 : str01.charAt(%s) = %s"
              , index, str.charAt(index)));
    }
  }



  /**
   * 문자열에서 특정 문자를 찾아서 문자 배열의 값 바꾸기
   * 사용 Method :
   *    String.getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
   *    srcBegin : 문자열에서 복사할 첫번째 위치
   *    srcEnd   : 문자열에서 복사할 마지막 위치의 다음 위치 ( 길이 )
   *    dst[]    : 복사 대상 문자 배열
   *    dstBegin : 복사 대상 문자 배열의 시작 위치   *
   */
  private static void replaceStringRangeToChars(String str) {
    char[] chars = new char[]{'a', 'b', 'c'};
    System.out.println("문자 배열 : chars = " + (new String(chars)).toString());
    str.getChars(0,2, chars, 0);
    System.out.println("문자 배열 : chars = " + (new String(chars)).toString());
  }

  /**
   * 문자열 비교 ( stack의 값 비교 )
   * Method : String.equals(Object anObject)
   *   - Object : 값을 비교할 대상 Object
   */
  static void stringEqualstring(String sourceString) {
    String targetString = sourceString;
    if (targetString.equals(sourceString)) {
      System.out.println("값이 같음");
    }
  }

  /**
   * 대소문자 구분 없이 문자열의 실제 내용 비교
   * Method : String.equals(Object anObject)
   *   - Object : 값을 비교할 대상 Object
   */
  static void stringEqualIgnoreCaseString(String sourceString) {
    String lcoalString = "JaVa";
    if (sourceString.equals(lcoalString)) {
      System.out.println("stringEqualIgnoreCaseString : 값이 같음");
    } else {
      if (sourceString.equalsIgnoreCase(lcoalString)) {
        System.out.println("stringEqualIgnoreCaseString : 대소문자 구분 없이 문자열의 실제 내용 비교 값이 같음");
      }
    }
  }

  /**
   * 해당 문자열과 매개변수의 문자열을 사전 순으로 비교
   * Method : String.compareTo(Object anObject)
   *   - Object : 값을 비교할 대상 Object
   *   - result : -1(  String가 작음 ), 0 (같음) , 1 이상 (String가 큼 )
   */
  static void stringCompareToString() {
    String str01 = "C";
    String str02 = "z";
    System.out.println("String.compareTo(str02) : " + str01.compareTo(str02));
  }

  /**
   * 해당 문자열과 매개변수의 문자열을 사전 순으로 비교
   * Method : String.compareTo(Object anObject)
   *   - Object : 값을 비교할 대상 Object
   *   - result : -1(  String가 작음 ), 0 (같음) , 1 이상 (String가 큼 )
   */
  static void stringcompareToIgnoreCaseString() {
    String str01 = "C";
    String str02 = "z";
    System.out.println("String.compareToIgnoreCas(str02) : " + str01.compareToIgnoreCase(str02));
  }




}
