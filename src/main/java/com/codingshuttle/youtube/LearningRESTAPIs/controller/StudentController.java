package com.codingshuttle.youtube.LearningRESTAPIs.controller;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import com.codingshuttle.youtube.LearningRESTAPIs.repository.StudentRepository;
import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")

public class StudentController {
    private final StudentService studentService;

@GetMapping
    public ResponseEntity<List<StudentDto>>getAllStudent(){
//    return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    return ResponseEntity.ok(studentService.getAllStudents());
}
@GetMapping("/{id}")     //fetch data from the db
    public ResponseEntity<StudentDto> getStudentById(@PathVariable long id){

    return ResponseEntity.ok(studentService.getStudentById(id));


}
@PostMapping("/create")  //use to create and add new data to db
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto){
       return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
}
@DeleteMapping("/{id}") //delete data from the db
    public ResponseEntity<Void> deleteStudentById(@PathVariable long id){
    studentService.deleteStudentById(id);
return ResponseEntity.noContent().build();
}
@PutMapping("/{id}") //can update whole field values of the exisiting records
    public ResponseEntity<StudentDto>updateStuden(@PathVariable long id, @RequestBody AddStudentRequestDto addStudentRequestDto){
   return ResponseEntity.ok(studentService.updateStudent(id,addStudentRequestDto));
}
@PatchMapping("/{id}")  //can update partial data only
    public ResponseEntity<StudentDto> updatePartialStudent(@PathVariable long id, @RequestBody Map<String,Object>updates){
    return ResponseEntity.ok(studentService.updatePartialStudent(id,updates));
}
}
//hello