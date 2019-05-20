package com.example.ejemplo2.Controller;

import com.example.ejemplo2.Model.Subject;
import com.example.ejemplo2.Model.Teacher;
import com.example.ejemplo2.Service.SubjectService;
import com.example.ejemplo2.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjectApi/v1")
public class SubjectController {

    @Autowired
    SubjectService subjectService;


    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<Subject> getAllSubject() {
        return subjectService.getAllSubject();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addSubject(@RequestBody Subject obj) {
        subjectService.addSubject(obj);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void udpdateSubject(@RequestBody Subject obj) {
        subjectService.udpdateSubject(obj);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSubject(@PathVariable("id") Integer id) {
        subjectService.deleteSubject(id);
    }

}
