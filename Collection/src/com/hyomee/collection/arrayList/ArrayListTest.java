package com.hyomee.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
  private final List<String> strList;

  public ArrayListTest() {
    strList = new ArrayList<>();
  }

  public void ArrayListApiTest() {
    addtMethod();
  }

  private void addtMethod() {
    // 요소 추가
    strList.add("현대자동차");
    strList.add("기아자동차");
    System.out.println("strList " + strList.toString());

    // 특정 요소에 데이터 추가
    strList.add(0, "삼성자동차");
    System.out.println("strList " + strList.toString());

    // 컬렉션을 요소에 추가
    List<String> strCollection =  new ArrayList<>();
    strCollection.add("포드자동차");
    strCollection.add("도시바자동차");
    System.out.println("strCollection " + strCollection.toString());

    // 컬렉션을 마지막 요소에 추가
    strList.addAll(strCollection);
    System.out.println("strList " + strList.toString());

    List<String> strCollection01 =  new ArrayList<>();
    strCollection01.add("포르쉐자동차");
    strCollection01.add("BMW자동차");
    System.out.println("strCollection01 " + strCollection01.toString());

    // 컬렉션을 특정 요소에 추가
    strList.addAll(3, strCollection01);
    System.out.println("strList " + strList.toString());

  }

}
