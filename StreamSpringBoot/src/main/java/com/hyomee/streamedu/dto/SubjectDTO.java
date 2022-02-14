package com.hyomee.streamedu.dto;

public class SubjectDTO {


  private int schoolNo;
  private String userId;
  private String subjectId;
  private String subjectName;
  private int score;

  public SubjectDTO() {};


  public SubjectDTO(String userId, String subjectId, String subjectName, int score) {
    this.userId = userId;
    this.subjectId = subjectId;
    this.subjectName = subjectName;
    this.score = score;
  }

  public SubjectDTO(int schoolNo, String userId, String subjectId, String subjectName, int score) {
    this.schoolNo = schoolNo;
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
    return "SubjectDTO{" +
        ", schoolNo='" + schoolNo + '\'' +
        ", userId='" + userId + '\'' +
        ", subjectId='" + subjectId + '\'' +
        ", subjectName='" + subjectName + '\'' +
        ", score=" + score +
        '}';
  }
}
