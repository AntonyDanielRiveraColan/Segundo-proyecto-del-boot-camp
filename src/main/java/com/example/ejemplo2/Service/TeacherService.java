package com.example.ejemplo2.Service;


import com.example.ejemplo2.Model.Teacher;

import java.util.List;

public interface TeacherService {
    public List<Teacher> getAllTeacher();

    public void addTeacher(Teacher obj);

    public void udpdateTeacher(Teacher obj);

    public void deleteTeacher(Integer id);

}
