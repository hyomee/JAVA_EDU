package com.hyomee.collection.map;

import java.util.*;

class TreeMapClass {
  TreeMap<Integer, String> map = new TreeMap<Integer, String>();                 //  TreeMap생성  :

  TreeMapClass() {
    System.out.println("* TreeMapClass ================");
    insertTreeMap();
    getTreeMapK();
    getTreeMapEntry();
    map.clear();
    sortedMap();
    map.clear();
    navigableMap();
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
    System.out.println("* TreeMap map : " + map.toString());
    System.out.println("* SortedMap headMap(5) : " + headMap.toString());

    SortedMap tailMap = map.tailMap(5);
    System.out.println("* SortedMap tailMap(5) : " + tailMap.toString());

    SortedMap subMap = map.subMap(3,6);
    System.out.println("* SortedMap subMap(3,6) : " + subMap.toString());
  }


  void navigableMap() {
    insertTreeMap();
    NavigableMap headMap = map.headMap(5, true);
    System.out.println("* TreeMap map : " + map.toString());
    System.out.println("* NavigableMap headMap(5, true) : " + headMap.toString());

    NavigableMap tailMap = map.tailMap(5, false);
    System.out.println("* NavigableMap tailMap(5, false) : " + tailMap.toString());

    NavigableMap subMapfromInclude = map.subMap(3, true, 6, false);
    System.out.println("* NavigableMap subMap(3, true, 6, false) : " + subMapfromInclude.toString());
    NavigableMap subMaptToInclude = map.subMap(3, false, 6, true);
    System.out.println("* NavigableMap subMap(3, false, 6, true) : " + subMaptToInclude.toString());
    NavigableMap subMapFromToInclude = map.subMap(3, true, 6, true);
    System.out.println("* NavigableMap subMap(3, true, 6, true) : " + subMapFromToInclude.toString());
    NavigableMap subMapFromTofalse = map.subMap(3, false, 6, false);
    System.out.println("* NavigableMap subMap(3, false, 6, false) : " + subMapFromTofalse.toString());

    NavigableMap descendingMap = map.descendingMap();
    System.out.println("* NavigableMap descendingMap : " + descendingMap.toString());
  }
}
