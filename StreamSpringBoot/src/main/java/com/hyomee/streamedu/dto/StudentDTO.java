package com.hyomee.streamedu.dto;

public class StudentDTO {
  private int schoolNo;
  private String userId;
  private String userNm;
  private int age;
  private String zipCode;
  private String address;

  public StudentDTO() {};

  public StudentDTO(int schoolNo, String userId, String userNm, int age, String zipCode, String address) {
    this.schoolNo = schoolNo;
    this.userId = userId;
    this.userNm = userNm;
    this.userNm = userNm;
    this.zipCode = zipCode;
    this.address = address;
  }

  public int getSchoolNo() {
    return schoolNo;
  }

  public void setSchoolNo(int schoolNo) {
    this.schoolNo = schoolNo;
  }

  public String getUserNm() {
    return userNm;
  }

  public void setUserNm(String userNm) {
    this.userNm = userNm;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "UserDTO{" +
        "userId='" + userId + '\'' +
        ", userNm='" + userNm + '\'' +
        ", age='" + age + '\'' +
        '}';
  }
}
