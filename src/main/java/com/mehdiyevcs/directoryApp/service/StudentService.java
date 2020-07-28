package com.mehdiyevcs.directoryApp.service;

import com.mehdiyevcs.directoryApp.dao.StudentDao;
import com.mehdiyevcs.directoryApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public void saveStudent(Student student){
        studentDao.save(student);
    }


    public List<Student> getStudents(){
        return studentDao.findAll();
    }

    public void removeStudent(int number) {
        studentDao.deleteById(number);
    }
}
