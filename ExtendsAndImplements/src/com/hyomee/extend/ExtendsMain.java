package com.hyomee.extend;

public class ExtendsMain {

  public static void main(String... args) {

    Student student = new Student();
    Human human = student;

    Human studentHuman = new Student();
    Student student01 = (Student) studentHuman;

    Student student02 = new Human();

    Student student03 = (Student) new Human();

    Human human01 = new Human();
    Student student04 = (Student) human;

  }
}
