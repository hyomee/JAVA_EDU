package com.hyomee.abstractclass;

public abstract class Adult extends Human {
  Adult() {}

  Adult(String name) {
    // Call to 'super()' must be first statement in constructor body
    // System.out.println("Adult OverLoading 생성자 호출");
    super(name);
    System.out.println("Adult OverLoading 생성자 호출");
  }

  abstract void drinking();
}
