package com.hyomee.collection.set;

import java.util.TreeSet;

class TreeSetCass  {
  TreeSet<Integer> treeSet = new TreeSet<Integer>();



  TreeSetCass() {
    System.out.println("* TreeSetCass ================");
    insertTreeSet();
    getTreeSet();
    setMethod();
  }

  void insertTreeSet() {
    for ( int i = 0 ; i < 10; i++) {
      this.treeSet.add(i);
    }
    System.out.println("* TreeSet 전체 : " + treeSet.toString());
  }

  void getTreeSet() {
    System.out.println("* TreeSet first : " + treeSet.first());
    System.out.println("* TreeSet last :  " + treeSet.last());
    System.out.println("* TreeSet lower :  " + treeSet.lower(6));
    System.out.println("* TreeSet higher :  " + treeSet.higher(6));
    System.out.println("* TreeSet floor :  " + treeSet.floor(6));
    System.out.println("* TreeSet ceiling :  " + treeSet.ceiling(4));
    System.out.println("* TreeSet pollFirst 이전 : " + treeSet.toString());
    System.out.println("* TreeSet pollFirst :  " + treeSet.pollFirst());
    System.out.println("* TreeSet pollFirst 이후, pollLast 이전 : " + treeSet.toString());
    System.out.println("* TreeSet pollLast :  " + treeSet.pollLast());
    System.out.println("* TreeSet pollLast 이후 : " + treeSet.toString());
  }

  void setMethod() {
    System.out.println("* TreeSet size : " + treeSet.size());
    System.out.println("* TreeSet contains : " + treeSet.contains(8));
    System.out.println("* TreeSet contains : " + treeSet.contains(10));
  }
}
