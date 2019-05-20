package com.example.ejemplo2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id ")
    private int classId;
    @Column(name = "subject_id ")
    private int subjectId;
    @Column(name = "teacher_id")
    private int teacherId;
    @Column(name = "class_code")
    private String classCode;
    @Column(name = "class_name")
    private String className;
    @Column(name = "date_from")
    private Date dateFrom;
    @Column(name = "date_to")
    private Date dateTo;

}
