package com.example.ejemplo2.Service;

import com.example.ejemplo2.Model.Classes;
import com.example.ejemplo2.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ClassImpl implements ClassService {

@Autowired
ClassRepository classRepository;

    @Override
    public List<Classes> getAllClasses() {
        return classRepository.findAll();
    }

    @Override
    public void addClass(Classes obj) {
            classRepository.save(obj);
    }

    @Override
    public void udpdateClass(Classes obj) {
        classRepository.save(obj);
    }

    @Override
    public void deleteClass(Integer id) {
        classRepository.deleteById(id);
    }


    @Override
    public List<Integer> listarIdStudenxClass(Integer idClas) {
        return classRepository.listarIdStudenxClass(idClas);
    }


}
