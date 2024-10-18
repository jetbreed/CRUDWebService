package com.jetbreed.CRUDWebService.controller;

import com.jetbreed.CRUDWebService.entity.StudentEntity;
import com.jetbreed.CRUDWebService.services.StudentService;
import com.jetbreed.CRUDWebService.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://github.com/jetbreed/CRUDWebService
//https://stackoverflow.com/questions/67984432/spring-boot-does-not-automatically-create-database-tables-on-mysql
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/webapi/academy/")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    Student student;

    @Autowired
    StudentEntity studentEntity;

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
    public ResponseEntity<StudentEntity>getStudentById(@PathVariable Long id){
        studentEntity = studentService.getStudentById(id);
        return ResponseEntity.ok(studentEntity);
    }
    @GetMapping("/studentid/{id}")
    public ResponseEntity<Student> getStudentByID(@PathVariable Long id){
        student = studentService.getStudentByID(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student){
    student = studentService.updateStudent(id, student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Map<String, Boolean>>deleteStudent(@PathVariable Long id){
        boolean deleted = false;
        deleted = studentService.deleteStudent(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }
}
