package com.hyomee.streamedu.service;

import com.hyomee.streamedu.dto.SchoolDTO;
import com.hyomee.streamedu.dto.SchoolSubjectDTO;
import com.hyomee.streamedu.dto.SubjectDTO;

import com.hyomee.streamedu.mapstruct.MapStructMapper;
import com.hyomee.streamedu.mapstruct.MapStructMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MapStructService {

  private  MapStructMapper mapStructMapper = new MapStructMapperImpl() ;



  public void toSchoolSubject() {
    List<SchoolDTO>  schoolDTOList = DataCreateService.createSchoolDTOtList();
    List<SubjectDTO> subjectDTOList = DataCreateService.createSubjectList();

    schoolDTOList.stream().forEach(s -> System.out.println(s.toString()));
    subjectDTOList.stream().forEach(s -> System.out.println(s.toString()));

    SubjectDTO subjectDTO =  new SubjectDTO("USER_05", "SUBJECT_02", "수학", 75);
    SchoolDTO schoolDTO = new SchoolDTO(1, "SC_0001", "제주학교", "04-234-1234", "400-100", "제주 제주시 성산동");

    SchoolSubjectDTO schoolSubjectDTORn = mapStructMapper.sourceToDestination(mapStructMapper.sourceToDestination(schoolDTO), subjectDTO);
    System.out.println(schoolSubjectDTORn.toString());


    List<Optional<SchoolSubjectDTO>> subjectDTOr = subjectDTOList.stream().filter(subjectDTO1 -> subjectDTO1.getSchoolNo() == 1 )
            .map(subjectDTO1 -> mapStructMapper.sourceToDestination(subjectDTO1))
            .map(schoolSubjectDTO1 -> concatSchool(schoolDTOList, schoolSubjectDTO1))
            .collect(Collectors.toList());

    subjectDTOr.stream().forEach(s -> System.out.println(s.toString()));
  }

  private Optional<SchoolSubjectDTO> concatSchool (List<SchoolDTO>  schoolDTOList, SchoolSubjectDTO schoolSubjectDTO1) {
     try {
        // school -> schoolSubjectDTO1.getSchoolNo() == 6 오류 유발
       return Optional.of(schoolDTOList.stream().filter(school -> schoolSubjectDTO1.getSchoolNo() == schoolSubjectDTO1.getSchoolNo())
               .map(school-> mapStructMapper.sourceToDestination(schoolSubjectDTO1, school)).collect(Collectors.toList()).get(0));
     } catch (IndexOutOfBoundsException e) {
       return Optional.of(schoolSubjectDTO1);
     }
  }

 /* private Optional<SchoolSubjectDTO> mappe01 (List<SchoolDTO>  schoolDTOList, SchoolSubjectDTO schoolSubjectDTO1) {
    try {
      // school -> schoolSubjectDTO1.getSchoolNo() == 6 오류 유발
      return Optional.of(schoolDTOList.stream().filter(school -> schoolSubjectDTO1.getSchoolNo() == schoolSubjectDTO1.getSchoolNo())
              .map(school-> mapStructMapper.sourceToDestination(schoolSubjectDTO1, school)).collect(Collectors.toList()).get(0));
    } catch (IndexOutOfBoundsException e) {
      return Optional.of(schoolSubjectDTO1);
    }
  }*/
}
