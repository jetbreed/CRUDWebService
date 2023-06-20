package com.jetbreed.CRUDWebService.services;


import com.jetbreed.CRUDWebService.entity.StudentEntity;
import com.jetbreed.CRUDWebService.model.Student;

import java.util.List;

public interface StudentService {
//CRUD
//API verbs
//HTTP verbs

    Student createStudent(Student student);

    List<Student> getAllStudent();

    StudentEntity getStudentById(Long id);
    Student getStudentByID(Long id);

    Student updateStudent(Long id, Student student);

//    public void deleteStudent();


}
