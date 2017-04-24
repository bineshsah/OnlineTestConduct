package com.admin.persistence;

import javax.persistence.*;

/**
 * Created by binesh on 4/23/2017.
 */

@Entity
@Table(name="QUESTIONS")
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "QUESTION_ID",unique = true,nullable = false)
    private int questionID;

    private String questionName;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private String correctAnswr;
    private int subTechnologyID;
    @ManyToOne
    @JoinColumn(name = "SUBTECHNOLOGYID",nullable = false)
    private SubTechnology subTechnology;

    public int getSubTechnologyID() {
        return subTechnologyID;
    }

    public void setSubTechnologyID(int subTechnologyID) {
        this.subTechnologyID = subTechnologyID;
    }

    public SubTechnology getSubTechnology() {
        return subTechnology;
    }

    public void setSubTechnology(SubTechnology subTechnology) {
        this.subTechnology = subTechnology;
    }

    public Question() {
    }

    public Question(String questionName, String optionOne, String optionTwo, String optionThree, String optionFour, String correctAnswr) {
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
}
