package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/student")
    public StudentDto getStudent(){
    return new StudentDto(1L,"Manas","manasop21@gmail.com");
}
@GetMapping("/student/{id}")
    public StudentDto getStudentById(){
    return new StudentDto(1L,"Manas","manasop21@gmail.com");

}
}
