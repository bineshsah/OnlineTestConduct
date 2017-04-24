package com.admin.service;

import com.admin.dao.MainDAO;
import com.admin.model.QuestionModel;
import com.admin.model.StudentModel;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by binesh on 4/23/2017.
 */
@Named
public class MainService {
    @Inject
    MainDAO mainDAO;

    public List<StudentModel> findStudents(){
        return mainDAO.getAllStudent();
    }
    public List<QuestionModel>getQuestions(String maintech,String subtech){
        return mainDAO.getAllQuestions(maintech, subtech);
    }

    public MainDAO getMainDAO() {
        return mainDAO;
    }

    public void setMainDAO(MainDAO mainDAO) {
        this.mainDAO = mainDAO;
    }
}
