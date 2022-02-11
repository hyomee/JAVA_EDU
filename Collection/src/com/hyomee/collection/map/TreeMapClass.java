package com.hyomee.collection.map;

import java.util.Collections;
import java.util.TreeMap;

class TreeMapClass {
  TreeMap<Integer, String> map = new TreeMap<Integer, String>();                 //  TreeMap생성  :

  TreeMapClass() {
    System.out.println("* TreeMapClass ================");
    insertTreeMap();
  }

  void insertTreeMap() {
    for ( int i = 0 ; i < 10; i++) {
      this.map.put(i, i + "번째");
    }
    System.out.println("* map 전체 : " + map.toString());
  }
}
