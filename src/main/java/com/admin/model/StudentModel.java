package com.admin.model;

/**
 * Created by binesh on 4/23/2017.
 */
public class StudentModel {
    private int id;
    private String studentID;
    private String studentName;
    private String email;
    private String gender;

    public StudentModel() {
    }

    public StudentModel(int id, String studentID, String studentName, String email, String gender) {
        this.id = id;
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

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
