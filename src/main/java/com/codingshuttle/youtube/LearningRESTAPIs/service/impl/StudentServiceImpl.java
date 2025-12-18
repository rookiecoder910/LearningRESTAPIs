package com.codingshuttle.youtube.LearningRESTAPIs.service.impl;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import com.codingshuttle.youtube.LearningRESTAPIs.repository.StudentRepository;
import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
      return students
                .stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .toList();

    }

    @Override
    public StudentDto getStudentById(long id) {
        if(id < 0){
            throw new IllegalArgumentException("Invalid ID: must be > 0");
        }
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("student not found by id: " + id));

        return modelMapper.map(student, StudentDto.class);
    }

}