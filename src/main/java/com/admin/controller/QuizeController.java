package com.admin.controller;

import com.admin.service.MainService;
import com.admin.model.QuestionModel;

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
public class QuizeController {
    @Inject
    MainService mainService;
    List<QuestionModel> questionModelList;


    public MainService getMainService() {
        return mainService;
    }

    public void getAllQuestions(){
        questionModelList= new ArrayList<QuestionModel>();
        questionModelList.addAll(mainService.getMainDAO().getAllQuestions("Java", "JSP"));
    }
    public List<QuestionModel> getQuestionModelList() {
        return questionModelList;
    }

    public void setQuestionModelList(List<QuestionModel> questionModelList) {
        this.questionModelList = questionModelList;
    }

    public void setMainService(MainService mainService) {
        this.mainService = mainService;
    }
}
