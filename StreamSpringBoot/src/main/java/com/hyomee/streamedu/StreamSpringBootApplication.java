package com.hyomee.streamedu;

import com.hyomee.streamedu.service.DataCreateService;
import com.hyomee.streamedu.service.MapStructService;
import com.hyomee.streamedu.service.StreamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamSpringBootApplication {



  public static void main(String[] args) {

    SpringApplication.run(StreamSpringBootApplication.class, args);

    StreamService streamService = new StreamService();
    streamService.createStream();
    streamService.subjectScoreFilter(DataCreateService.createSubjectList(), 60);

    MapStructService mapStructService = new MapStructService();
    mapStructService.toSchoolSubject();
  }

}
