package com.hyomee.streamedu.stream;

import java.util.Optional;

public class OptionalMain {

  public static void main(String[] arg) {
    Optional optional = Optional.empty();
    System.out.println( "optional :: " + optional);
    System.out.println( "optional.isEmpty ::" + optional.isEmpty());
    System.out.println( "optional.isPresent ::" + optional.isPresent());

    TextClass textClass = new TextClass();
    Optional<String> op = Optional.ofNullable(textClass.getTest());
    String result = op.orElse("Other");
    System.out.println( "optional result ::" + result);
    textClass.setTest("Testing....");
    op = Optional.ofNullable(textClass.getTest());
    result = op.orElse("Other");
    System.out.println( "optional set result ::" + result);

    MemberAddress memberAddress = new MemberAddress();
    Optional<Member> member = Optional.ofNullable(memberAddress.getMember());
    Optional<String> memberNo = member.map(Member::getMemberNo);
    result = memberNo.orElse("번호 없음");



    System.out.println( "optional member ::" + result);
    result = memberNo.orElseGet(()-> new String());
    System.out.println( "optional null String :: " + result);
    result = memberNo.orElseThrow(CustomException::new);
  }

}

class CustomException extends RuntimeException{

  public CustomException() {
    super();
    System.out.println("에러 ......");
  }

}

class TextClass {

  private String test;

  public String getTest() {
    return this.test;
  }

  public void setTest(String s) {
    this.test = s;
  }
}


class MemberAddress {
  private Member member;
  private Address address;

  public void setMember(Member member) {
    this.member = member;
  }

  public Member getMember() {
    return this.member;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Address getAddress() {
    return this.address;
  }
}