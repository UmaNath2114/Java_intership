package com.project.student.Service;


import com.project.student.Entity.Student;
import com.project.student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudentDetails(Student s) {
        return repo.save(s);
    }
}
