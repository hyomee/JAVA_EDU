package com.hyomee.streamedu;

import com.hyomee.streamedu.dto.SchoolDTO;
import com.hyomee.streamedu.dto.StudentDTO;
import com.hyomee.streamedu.dto.SubjectDTO;
import com.hyomee.streamedu.service.DataCreateService;
import com.hyomee.streamedu.service.StreamService;

import java.util.LinkedList;
import java.util.List;

public class StreamsMain {
  public static void main(String... args) {

    SchoolDTO schoolDTO = new SchoolDTO();
    StudentDTO studentDTO = new StudentDTO();
    SubjectDTO subjectDTO = new SubjectDTO();

    StreamService streamService = new StreamService();
    streamService.createStream();;
    streamService.existCreateStream(DataCreateService.createSchoolDTOtList());
    streamService.subjectScoreFilter(DataCreateService.createSubjectList(), 80);
    streamService.subjectScoreFilterTwo(DataCreateService.createSubjectList(), 80, "USER_04");
    streamService.subjectScoreFilterTwo(DataCreateService.createSubjectList(), 99, "USER_01`");
  }
}
