package com.hyomee.innerclass.innerclass;

public class InnerClassMain {
  public static void main(String... args) {
    System.out.println(" * Inner Class * ");
    Human human = new Human();
    human.eat();
    Human.Student student = human.new Student("SB-000-0001", "한국학교");
    student.eat();
    student.viewStudent();

    System.out.println(" * Static Inner Class * ");
    StaticHuman.eat();
    StaticHuman staticHuman = new StaticHuman();
    System.out.println("이름 : " + staticHuman.name);
    StaticHuman.StaticStudent staticStudent =
            new StaticHuman.StaticStudent("SB-000-0001", "한국학교");
    staticStudent.eat();
    staticStudent.viewStudent();
  }
}
