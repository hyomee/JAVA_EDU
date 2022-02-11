package com.hyomee.collection.map;

import java.util.*;

class LinkedHashMapClass {
  Map<Integer, String> strMap = new LinkedHashMap<Integer, String>();

  LinkedHashMapClass() {
    putLinkedHashMap();
    replaceMap();
    getMap();
    useCollectionMap() ;
    removeMap();
  }

  void putLinkedHashMap(){
    strMap.put(1, "한국");
    strMap.put(2, "중국");
    strMap.put(3, "일본");
    strMap.put(4, "대만");
    Map<Integer, String> strMapAll = new LinkedHashMap<Integer, String>();
    strMapAll.put(1, "영국");
    strMapAll.putAll(strMap); // 전부 교체
    strMap.put(5, "대만"); // Value 중복
    System.out.println("* LinkedHashMap : strMap : " + strMap.toString());
    System.out.println("* LinkedHashMap : strMapAll : " + strMapAll.toString());
  }

  void replaceMap() {
    strMap.replace(5, "영국");
    strMap.replace(4, "대만", "미국");
    strMap.replace(4, "대만", "영국"); // 처리 하지 않음
    System.out.println("* LinkedHashMap : strMap : " + strMap.toString());
  }

  void getMap() {
    System.out.println("* LinkedHashMap : strMap : strMap.get(2) : "
            + strMap.get(2));
    System.out.println("* LinkedHashMap : strMap : strMap.containsKey(2) : "
            + strMap.containsKey(2));
    System.out.println("* LinkedHashMap : strMap : strMap.containsKey(10) : "
            + strMap.containsKey(10));
    System.out.println("* LinkedHashMap : strMap : strMap.containsValue(\"한국\") : "
            + strMap.containsValue("한국"));
    System.out.println("* LinkedHashMap : strMap : strMap.containsValue(\"독일\") : "
            + strMap.containsValue("독일"));
  }

  void useCollectionMap() {
    // Map 안에 있는 Entry이 key, value
    Set<Map.Entry<Integer, String>> entrySet = strMap.entrySet();
    for ( Map.Entry entry: entrySet) {
      System.out.println("* LinkedHashMap : strMap : entrySet Map.Entry : "
              + entry.toString()
              + ", key : " + entry.getKey()
              + ", Value : " + entry.getValue());
    }

    // Map 안에 있는 KeySet를 사용한 Value
    Set<Integer> keySet = strMap.keySet();
    for ( Integer key : keySet) {
      System.out.println("* LinkedHashMap : strMap : keySet : "
              + " key : " + key
              + ", value : " + strMap.get(key));
    }

    // Map을 Collection으로 변환
    Collection valueCollection = strMap.values();
    System.out.println("* LinkedHashMap : strMap : trMap.values() : "
            + valueCollection.toString());

    // Map type 객체를 List Type 객체로 변환
    ArrayList countrys =  new ArrayList(strMap.values());
    System.out.println("* LinkedHashMap : strMap : new ArrayList(strMap.values()) : "
            + countrys.toString());
  }

  void removeMap() {
    System.out.println("* LinkedHashMap : strMap : remove 이전  : "
            + strMap.toString());
    strMap.remove(2);
    System.out.println("* LinkedHashMap : strMap : strMap.remove(2) 이후  : "
            + strMap.toString());
    strMap.remove(3, "일본");
    System.out.println("* LinkedHashMap : strMap : strMap.remove(3, \"일본\") 이후  : "
            + strMap.toString());
    strMap.remove(4, "영국");
    System.out.println("* LinkedHashMap : strMap : strMap.remove(4, \"영국\") 이후  : "
            + strMap.toString());
    strMap.clear();
    System.out.println("* LinkedHashMap : strMap : sstrMap.clear() 이후  : "
            + strMap.toString());
  }
}
