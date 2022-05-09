package com.dhruvaagrawal.springapiswithoutdb.service;

import com.dhruvaagrawal.springapiswithoutdb.entity.Student;
import com.dhruvaagrawal.springapiswithoutdb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> fetchAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public Student fetchStudentByUsername(String studentUsername) {
        return studentRepository.findByUsername(studentUsername);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student replaceStudent(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).get();
        existingStudent.setName(student.getName());
        existingStudent.setTeamId(student.getTeamId());
        existingStudent.setUsername(student.getUsername());
        existingStudent.setTeamName(student.getTeamName());
        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

}
