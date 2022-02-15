package com.hyomee.streamedu.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Concat {

  public static <T> void main(String[] strings) {
    List<Member> memberList = Arrays.asList(new Member("1", "홍길동"),
                                            new Member("1", "김길자")
                                           );

    List<Address> addressList = Arrays.asList(new Address("1", "서울시 송파구"),
                                              new Address("1", "서울시 강동구")
                                      );

    Stream<Member> streamMember =  memberList.stream();
    Stream<Address> streamAdress = addressList.stream();

    Stream<T> streamMemberAddress = (Stream<T>) Stream.concat(streamMember, streamAdress);
    streamMemberAddress.forEach(t->{
      if ( t instanceof Address) {
        Address a = (Address) t;
        System.out.println("Address : " + a.getMemberNo() + ", Address : " + a.getAddress());
      } else if (t instanceof Member) {
        Member a = (Member) t;
        System.out.println("MemberNo : " + a.getMemberNo() + ", MemberNm : " + a.getMemberNm());
      }
    });


    List<String> asList = Arrays.asList("홍길동", "김길자", "홍길동", "홍상훈", "김길자");

    Stream<String> stream1 = asList.stream().distinct();
    stream1.forEach(System.out::println);

    List<String> langs = Arrays.asList("java", "kotlin", "haskell", "ruby", "smalltalk");
    System.out.println("sorted:");
    langs.stream().sorted().forEach(System.out::println);

    System.out.println("reversed:");
    langs.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    langs = Arrays.asList("java", "kotlin", "haskell", "ruby", "smalltalk");

    System.out.println("sorted:");
    langs.stream().sorted(Comparator.comparing(String::length)) .forEach(System.out::println);

    System.out.println("reversed:");
    langs.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

    List<String> elements =
            Arrays.asList("a", "a1", "b", "b1", "c", "c1");
    Optional<String> firstElement = elements.stream()
            .filter(s -> s.startsWith("b")).findFirst();
    Optional<String> anyElement = elements.stream()
            .filter(s -> s.startsWith("b")).findAny();
    firstElement.ifPresent(System.out::println);
    anyElement.ifPresent(System.out::println);


    List<String> elementList = Arrays.asList("a", "a1", "b", "b1", "c", "c1");

    boolean anyMatch = elements.stream().anyMatch(s -> s.startsWith("b"));
    System.out.println("anyMatch: " + (anyMatch ? "true" : "false"));

    boolean allMatch  = elements.stream().allMatch(s -> s.startsWith("b"));
    System.out.println("allMatch: " + (allMatch ? "true" : "false"));

    boolean noneMatch  = elements.stream().noneMatch(s -> s.startsWith("b"));
    System.out.println("noneMatch: " + (noneMatch ? "true" : "false"));

  }
}


class Member {
  private String memberNo;
  private String memberNm;

  public Member(String memberNo, String memberNm) {
    this.memberNm = memberNm;
    this.memberNo = memberNo;
  }

  public String getMemberNo() {
    return this.memberNo;
  }

  public String getMemberNm() {
    return this.memberNm;
  }
}

class Address {
  private String address;
  private String memberNo;

  public Address(String memberNo, String address) {
    this.address = address;
    this.memberNo = memberNo;
  }

  public String getMemberNo() {
    return this.memberNo;
  }

  public String getAddress() {
    return this.address;
  }
}
