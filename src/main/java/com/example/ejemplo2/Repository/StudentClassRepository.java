package com.example.ejemplo2.Repository;

import com.example.ejemplo2.Model.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass,Integer> {
}
