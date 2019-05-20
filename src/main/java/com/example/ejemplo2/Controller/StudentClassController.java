package com.example.ejemplo2.Controller;


import com.example.ejemplo2.Model.StudentClass;

import com.example.ejemplo2.Service.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentClassApi/v1")
public class StudentClassController {


    @Autowired
    StudentClassService studentClassService;


    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentClass> getAllStudentClass() {
        return studentClassService.getAllStudentClass();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudentClass(@RequestBody StudentClass obj) {
        studentClassService.addStudentClass(obj);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void udpdateStudentClass(@RequestBody StudentClass obj) {
        studentClassService.udpdateStudentClass(obj);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentClass(@PathVariable("id") Integer id) {
        studentClassService.deleteStudentClass(id);
    }

}
