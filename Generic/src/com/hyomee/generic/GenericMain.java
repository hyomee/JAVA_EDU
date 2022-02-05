package com.hyomee.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
  public static void main(String... args) {
    List list = new ArrayList();
    list.add("홍길동");
    list.add("홍당무");

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(0);
      System.out.println(str);
    }
  }
}
