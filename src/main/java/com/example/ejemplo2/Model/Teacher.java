package com.example.ejemplo2.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id ")
    private int teacherId;
    @Column(name = "gender ")
    private String gender;
    @Column(name = "first_name ")
    private String firstName;
    @Column(name = "middle_name ")
    private String middleName;
    @Column(name = "last_name ")
    private String lastName;
    @Column(name = "other_teacher_detail ")
    private String otherTeacherDetail;

}
