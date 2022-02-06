package com.hyomee.collection;

import com.hyomee.collection.arrayList.ArrayListTest;

public class CollectionMain {
  public static void main(String... args) {
    // 배열과 비교
    DifferenceArray differenceArray = new DifferenceArray();
    differenceArray.arrayMethod();
    differenceArray.collectionMethod();

    // ArrayList
    ArrayListTest arrayListTest = new ArrayListTest();
    arrayListTest.ArrayListApiTest();
  }
}
