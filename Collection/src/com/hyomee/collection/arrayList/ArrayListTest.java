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
    removeMethod();
  }

  // 요소에 데이터 추가
  private void addtMethod() {
    // 요소 추가
    strList.add("현대자동차");
    strList.add("기아자동차");

    System.out.println("strList " + strList.toString());
    // 결과 : [현대자동차, 기아자동차]

    // 특정 요소에 데이터 추가
    strList.add(0, "삼성자동차");
    System.out.println("strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 기아자동차]

    // 컬렉션을 요소에 추가
    List<String> strCollection =  new ArrayList<>();
    strCollection.add("포드자동차");
    strCollection.add("도시바자동차");
    System.out.println("strCollection " + strCollection.toString());
    // 결과 : [포드자동차, 도시바자동차]

    // 컬렉션을 마지막 요소에 추가
    strList.addAll(strCollection);
    System.out.println("strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 기아자동차, 포드자동차, 도시바자동차]

    List<String> strCollection01 =  new ArrayList<>();
    strCollection01.add("포르쉐자동차");
    strCollection01.add("BMW자동차");
    System.out.println("strCollection01 " + strCollection01.toString());
    // 결과 : [포르쉐자동차, BMW자동차]

    // 컬렉션을 특정 요소에 추가
    strList.addAll(3, strCollection01);
    System.out.println("strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 기아자동차, 포르쉐자동차, BMW자동차, 포드자동차, 도시바자동차]
  }

  private void removeMethod() {
    // 지정한 위치  요소 삭제
    strList.remove(2);
    System.out.println("removeMethod : strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 포르쉐자동차, BMW자동차, 포드자동차, 도시바자동차]


    List<String> strCollection01 =  new ArrayList<>();
    strCollection01.add("포르쉐자동차");
    strCollection01.add("BMW자동차");
    System.out.println("removeMethod : strCollection01 " + strCollection01.toString());
    // 결과 : [포르쉐자동차, BMW자동차]

    // Collection 객체에 있는 모든 요소 삭제
    strList.removeAll(strCollection01);
    System.out.println("removeMethod : removeAll : strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 포드자동차, 도시바자동차]

    strList.add("포드자동차");
    System.out.println("removeMethod :  strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 포드자동차, 도시바자동차, 포드자동차]

    // 중복되는 요소 값의 첫번째 삭제
    strList.remove("포드자동차");
    System.out.println("removeMethod :  remove : strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 도시바자동차, 포드자동차]

    // 전체 삭제
    strList.clear();
    System.out.println("removeMethod : strList " + strList.toString());
    // 결과 : []
  }
}
