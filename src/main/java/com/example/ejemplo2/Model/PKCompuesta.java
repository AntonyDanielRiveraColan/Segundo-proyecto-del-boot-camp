package com.example.ejemplo2.Model;

import java.io.Serializable;
import java.util.Date;

public class PKCompuesta implements Serializable {

    protected int studentId;
    protected int classId;
    private Date dateFrom;

    public PKCompuesta() {}

    public PKCompuesta(int studentId, int classId,Date dateFrom) {
        this.studentId = studentId;
        this.classId = classId;
        this.dateFrom = dateFrom;
    }
}
