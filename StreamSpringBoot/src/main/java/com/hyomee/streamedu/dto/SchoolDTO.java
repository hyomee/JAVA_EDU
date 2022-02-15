package com.hyomee.streamedu.dto;

import java.util.Objects;

public class SchoolDTO {
  private int schoolNo;
  private String schoolId;
  private String schoolName;
  private String schoolTelNo;
  private String schoolZipCode;
  private String schoolAddress;

  public SchoolDTO() {};

  public SchoolDTO(int schoolNo, String schoolId, String schoolName, String schoolTelNo, String schoolZipCode, String schoolAddress) {
    this.schoolNo = schoolNo;
    this.schoolId = Objects.isNull(schoolId) ? schoolId : "";
    this.schoolName = schoolName;
    this.schoolTelNo = schoolTelNo;
    this.schoolZipCode = schoolZipCode;
    this.schoolAddress = schoolAddress;
  }


  public int getSchoolNo() {
    return schoolNo;
  }

  public void setSchoolNo(int schoolNo) {
    this.schoolNo = schoolNo;
  }

  public String getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(String schoolId) {
    this.schoolId = schoolId;
  }

  public String getSchoolName() {
    return schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }

  public String getSchoolTelNo() {
    return schoolTelNo;
  }

  public void setSchoolTelNo(String schoolTelNo) {
    this.schoolTelNo = schoolTelNo;
  }

  public String getSchoolZipCode() {
    return schoolZipCode;
  }

  public void setSchoolZipCode(String schoolZipCode) {
    this.schoolZipCode = schoolZipCode;
  }

  public String getSchoolAddress() {
    return schoolAddress;
  }

  public void setSchoolAddress(String schoolAddress) {
    this.schoolAddress = schoolAddress;
  }

  @Override
  public String toString() {
    return "SchoolDTO{" +
        "schoolNo=" + schoolNo +
        ", schoolId='" + schoolId + '\'' +
        ", schoolName='" + schoolName + '\'' +
        ", schoolTelNo=" + schoolTelNo +
        ", schoolZipCode='" + schoolZipCode + '\'' +
        ", schoolAddress='" + schoolAddress + '\'' +
        '}';
  }
}
