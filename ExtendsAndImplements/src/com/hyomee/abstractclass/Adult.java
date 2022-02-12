package com.hyomee.abstractclass;

public abstract class Adult extends Human {
  Adult() {}

  Adult(String name) {
    super(name);
    System.out.println("Adult OverLoading 생성자 호출");
  }

  abstract void drinking();
}
