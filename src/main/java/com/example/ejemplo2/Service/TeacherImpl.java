package com.example.ejemplo2.Service;

import com.example.ejemplo2.Model.Teacher;
import com.example.ejemplo2.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public void addTeacher(Teacher obj) {
        teacherRepository.save(obj);
    }

    @Override
    public void udpdateTeacher(Teacher obj) {
        teacherRepository.save(obj);
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }
}
