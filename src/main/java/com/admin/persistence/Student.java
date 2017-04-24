package com.admin.persistence;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/**
 * Created by binesh on 4/23/2017.
 */

@Entity
@Table(name="STUDENT")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID",unique = true,nullable = false)
    private int id;
    private String studentID;
    private String studentName;
    private String email;
    private String gender;

    public Student() {
    }

    public Student(String studentID, String studentName, String email, String gender) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
