package com.codingshuttle.youtube.LearningRESTAPIs.repository;

import com.codingshuttle.youtube.LearningRESTAPIs.controller.StudentController;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
