package com.hyomee.streamedu.service;

import com.hyomee.streamedu.dto.SchoolDTO;
import com.hyomee.streamedu.dto.StudentDTO;
import com.hyomee.streamedu.dto.SubjectDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamService {

  private SchoolDTO schoolDTO;
  private StudentDTO studentDTO;
  private SubjectDTO subjectDTO;

  private List<SchoolDTO> schoolDTOList;
  private List<StudentDTO> studentDTOList;
  private List<SubjectDTO> subjectDTOList;

  public StreamService() {};

  public StreamService(SchoolDTO schoolDTO, StudentDTO studentDTO, SubjectDTO subjectDTO) {
    this.schoolDTO = schoolDTO;
    this.studentDTO = studentDTO;
    this.subjectDTO = subjectDTO;
  }


  public StreamService(List<SchoolDTO> schoolDTOList, List<StudentDTO> studentDTOList, List<SubjectDTO> subjectDTOList) {
    this.schoolDTOList = schoolDTOList;
    this.studentDTOList = studentDTOList;
    this.subjectDTOList = subjectDTOList;
  }

  public void logInstanceMember() {
    System.out.println("학교 : " + schoolDTO.toString());
    System.out.println("학생 : " + studentDTO.toString());
    System.out.println("과목 : " + subjectDTO.toString());
  }

  // Stream 생성
  public void createStream() {
    // 빈 Stream 생성
    Stream<Object> emptyStream = Stream.empty();
    System.out.println("빈 Stream : " + emptyStream.count());

    // of를 이용한 가변 Stream 생성
    System.out.println("* of를 이용한 가변 Stream 생성* ");
    Stream<String> subjectStream = Stream.of("국어", "영어", "수힉");
    subjectStream.forEach(subject -> System.out.println(subject));

    // 빌더를 이욯한 Stream 생성
    System.out.println("* 빌더를 이욯한 Stream 생성 * ");
    Stream<Object> subjectDTOStream = DataCreateService.createSubjectDTOStream();
    subjectDTOStream.forEach(subject -> System.out.println(subject.toString()));
  }

  // 기존 장보를 가지고 Stream 생성
  public void existCreateStream(List<SchoolDTO> schoolDTOList) {

    // 학교명 문자배열을 만들어서 추출
    String[] schoolNameArray = new String[schoolDTOList.size()];
    for (int index = 0; index < schoolDTOList.size() ; index++) {
      schoolNameArray[index] = schoolDTOList.get(index).getSchoolName();
    }

    // Array Stream 생성
    System.out.println("* Array Stream 생성 * ");
    Stream<String> schoolStream = Arrays.stream(schoolNameArray);
    schoolStream.forEach(schoolDTO -> System.out.println(schoolDTO.toString()));

    // Array 요소 중에서 위치를 주어서 일부만 생성
    System.out.println("* Array 요소 중에서 위치를 주어서 일부만 생성 * ");
    Stream<String> schoolPositionStream = Arrays.stream(schoolNameArray, 0, 2);
    schoolPositionStream.forEach(schoolDTO -> System.out.println(schoolDTO.toString()));

    // Collection Stream 생성 : Collection ( List, Set )
    System.out.println("* Collection Stream 생성 : Collection ( List, Set ) * ");
    Stream<SchoolDTO> schoolDTOListStream = schoolDTOList.stream();
    schoolDTOListStream.forEach(schoolDTO -> System.out.println(schoolDTO.toString()));

  }
  
  // filter : 특정 조건과 일치 하는 모든 요소를 담는 새로운 객체를 돌려줌
  public void subjectScoreFilter(List<SubjectDTO> subjectDTOList, int score) {
    System.out.println("* Filter : 단일 조건 * ");
    List<SubjectDTO> subjectDTOOverScore = subjectDTOList.stream()
        .filter(subjectDTO -> subjectDTO.getScore() > score)
        .collect(Collectors.toList());

    subjectDTOOverScore.forEach(schoolDTO -> System.out.println(schoolDTO.toString()));
  }

  public void subjectScoreFilterTwo(List<SubjectDTO> subjectDTOList, int score, String userId) {
    System.out.println("* Filter : 복수 조건 * ");
    List<SubjectDTO> subjectDTOOverScore = subjectDTOList.stream()
        .filter(subjectDTO -> subjectDTO.getScore() > score && subjectDTO.getUserId().equals(userId))
        .collect(Collectors.toList());

    subjectDTOOverScore.forEach(schoolDTO -> System.out.println(schoolDTO.toString()));
  }

}
