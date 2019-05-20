package com.example.ejemplo2.Service;

import com.example.ejemplo2.Model.StudentClass;

import java.util.List;

public interface StudentClassService {

    public List<StudentClass> getAllStudentClass();

    public void addStudentClass(StudentClass obj);

    public void udpdateStudentClass(StudentClass obj);

    public void deleteStudentClass(Integer id);
}
