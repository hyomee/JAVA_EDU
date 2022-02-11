package com.hyomee.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetClass {
  Set<String> strSet = new HashSet<String>();

  HashSetClass() {
    add();
    addAll();
    remove();
    removeAll();
    isEmptyAndClear();
    contains();
    containsAll();
    size();
    iterator();
  }

  void add() {
    strSet.add("대한");
    strSet.add("민국");
    strSet.add("대한");
    System.out.println("* add : " + strSet.toString());
  }

  void addAll() {
    Set<String> strSet01 = new HashSet<String>();
    strSet01.add("우리");
    strSet01.add("나라");
    strSet.addAll(strSet01);
    System.out.println("* addAll : " +strSet.toString());
  }

  void remove() {
    strSet.remove("우리");
    System.out.println("* remove : " + strSet.toString());
  }

  void removeAll() {
    Set<String> strSet01 = new HashSet<String>();
    strSet01.add("대한");
    strSet01.add("민국");
    strSet01.add("미국");
    strSet.removeAll(strSet01);
    System.out.println("* removeAll : " +strSet.toString());
  }

  void isEmptyAndClear() {
    if (strSet.isEmpty()) {
      System.out.println("* strSet 데이터 없음");
    } else {
      System.out.println("* strSet 데이터 있음");
      strSet.clear();
      System.out.println("* strSet clear 후 isEmpty : " + strSet.isEmpty());
    }
    add();
    addAll();
  }

  void contains() {
    if (strSet.contains("우리")) {
      System.out.println("* contains : '우리'가 존재 합니다");
    } else {
      System.out.println("* contains : '우리'가 존재 하지 않습니다.");
    }
  }

  void containsAll() {
    Set<String> strSet01 = new HashSet<String>();
    strSet01.add("우리");
    strSet01.add("나라");
    if (strSet.containsAll(strSet01)) {
      System.out.println(String.format("* containsAll : %s에 %s가 존재 합니다",
              strSet.toString(), strSet01.toString()));
    } else {
      System.out.println(String.format("* containsAll : %s에 %s가 존재 하지 않습니다",
              strSet.toString(), strSet01.toString()));
    }
  }

  void size() {
    System.out.println(String.format("* size :  %s 이 크기는 %d입니다",
            strSet.toString(), strSet.size()));
  }

  void iterator() {
    Iterator strSetingIterator = strSet.iterator();
    while (strSetingIterator.hasNext() ) {
      System.out.println(String.format("* strSet : 요소 :  %s ",
              strSetingIterator.next()));
    }
  }

}
