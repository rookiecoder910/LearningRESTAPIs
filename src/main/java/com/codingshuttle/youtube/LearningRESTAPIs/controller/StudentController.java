package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final   StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
@GetMapping("/student")
    public StudentDto getStudent(){
    return new StudentDto(1L,"Manas","manasop21@gmail.com");
}
@GetMapping("/student/{id}")
    public StudentDto getStudentById(){
    return new StudentDto(1L,"Manas","manasop21@gmail.com");

}
}
