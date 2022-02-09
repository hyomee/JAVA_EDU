package com.hyomee.collection.vector;


class CustomerClone implements Cloneable {

  private String name;
  private int age;

  CustomerClone(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  @Override
  public CustomerClone clone() {
    try {
      CustomerClone clone = (CustomerClone) super.clone();
      // TODO: copy mutable state here, so the clone can't change the internals of the original
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}