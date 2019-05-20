package com.example.ejemplo2.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id ")
    private int subjectId;
    @Column(name = "subject_name ")
    private String SubjectName;

}
