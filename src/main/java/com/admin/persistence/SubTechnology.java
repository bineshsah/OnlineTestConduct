package com.admin.persistence;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by binesh on 4/23/2017.
 */
@Entity
@Table(name="SUBTECHNOLOGIES")
public class SubTechnology {

    @Id
    @GeneratedValue
    @Column(name = "SUBTECHNOLOGYID",unique = true,nullable = false)
    private int subTechnologyID;
    private int mainTechnologyID;
    private String subTechnologyName;

    @ManyToOne
    @JoinColumn(name = "MAINTECHNOLOGYID",nullable = false)
    private MainTechnology mainTechnology;

    @OneToMany(mappedBy = "subTechnology")
    private Set<Question> questionSet;

    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(Set<Question> questionSet) {
        this.questionSet = questionSet;
    }

    public int getMainTechnologyID() {
        return mainTechnologyID;
    }

    public void setMainTechnologyID(int mainTechnologyID) {
        this.mainTechnologyID = mainTechnologyID;
    }

    public MainTechnology getMainTechnology() {
        return mainTechnology;
    }

    public void setMainTechnology(MainTechnology mainTechnology) {
        this.mainTechnology = mainTechnology;
    }

    public SubTechnology() {
    }

    public SubTechnology(String subTechnologyName) {
        this.subTechnologyName = subTechnologyName;
    }

    public int getSubTechnologyID() {
        return subTechnologyID;
    }

    public void setSubTechnologyID(int subTechnologyID) {
        this.subTechnologyID = subTechnologyID;
    }

    public String getSubTechnologyName() {
        return subTechnologyName;
    }

    public void setSubTechnologyName(String subTechnologyName) {
        this.subTechnologyName = subTechnologyName;
    }
}
