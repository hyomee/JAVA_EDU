package com.hyomee.streamedu.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BaseTypeStream {

  public static void main(String[] args) {
    IntStream intStream = IntStream.builder()
            .add(2)
            .add(34)
            .add(40)
            .build();

    intStream.forEach(i -> System.out.println(i));

    System.out.println("====================");

    intStream = IntStream.of(30, 40, 50);
    intStream.forEach(i -> System.out.println(i));

    System.out.println("====================");
    int[] intArrays = new int[]{20,30,40};
    intStream = Arrays.stream(intArrays, 1,3);
    intStream.forEach(i -> System.out.println(i));

    IntStream zeroToNinetyNine = IntStream.range(0,100);
    IntStream zeroToHundred = IntStream.rangeClosed(0,100);
  }
}
