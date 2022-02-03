package com.hyomee.finaltest;

/*
  오류 Cannot inherit from final 'com.hyomee.finaltest.FinalParent'
  public class FinalChild extends FinalParent{
  }
*/
public class FinalChild {
  public void runFinalParent() {
    FinalParent finalParent = new FinalParent();
    finalParent.finalInstanceMethod();
    finalParent.finalInstancePublicMethod();
  }
}
