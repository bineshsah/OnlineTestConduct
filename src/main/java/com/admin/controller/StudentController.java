package com.admin.controller;

import com.admin.service.MainService;
import com.admin.model.StudentModel;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by binesh on 4/23/2017.
 */
@ManagedBean
@Named
public class StudentController {

    @Inject
    MainService mainService;

    public List<StudentModel> getStudentModel() {
        return studentModel;
    }

    public void setStudentModel(List<StudentModel> studentModel) {
        this.studentModel = studentModel;
    }

    List<StudentModel> studentModel;

    public void showStudent(){
        studentModel =new ArrayList<StudentModel>();
        studentModel.addAll(mainService.getMainDAO().getAllStudent());
        System.out.println("Student service students:"+ mainService.getMainDAO().getAllStudent().get(0).getStudentName());

    }

    public MainService getMainService() {
        return mainService;
    }

    public void setMainService(MainService mainService) {
        this.mainService = mainService;
    }

}
