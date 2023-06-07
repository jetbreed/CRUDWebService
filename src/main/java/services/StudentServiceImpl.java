package services;

import entity.StudentEntity;
import model.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
    StudentRepository studentRepository;
    @Override
    public Student createStudent(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        BeanUtils.copyProperties(student,studentEntity);
        studentRepository.save(studentEntity);
        return student;
    }
}
