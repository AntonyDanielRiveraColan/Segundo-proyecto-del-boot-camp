package com.example.ejemplo2.Service;

import com.example.ejemplo2.Model.Classes;

import java.util.ArrayList;
import java.util.List;

public interface ClassService {

    public List<Classes> getAllClasses();

    public void addClass(Classes obj);

    public void udpdateClass(Classes obj);

    public void deleteClass(Integer id);

    public  List<Integer> listarIdStudenxClass(Integer idClas);

}
