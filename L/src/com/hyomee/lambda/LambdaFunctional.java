package com.hyomee.lambda;

interface IfNoRnNoArg {
  void method();
}

interface IfNoRnArg {
  void method(int a);
}

interface IfRnNoArg {
  int method();
}

interface IfRnArg {
  int method(int a, int b);
}

public class LambdaFunctional {

  public void LamdaTest() {
    IfNoRnNoArg iNrNa = () -> { System.out.println("IfNoRnNoArg.method");};
    iNrNa.method();


    IfNoRnArg iNra = (a) -> { System.out.println("IfNoRnArg.method a : " + a); };
    iNra.method(1);

    IfRnNoArg irNa = () -> {
      int a = 10;
      return a;
    };
    System.out.println("IfRnNoArg.method : " + irNa.method());

    IfRnArg ira = (a, b) -> { return a + b; };
    System.out.println("IfRnArg.method : " + ira.method(5, 10));
  }
}
