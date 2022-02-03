package com.hyomee.finaltest;

public class FinalMain {

  public static void main(String[] args) {
    FinalMethodChild finalMethodChild = new FinalMethodChild();
    finalMethodChild.instanceMethod();
    finalMethodChild.finalInstanceMethod();

    FinalChild finalChild = new FinalChild();
    finalChild.runFinalParent();
  }
}
