package com.hyomee.collection.list;

import java.util.*;

public class ListTestClass {
  public void listTestMethod() {

    List<Integer> asArray = new ArrayList<>();

    // 초기 저장 공간 할당 : 실제 데이터 갯수의 size은 아님
    // Capacity 는 생략 가능 하면 생략 이때 기본은 10
    List<Integer> asArrayCapacity = new ArrayList<>(20);
    List<Integer> asVectors = new Vector<>();
    List<Integer> asStack = new Stack<>();

    //LinkedList는 Capacity가 없는 객체로 지정시 오류 발생
    //List<Integer> asLinkedList = new LinkedList<>(10);
    List<Integer> asLinkedList = new LinkedList<>();

    ArrayList<Integer> asArray01 = new ArrayList<>();
    Vector<Integer> asVectors01 = new Vector<>();
    Stack<Integer> asStack01 = new Stack<>();
    LinkedList<Integer> asLinkedList01 = new LinkedList<>();


    // 정적 메서드 활용 -> new ArrayList<> Wrapping 되어 있음
    List<Integer> asArrays = Arrays.asList(10,20,20,40);

  }
}
