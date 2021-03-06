package com.mehdiyevcs.directoryApp.controller;

import com.mehdiyevcs.directoryApp.model.Student;
import com.mehdiyevcs.directoryApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/registerStudent")
    public String registerStudent(){
        return "addStudent.jsp";
    }

    @GetMapping(value = "/studentDirectory")
    public ModelAndView getCatalog(){
        List<Student> studentList = studentService.getStudents();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home.jsp");
        mv.addObject("studentList",studentList);
        return mv;
    }

    @GetMapping("/")
    public ModelAndView getHome(){
        return getCatalog();
    }

    @PostMapping(value = "/addStudent")
    public ModelAndView addStudent(@ModelAttribute Student student){
        studentService.saveStudent(student);
        return getCatalog();
    }

    @GetMapping(value = "/removeStudent/{id}")
    public ModelAndView removeStudent(@PathVariable("id") int num){
        studentService.removeStudent(num);
        return getCatalog();
    }

}
