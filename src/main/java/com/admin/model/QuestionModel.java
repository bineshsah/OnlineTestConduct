package com.admin.model;

/**
 * Created by binesh on 4/23/2017.
 */
public class QuestionModel {

    private int questionID;

    private String questionName;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private String correctAnswr;

    public QuestionModel() {
    }

    public QuestionModel(int questionID, String questionName, String optionOne, String optionTwo, String optionThree, String optionFour, String correctAnswr) {
        this.questionID = questionID;
        this.questionName = questionName;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.correctAnswr = correctAnswr;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }

    public String getCorrectAnswr() {
        return correctAnswr;
    }

    public void setCorrectAnswr(String correctAnswr) {
        this.correctAnswr = correctAnswr;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "questionID=" + questionID +
                ", questionName='" + questionName + '\'' +
                ", optionOne='" + optionOne + '\'' +
                ", optionTwo='" + optionTwo + '\'' +
                ", optionThree='" + optionThree + '\'' +
                ", optionFour='" + optionFour + '\'' +
                ", correctAnswr='" + correctAnswr + '\'' +
                '}';
    }
}
