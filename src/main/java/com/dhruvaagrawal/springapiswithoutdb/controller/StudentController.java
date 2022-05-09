package com.dhruvaagrawal.springapiswithoutdb.controller;

import com.dhruvaagrawal.springapiswithoutdb.entity.Student;
import com.dhruvaagrawal.springapiswithoutdb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public List<Student> fetchAllStudents() {
        return studentService.fetchAllStudents();
    }

    @GetMapping("/{id}")
    public Student fetchStudentById(@PathVariable("id") Long studentId) {
        return studentService.fetchStudentById(studentId);
    }

    @GetMapping("/name/{username}")
    public Student fetchStudentByUsername(@PathVariable("username") String studentUsername) {
        return studentService.fetchStudentByUsername(studentUsername);
    }

    @PostMapping("")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("/{id}")
    public Student replaceStudent(@PathVariable("id") Long studentId, @RequestBody Student student) {
        return studentService.replaceStudent(studentId, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long studentId) {
        studentService.deleteStudent(studentId);
    }
}
