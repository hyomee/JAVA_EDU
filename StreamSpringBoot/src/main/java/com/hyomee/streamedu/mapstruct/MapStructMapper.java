package com.hyomee.streamedu.mapstruct;

import com.hyomee.streamedu.dto.SchoolDTO;
import com.hyomee.streamedu.dto.SchoolSubjectDTO;
import com.hyomee.streamedu.dto.StudentDTO;
import com.hyomee.streamedu.dto.SubjectDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface MapStructMapper {

  SchoolSubjectDTO sourceToDestination(SchoolDTO schoolDTO);

  @Mapping(target="schoolNo", source="subjectDTO.schoolNo")
  SchoolSubjectDTO sourceToDestination(SubjectDTO subjectDTO);

  @Mapping(target="schoolNo", source="schoolDTO.schoolNo")
  SchoolSubjectDTO sourceToDestination(SchoolDTO schoolDTO, SubjectDTO subjectDTO);

  @Mapping(target="userId", source="subjectDTO.userId")
  @Mapping(target="subjectId", source="subjectDTO.subjectId")
  @Mapping(target="subjectName", source="subjectDTO.subjectName")
  @Mapping(target="score", source="subjectDTO.score")
  @Mapping(target="schoolNo", source="subjectDTO.schoolNo")
  SchoolSubjectDTO sourceToDestination(SchoolSubjectDTO schoolSubjectDTO, SubjectDTO subjectDTO);

  @Mapping(target="schoolNo", source="schoolDTO.schoolNo")
  @Mapping(target="schoolId", source="schoolDTO.schoolId")
  @Mapping(target="schoolName", source="schoolDTO.schoolName")
  @Mapping(target="subjectName", source="schoolSubjectDTO.subjectName")
  SchoolSubjectDTO sourceToDestination(SchoolSubjectDTO schoolSubjectDTO, SchoolDTO schoolDTO);

  @Mapping(target="userId", source="studentDTO.userId")
  @Mapping(target="userNm", source="studentDTO.userNm")
  @Mapping(target="schoolNo", source="schoolSubjectDTO.schoolNo")
  SchoolSubjectDTO sourceToDestination(SchoolSubjectDTO schoolSubjectDTO, StudentDTO studentDTO);
}
