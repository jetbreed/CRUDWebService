package com.jetbreed.CRUDWebService.services;


import com.jetbreed.CRUDWebService.model.Student;

import java.util.List;

public interface StudentService {
//CRUD
//API verbs
//HTTP verbs

    Student createStudent(Student student);

    List<Student> getAllStudent();
//
//    public void getStudentById();
//
//    public void updateStudent();
//
//    public void deleteStudent();


}
