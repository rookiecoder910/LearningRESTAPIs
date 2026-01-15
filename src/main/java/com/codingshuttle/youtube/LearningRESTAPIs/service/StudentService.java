package com.codingshuttle.youtube.LearningRESTAPIs.service;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(long id);

    @Nullable StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
}
