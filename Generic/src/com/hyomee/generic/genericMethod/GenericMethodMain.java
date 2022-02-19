package com.hyomee.generic.genericMethod;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodMain {
  public static void main(String... args) {

    List<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("홍당무");
    list.add("홍사과");

    for (String str: list) {
      System.out.println(str);
    }

    /*
    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(str);
    }
    */

    GenericMethod genericMethod = new GenericMethod();
    int num01 =   genericMethod.<Integer> method(10);
    System.out.println(num01);

    // 입력 매개 변수가 Genetic Type가 유추 할 수 있는 경우 생략 가능
    int num02 =   genericMethod.method(10);
    System.out.println(num02);

    String str02 = genericMethod.methodRnString("안녕" , 10);
    System.out.println(str02);

    genericMethod.methodPrint("name" , "홍길동");

    String str03 =  genericMethod.methodPrintRnString("name" , "홍길동");
    System.out.println(str03);

    System.out.println(genericMethod.checkEquals(10 , 2.1));
    System.out.println(genericMethod.checkEquals("사과" , "배"));
    System.out.println(genericMethod.checkEquals("사과" , "사과"));

    System.out.println(genericMethod.<String, Integer, Object>extednsMethod("사과" , 0, "첫문자 : "));
    System.out.println(genericMethod.extednsMethod("사과" , 0, "첫문자 : "));
  }
}


