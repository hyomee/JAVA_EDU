package com.hyomee.extend;

public class Human {
  private String name;
  int age;
  float weight;
  float height;

  Human() { }

  Human(String name) {
    System.out.println("Human Overloading 생성자 생성");
    this.name = name;
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }
  void eat() {
    System.out.println("먹는다.");
  }
  void sleep() {
    System.out.println("잔다.");
  }
}
