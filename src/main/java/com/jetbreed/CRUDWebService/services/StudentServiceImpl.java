package com.jetbreed.CRUDWebService.services;

import com.jetbreed.CRUDWebService.entity.StudentEntity;
import com.jetbreed.CRUDWebService.model.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jetbreed.CRUDWebService.repository.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{

//    @Autowired

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        BeanUtils.copyProperties(student,studentEntity);
        studentRepository.save(studentEntity);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        List<StudentEntity> studentEntities = studentRepository.findAll();

        List<Student> students = studentEntities.stream().map(
                studentEntity -> new Student(
                        studentEntity.getId(),
                        studentEntity.getFirstname(),
                        studentEntity.getMiddlename(),
                        studentEntity.getLastname(),
                        studentEntity.getEmail())
        ).collect(Collectors.toList());
        return students;
    }

}
