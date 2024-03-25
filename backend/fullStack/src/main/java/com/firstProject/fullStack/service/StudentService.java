package com.firstProject.fullStack.service;

import com.firstProject.fullStack.modals.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAll();
}
