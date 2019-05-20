package com.example.ejemplo2.Service;

import com.example.ejemplo2.Model.StudentClass;
import com.example.ejemplo2.Repository.StudentClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentClassesImpl implements StudentClassService {

    @Autowired
    StudentClassRepository studentClassRepository;

    @Override
    public List<StudentClass> getAllStudentClass() {
        return studentClassRepository.findAll();
    }

    @Override
    public void addStudentClass(StudentClass obj) {
        studentClassRepository.save(obj);
    }

    @Override
    public void udpdateStudentClass(StudentClass obj) {
        studentClassRepository.save(obj);
    }

    @Override
    public void deleteStudentClass(Integer id) {
        studentClassRepository.deleteById(id);
    }
}
