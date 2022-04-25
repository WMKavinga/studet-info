package com.hecampus.studentinfo.service;

import com.hecampus.studentinfo.model.Student;
import com.hecampus.studentinfo.repository.StudentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentInfoService {

    @Autowired
    private StudentInfoRepo repository;

    public Student saveBook(Student student) {
        repository.save(student);
        return student;
    }

    public List<Student> getStudentList(){
       return repository.findAll();
    }



}
