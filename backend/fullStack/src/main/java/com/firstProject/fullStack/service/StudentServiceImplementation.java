package com.firstProject.fullStack.service;

import com.firstProject.fullStack.modals.Student;
import com.firstProject.fullStack.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
