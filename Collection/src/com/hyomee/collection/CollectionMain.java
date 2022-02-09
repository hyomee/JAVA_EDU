package com.hyomee.collection;

import com.hyomee.collection.arrayList.ArrayListTest;
import com.hyomee.collection.linkedList.LinkedListTest;
import com.hyomee.collection.vector.VectorTest;

public class CollectionMain {
  public static void main(String... args) {
    // 배열과 비교
    DifferenceArray differenceArray = new DifferenceArray();
    differenceArray.arrayMethod();
    differenceArray.collectionMethod();

    // ArrayList
    ArrayListTest arrayListTest = new ArrayListTest();
    arrayListTest.ArrayListApiTest();

    // VectorTest
    VectorTest vectorTest = new VectorTest();
    vectorTest.VectorApiTest();

    // LinkedListTest
    LinkedListTest linkedListTest = new LinkedListTest();
    linkedListTest.LinkedListApiTest();
  }
}
