package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import com.codingshuttle.youtube.LearningRESTAPIs.repository.StudentRepository;
import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class StudentController {
    private final StudentService studentService;

@GetMapping("/students")
    public ResponseEntity<List<StudentDto>>getAllStudent(){
//    return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    return ResponseEntity.ok(studentService.getAllStudents());
}
@GetMapping("/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable long id){

    return ResponseEntity.ok(studentService.getStudentById(id));


}
@PostMapping
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
       return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
}
}
//hello