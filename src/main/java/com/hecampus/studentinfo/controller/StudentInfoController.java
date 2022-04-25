package com.hecampus.studentinfo.controller;

import com.hecampus.studentinfo.model.Student;
import com.hecampus.studentinfo.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RestController
public class StudentInfoController {

    @Autowired
    private StudentInfoService service;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<>(service.getStudentList(), HttpStatus.OK);
    }
    @PostMapping("/students")
    public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student ){
        Student newStudent = service.saveBook(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);

    }

}
