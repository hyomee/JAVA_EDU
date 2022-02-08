package com.hyomee.lambda;

public class LambdaMain {
  public static void main(String... args) {
    AnonymousInterfaceClass ac01 = new AnonymousInterfaceClass();
    System.out.println("객체 지향으로 함수형 : " + ac01.action("기본"));

    AnonymousInterface ac02 = new AnonymousInterface() {
      @Override
      public String action(String str) {
        return str;
      }
    };

    System.out.println("익명 이너 클래스 : " + ac02.action("익명"));

    AnonymousInterface ac03 = (String str) -> { return  str; };
    System.out.println("람다 : " + ac02.action("람다"));

    LambdaFunctional lambdaFunctional = new LambdaFunctional();
    lambdaFunctional.LamdaTest();
  }
}
