package com.example.ejemplo2.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(PKCompuesta.class)
@Data
@Table(name = "student_classes")
public class StudentClass {

    @Id
    @Column(name = "student_id ")
    private int studentId;
    @Id
    @Column(name = "class_id ")
    private int classId;
    @Id
    @Column(name = "date_from ")
    private Date dateFrom;
    @Column(name = "date_to ")
    private Date dateTo;

}
