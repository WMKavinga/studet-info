package com.hecampus.studentinfo.repository;

import com.hecampus.studentinfo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoRepo extends MongoRepository<Student,String> {

}
