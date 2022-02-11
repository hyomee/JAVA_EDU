package com.hyomee.collection.map;

import com.hyomee.collection.map.hashmap.HashMapClass;
import com.hyomee.collection.map.hashtable.HashTableClass;
import com.hyomee.collection.map.linkedhashmap.LinkedHashMapClass;
import com.hyomee.collection.map.treemap.TreeMapClass;

public class MapTestMain {
  public static void main(String... args) {
    HashMapClass hashMapClass = new HashMapClass();
    HashTableClass hashTableClass = new HashTableClass();
    LinkedHashMapClass linkedHashMapClass = new LinkedHashMapClass();
    TreeMapClass treeMapClass = new TreeMapClass();
  }
}
