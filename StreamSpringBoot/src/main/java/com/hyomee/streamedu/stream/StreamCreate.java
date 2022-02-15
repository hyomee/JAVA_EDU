package com.hyomee.streamedu.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamCreate {
  public static void main(String[] arg) {

    System.out.println("===================================================");
    System.out.println("*. Stream.of를 이용한 Stream 생성  ");
    Stream<String> streamof = Stream.of("java", "c#", "c++");
    streamof.forEach(o->System.out.println(o.getClass() + "::"  + o));

    System.out.println("1. null를 대신 하여 empty 객체 생성 ");
    Stream<String> stream = Stream.empty();
    System.out.println("stream :: " + stream.count());
    System.out.println("Stream.<String>empty()와 같음");

    System.out.println("===================================================");
    System.out.println("2. builer를 이용한 객체 생성 ( Object ) ");
    Stream<Object> objectStream = Stream.builder()
            .add("java")
            .add("c#")
            .add("java scaipt")
            .build();
    objectStream.forEach(o->System.out.println(o.getClass() + "::" + o));

    System.out.println("===================================================");
    System.out.println("2. builer를 이용한 객체 생성 ( String ) ");
    Stream<String> stringStream = Stream.<String>builder()
            .add("java")
            .add("c#")
            .add("java scaipt")
            .build();
    stringStream.forEach(o->System.out.println(o.getClass() + "::"  + o));



    System.out.println("===================================================");
    System.out.println("4. generate을 이용한 무한 스크림 생성 :: 주의 사이즈를 정해야함  ");
    Stream<String> streamGenerate = Stream.generate(()->"Echo").limit(5);
    streamGenerate.forEach(o->System.out.println(o.getClass() + "::"  + o));
    Stream<Double> streamGenerateRandoms = Stream.generate(Math::random).limit(5);
    streamGenerateRandoms.forEach(o->System.out.println(o.getClass() + "::"  + o));

    System.out.println("===================================================");
    System.out.println("5. iterate 이용한 스크림 생성 :: 주의 사이즈를 정해야함, 초기값 부터 해당값 ..  ");
    Stream<Integer> streamIterate = Stream.iterate(50, n->n+5).limit(5);
    streamIterate.forEach(o->System.out.println(o.getClass() + "::"  + o));

    System.out.println("===================================================");
    System.out.println("6. 믄자영 스트림 : 정규 표현식을 이용한 문자열  ");
    Stream<String> compileStreams = Pattern.compile(", ").splitAsStream("python, nodejs");
    compileStreams.forEach(o->System.out.println(o.getClass() + "::"  + o));

    System.out.println("===================================================");
    System.out.println("6. 스트림 연결하기  ");
    Stream<String> language1 = Stream.of("java", "c#", "c++");
    Stream<String> language2 = Stream.of("python", "nodejs");
    Stream<String> concat = Stream.concat(language1, language2);
    concat.forEach(o->System.out.println(o.getClass() + "::"  + o));
  }
}
