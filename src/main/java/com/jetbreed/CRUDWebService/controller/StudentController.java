package com.jetbreed.CRUDWebService.controller;

import com.jetbreed.CRUDWebService.entity.StudentEntity;
import com.jetbreed.CRUDWebService.services.StudentService;
import com.jetbreed.CRUDWebService.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//https://github.com/jetbreed/CRUDWebService
//https://stackoverflow.com/questions/67984432/spring-boot-does-not-automatically-create-database-tables-on-mysql
@RestController
@RequestMapping("/webapi/academy/")
public class StudentController {

    private final StudentService studentService;

//    @Autowired
//    Student student;
//
//    @Autowired
//    StudentEntity studentEntity;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }


    @GetMapping("/student/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id){
        StudentEntity studentEntity = null;
        studentEntity = studentService.getStudentById(id);
        return ResponseEntity.ok(studentEntity);
    }

    @GetMapping("/studentid/{id}")
    public ResponseEntity<Student> getStudentByID(@PathVariable Long id){
        Student student = null;
        student = studentService.getStudentByID(id);
        return ResponseEntity.ok(student);
    }

}
