package com.example.ejemplo2.Service;

import com.example.ejemplo2.Model.Subject;
import com.example.ejemplo2.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectImpl implements SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public void addSubject(Subject obj) {
        subjectRepository.save(obj);
    }

    @Override
    public void udpdateSubject(Subject obj) {
        subjectRepository.save(obj);
    }

    @Override
    public void deleteSubject(Integer id) {
        subjectRepository.deleteById(id);
    }
}
