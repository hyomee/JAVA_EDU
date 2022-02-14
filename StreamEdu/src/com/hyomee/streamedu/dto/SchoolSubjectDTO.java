package com.hyomee.streamedu.dto;

public class SchoolSubjectDTO {

  private int schoolNo;
  private String schoolId;
  private String schoolName;
  private String userId;
  private String subjectId;
  private String subjectName;
  private int score;

  public SchoolSubjectDTO() {}

  public SchoolSubjectDTO(int schoolNo, String schoolId, String schoolName, String userId, String subjectId, String subjectName, int score) {
    this.schoolNo = schoolNo;
    this.schoolId = schoolId;
    this.schoolName = schoolName;
    this.userId = userId;
    this.subjectId = subjectId;
    this.subjectName = subjectName;
    this.score = score;
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

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }


  @Override
  public String toString() {
    return "SchoolSubjectDTO{" +
            "schoolNo=" + schoolNo +
            ", schoolId='" + schoolId + '\'' +
            ", schoolName='" + schoolName + '\'' +
            ", userId='" + userId + '\'' +
            ", subjectId='" + subjectId + '\'' +
            ", subjectName='" + subjectName + '\'' +
            ", score=" + score +
            '}';
  }
}
