package com.example.ejemplo2.Repository;

import com.example.ejemplo2.Model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Classes,Integer> {


    @Query(value = "select * from listastudent2 (:idClas)", nativeQuery = true)
    public List<Integer> listarIdStudenxClass(@Param("idClas") Integer idClas);
}
