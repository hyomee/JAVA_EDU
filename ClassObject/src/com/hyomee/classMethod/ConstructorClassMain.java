package com.hyomee.classMethod;

public class ConstructorClassMain {
  public static void main(String[] args){
    ConstructorClass cClass01 = new ConstructorClass();
    ConstructorClass cClass02 = new ConstructorClass(10);
    System.out.println("=================================");
    ConstructorClass cClass03 = new ConstructorClass(100, 200);
  }
}
