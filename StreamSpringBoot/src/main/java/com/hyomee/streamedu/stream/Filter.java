package com.hyomee.streamedu.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

  public static void main(String[] arg) {

    List<String> address = new ArrayList<>();
    address.add("서울시 송파구 방이동");
    address.add("서울시 송파구 송파동");
    address.add("서울시 강남구 개포동");
    address.add("서울시 강남구 서초동");

    // Filter : Stream 요소를 하나씩 검색 하여 조건에 만족하는 것을 걸려내는 작업
    //          predicate<T>, 즉 T를 인자로 받고 boolean을 리턴하는 험수형 인터페이스로 평가식을 작성
    Stream<String> addressStream = address.stream();
    List<String> songpa = addressStream.filter(s -> s.contains("송파구")).collect(Collectors.toList());
    songpa.stream().forEach(System.out::println);

    System.out.println("=======================================");
    // Map : Stream 요소에 있는 값들을 특정 방식으로 변환 하고 싶을 떄 사용
    //       변환을 수행 하는 함수를 파라미터로 받는다.
    List<String> tmp = address.stream().map(s->s.replaceAll("송파구", "송파")).collect(Collectors.toList());
    tmp.stream().forEach(s-> System.out.println(s));
    System.out.println("=======================================");



    String[][] arrays = new String[][]{ {"a1", "a2"}, {"b1", "b2"}, {"c1", "c2", "c3"} };
    Stream<String[]> stream4 = Arrays.stream(arrays);
    Stream<String> stream5 = stream4.flatMap(s -> Arrays.stream(s));
    stream5.map(String::toUpperCase).forEach(System.out::println);



  }
}


