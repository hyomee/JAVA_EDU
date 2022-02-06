package com.hyomee.collection;

import java.util.ArrayList;
import java.util.List;

public class DifferenceArray {

  public void arrayMethod() {
    String[] str = new String[] {"A", "B","C", "D"};
    str[2] = null;
    System.out.println("str 길이 : " + str.length);
  }

  public void collectionMethod() {
    List<String> alist = new ArrayList<>();
    alist.add("A");
    alist.add("B");
    alist.add("C");
    alist.add("D");
    System.out.println("alist 길이 : " + alist.size());
    alist.remove("C");
    System.out.println("alist 길이 : " + alist.size());
  }
}
