package com.codingshuttle.youtube.LearningRESTAPIs.service;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(long id);

     StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
     void deleteStudentById(long id);

    StudentDto updateStudent(long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(long id, Map<String, Object> updates);
}
