package com.example.ejemplo2.Controller;


import com.example.ejemplo2.Model.Teacher;
import com.example.ejemplo2.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacherApi/v1")
public class TeacherController {

    @Autowired
    TeacherService teacherService;


   @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
   public List<Teacher> getAllClass(){ return teacherService.getAllTeacher();}

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addFamily(@RequestBody Teacher obj){
        teacherService.addTeacher(obj);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateFamily(@RequestBody Teacher obj){
        teacherService.udpdateTeacher(obj);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteFamily(@PathVariable("id") Integer id ){
        teacherService.deleteTeacher(id);
}
}