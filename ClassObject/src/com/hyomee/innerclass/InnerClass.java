package com.hyomee.innerclass;

public class InnerClass {
  private int num;
  private int innerNum;

  class InClass {
    private int innerNum ;

    int sum(int pnum) {
      this.innerNum = pnum + num;
      return this.innerNum;
    }

    public int getInnerNum() {
      return this.innerNum;
    }
  }

  void innerClassMethod() {
    this.innerNum = 10;
    this.num = 10;

    InClass inClass = new InClass();
    int result = inClass.sum(30);
    System.out.println("InClass.innerNum = " + inClass.getInnerNum());
    System.out.println("InnerClass.innerNum = " + innerNum);
  }
}
