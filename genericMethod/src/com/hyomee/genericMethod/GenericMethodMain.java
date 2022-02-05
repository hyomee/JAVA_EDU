package com.hyomee.genericMethod;

import java.util.ArrayList;
import java.util.HashMap;
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
    int num =   genericMethod.method(10);
    System.out.println(num);

    String str = genericMethod.methodRnString("안녕" , 10);
    System.out.println(str);

    genericMethod.methodPrint("name" , "홍길동");

    String str01 =  genericMethod.methodPrintRnString("name" , "홍길동");
    System.out.println(str01);

    System.out.println(genericMethod.checkEquals(10 , 2.1));
    System.out.println(genericMethod.checkEquals("사과" , "배"));
    System.out.println(genericMethod.checkEquals("사과" , "사과"));

    System.out.println(genericMethod.extednsMethod("사과" , 0, "첫문자 : "));
  }
}


