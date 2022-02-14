package com.hyomee.streamedu.service;

import com.hyomee.streamedu.dto.SchoolDTO;
import com.hyomee.streamedu.dto.SubjectDTO;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class DataCreateService {

  public static Stream<Object> createSubjectDTOStream() {
    return Stream.builder()
        .add(new SubjectDTO("USER_01", "SUBJECT_01", "국어", 80))
        .add(new SubjectDTO("USER_01", "SUBJECT_02", "영어", 90))
        .add(new SubjectDTO("USER_01", "SUBJECT_02", "수학", 85))
        .add(new SubjectDTO("USER_02", "SUBJECT_02", "국어", 70))
        .add(new SubjectDTO("USER_02", "SUBJECT_02", "영어", 80))
        .add(new SubjectDTO("USER_02", "SUBJECT_02", "수학", 75))
        .add(new SubjectDTO("USER_03", "SUBJECT_02", "국어", 95))
        .add(new SubjectDTO("USER_03", "SUBJECT_02", "영어", 65))
        .add(new SubjectDTO("USER_03", "SUBJECT_02", "수학", 75))
        .add(new SubjectDTO("USER_04", "SUBJECT_02", "국어", 95))
        .add(new SubjectDTO("USER_04", "SUBJECT_02", "영어", 85))
        .add(new SubjectDTO("USER_05", "SUBJECT_02", "수학", 75))
        .build();
  }


  public static List<SubjectDTO> createSubjectList() {
    List<SubjectDTO> subjectlDTOList = new LinkedList<SubjectDTO>();
    subjectlDTOList.add(new SubjectDTO(1,"USER_01", "SUBJECT_01", "국어", 80));
    subjectlDTOList.add(new SubjectDTO(1,"USER_01", "SUBJECT_02", "영어", 90));
    subjectlDTOList.add(new SubjectDTO(1, "USER_01", "SUBJECT_02", "수학", 85));
    subjectlDTOList.add(new SubjectDTO(2,"USER_02", "SUBJECT_02", "국어", 70));
    subjectlDTOList.add(new SubjectDTO(2,"USER_02", "SUBJECT_02", "영어", 80));
    subjectlDTOList.add(new SubjectDTO(2,"USER_02", "SUBJECT_02", "수학", 75));
    subjectlDTOList.add(new SubjectDTO(1,"USER_03", "SUBJECT_02", "국어", 95));
    subjectlDTOList.add(new SubjectDTO(1,"USER_03", "SUBJECT_02", "영어", 65));
    subjectlDTOList.add(new SubjectDTO(1,"USER_03", "SUBJECT_02", "수학", 75));
    subjectlDTOList.add(new SubjectDTO(2,"USER_04", "SUBJECT_02", "국어", 95));
    subjectlDTOList.add(new SubjectDTO(2,"USER_04", "SUBJECT_02", "영어", 85));
    subjectlDTOList.add(new SubjectDTO(2,"USER_05", "SUBJECT_02", "수학", 75));
    return subjectlDTOList;
  }

  public static List<SchoolDTO> createSchoolDTOtList() {
    List<SchoolDTO> schoolDTOList = new LinkedList<SchoolDTO>();
    schoolDTOList.add(new SchoolDTO(1, "SC_0001", "제주학교", "04-234-1234", "400-100", "제주 제주시 성산동"));
    schoolDTOList.add(new SchoolDTO(2, "SC_0002", "서울학교", "02-345-1234", "200-200", "서울 송파구 방이동"));
    schoolDTOList.add(new SchoolDTO(3, "SC_0003", "강원학교", "03-202-9879", "300-300", "강원 춘천시 춘천동"));
    schoolDTOList.add(new SchoolDTO(4, "SC_0004", "전라학교", "06-234-1234", "600-400", "전라 전라시 전라동"));
    schoolDTOList.add(new SchoolDTO(5, "SC_0005", "경상학교", "05-357-9879", "500-500", "경상 경산군 경산읍"));
    schoolDTOList.add(new SchoolDTO(6, "SC_0006", "경기학교", "01-678-1234", "100-100", "경기 경기시 경기구"));
    return schoolDTOList;
  }

}
