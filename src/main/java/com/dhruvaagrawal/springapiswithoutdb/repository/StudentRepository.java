package com.dhruvaagrawal.springapiswithoutdb.repository;

import com.dhruvaagrawal.springapiswithoutdb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByName(String studentName);

    public Student findByUsername(String studentUsername);
}
