package com.hyomee.genericMethod;

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

  }
}


