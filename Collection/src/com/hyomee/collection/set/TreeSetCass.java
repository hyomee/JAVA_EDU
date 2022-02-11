package com.hyomee.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

class TreeSetCass  {
  TreeSet<Integer> treeSet = new TreeSet<Integer>();

  TreeSetCass() {
    System.out.println("* TreeSetCass ================");
    insertTreeSet();
    getTreeSet();
    setMethod();
    treeSet.clear();
    sortedSet();

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

  void sortedSet() {
    insertTreeSet();
    SortedSet headSet = treeSet.headSet(5);
    System.out.println("* TreeSet treeSet : " + treeSet.toString());
    System.out.println("* SortedSet headSet(5) : " + headSet.toString());
    SortedSet tailSet = treeSet.tailSet(5);
    System.out.println("* SortedSet tailSet(5) : " + tailSet.toString());
    SortedSet subSet = treeSet.subSet(3,6);
    System.out.println("* SortedSet subSet(3,6) : " + subSet.toString());
    SortedSet subSetfromInclude = treeSet.subSet(3, true, 6, false);
    System.out.println("* SortedSet subSet(3, true, 6, false) : " + subSetfromInclude.toString());
    SortedSet subSetToInclude = treeSet.subSet(3, false, 6, true);
    System.out.println("* SortedSet subSet(3, false, 6, true) : " + subSetToInclude.toString());
    SortedSet subSetFromToInclude = treeSet.subSet(3, true, 6, true);
    System.out.println("* SortedSet subSet(3, true, 6, true) : " + subSetFromToInclude.toString());
    SortedSet subSetFromTofalse = treeSet.subSet(3, false, 6, false);
    System.out.println("* SortedSet subSet(3, false, 6, false) : " + subSetFromTofalse.toString());
  }
}
