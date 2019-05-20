package com.example.ejemplo2.Service;

import com.example.ejemplo2.Model.Subject;

import java.util.List;

public interface SubjectService {

    public List<Subject> getAllSubject();

    public void addSubject(Subject obj);

    public void udpdateSubject(Subject obj);

    public void deleteSubject(Integer id);

}
