package com.example.ejemplo2.Controller;

import com.example.ejemplo2.Model.Classes;
import com.example.ejemplo2.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classApi/v1")
public class ClassController {


    @Autowired
    ClassService classService;


    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<Classes> getAllClass() {
        return classService.getAllClasses();
    }

    @GetMapping("/read/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Integer> listarIdStudenxClass(@PathVariable("id") Integer idClass) {
        return classService.listarIdStudenxClass(idClass);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addClass(@RequestBody Classes obj) {
        classService.addClass(obj);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void udpdateClass(@RequestBody Classes obj) {
        classService.udpdateClass(obj);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteClass(@PathVariable("id") Integer id) {
        classService.deleteClass(id);
    }


}
