package com.hyomee.generic.genericClass;

import java.util.ArrayList;
import java.util.List;

public class GenericClassMain {
  public static void main(String... args) {

    List<GenericClass<String, Integer>> cars = new ArrayList<>();
    cars.add((new GenericClass<>("쏘나타", 10000)));
    cars.add((new GenericClass<>("그랜저", 20000)));

    for(GenericClass<String, Integer> car: cars) {
      System.out.println(car.getName() + "\t가격 : " + String.format("%,d", car.getPrice() )
              + " (부가세 : " + String.format("%,.1f",car.getPrice().floatValue() * 0.1) +")");
    }


    List<GenericClass<String, Float>> fruits = new ArrayList<>();
    fruits.add((new GenericClass<>("사과", 256.5f)));
    fruits.add((new GenericClass<>("복숭아", 345.6f)));

    for(GenericClass<String, Float> fruit: fruits) {
      System.out.println(String.format("%s \t가격 : %,.1f ( 부가세 : %,.1f )"
              , fruit.getName()
              , fruit.getPrice()
              , fruit.getPrice() * 0.1 ));

    }

    GenericWildCard genericWildCard = new GenericWildCard();
    List<String> stringList = new ArrayList<>();
    stringList.add("우");
    stringList.add("리");

    genericWildCard.printList(stringList);

    // incompatible types: java.util.List<java.lang.String> cannot be converted to
    // java.util.List<? extends java.lang.Number>
    // genericWildCard.sum(stringList);

    // incompatible types: java.util.List<java.lang.String> cannot be converted
    //to java.util.List<? super java.lang.Integer>
    // genericWildCard.addList(stringList);

    List<Integer> integerList = new ArrayList<>();
    integerList.add(10);
    integerList.add(20);
    genericWildCard.addList(integerList);
    genericWildCard.printList(integerList);

   }




}
