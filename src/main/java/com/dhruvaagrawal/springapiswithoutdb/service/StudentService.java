package com.dhruvaagrawal.springapiswithoutdb.service;

import com.dhruvaagrawal.springapiswithoutdb.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> fetchAllStudents();

    public Student fetchStudentById(Long studentId);

    public Student saveStudent(Student student);

    public Student replaceStudent(Long id, Student student);

    public void deleteStudent(Long studentId);

    public Student fetchStudentByUsername(String studentUsername);
}
