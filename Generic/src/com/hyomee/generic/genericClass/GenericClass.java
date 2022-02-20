package com.hyomee.generic.genericClass;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T, V> {
  private T name;
  private V price;

  GenericClass(T name, V price) {
    this.name = name;
    this.price = price;

  }
  public T getName() {
    return name;
  }

  public void setName(T name) {
    this.name = name;
  }

  public V getPrice() {
    return price;
  }

  public void setPrice(V price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "GenericClass{" +
            "name=" + name +
            ", price=" + price +
            '}';
  }
}
