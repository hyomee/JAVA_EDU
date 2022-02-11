package com.hyomee.collection.map;

import java.util.Collections;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

class TreeMapClass {
  TreeMap<Integer, String> map = new TreeMap<Integer, String>();                 //  TreeMap생성  :

  TreeMapClass() {
    System.out.println("* TreeMapClass ================");
    insertTreeMap();
    getTreeMapK();
    getTreeMapEntry();
    map.clear();
    sortedMap();
  }

  void insertTreeMap() {
    for ( int i = 0 ; i < 10; i++) {
      this.map.put(i, i + "번째");
    }
    System.out.println("* map 전체 : " + map.toString());
  }

  void getTreeMapK() {
    System.out.println("* TreeMap firstKey : " + map.firstKey());
    System.out.println("* TreeMap lastKey :  " + map.lastKey());
    System.out.println("* TreeMap lowerKey :  " + map.lowerKey(6));
    System.out.println("* TreeMap higherKey :  " + map.higherKey(6));
    System.out.println("* TreeMap floorKey :  " + map.floorKey(6));
    System.out.println("* TreeMap ceilingKey :  " + map.ceilingKey(4));
  }

  void getTreeMapEntry() {
    System.out.println("* TreeMap firstEntry : " + map.firstEntry());
    System.out.println("* TreeMap lastEntry :  " + map.lastEntry());
    System.out.println("* TreeMap lowerEntry :  " + map.lowerEntry(6));
    System.out.println("* TreeMap higherKey :  " + map.higherEntry(6));
    System.out.println("* TreeMap higherEntry :  " + map.floorEntry(6));
    System.out.println("* TreeMap ceilingEntry :  " + map.ceilingEntry(4));
    System.out.println("* TreeMap pollFirstEntry 이전 : " + map.toString());
    System.out.println("* TreeMap pollFirstEntry :  " + map.pollFirstEntry());
    System.out.println("* TreeMap pollFirstEntry 이후, pollLast 이전 : " + map.toString());
    System.out.println("* TreeMap pollLastEntry :  " + map.pollLastEntry());
    System.out.println("* TreeMap pollLastEntry 이후 : " + map.toString());
  }

  void sortedMap() {
    insertTreeMap();
    SortedMap headMap = map.headMap(5);
    System.out.println("* TreeSet treeSet : " + map.toString());
    System.out.println("* SortedMap headMap(5) : " + headMap.toString());
    SortedMap tailMap = map.tailMap(5);
    System.out.println("* SortedMap tailMap(5) : " + tailMap.toString());
    SortedMap subMap = map.subMap(3,6);
    System.out.println("* SortedMap subMap(3,6) : " + subMap.toString());
  }
}
