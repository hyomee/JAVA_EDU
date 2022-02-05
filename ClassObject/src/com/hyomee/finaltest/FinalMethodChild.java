package com.hyomee.finaltest;

public class FinalMethodChild extends FinalMethodParent {
  public FinalMethodChild() {

  }
  public void instanceMethod() {
    super.instanceMethod();
    super.finalInstanceMethod();
    System.out.println("Child Instance Method ... ");
  }

/*
  오류 : 'finalInstanceMethod()' cannot override 'finalInstanceMethod()'
  in 'com.hyomee.finaltest.FinalMethodParent'; overridden method is final
  final public void finalInstanceMethod() {
    System.out.println("Parent final Instance Method ... ");
  }
*/
}


