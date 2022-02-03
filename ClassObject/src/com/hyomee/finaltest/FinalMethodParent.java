package com.hyomee.finaltest;

public class FinalMethodParent {
  protected void instanceMethod() {
    System.out.println("Parent Instance Method ... ");
  }

  final protected void finalInstanceMethod() {
    System.out.println("Parent final Instance Method ... ");
  }
}
