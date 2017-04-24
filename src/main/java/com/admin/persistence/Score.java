package com.admin.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.Set;

/**
 * Created by binesh on 4/23/2017.
 */
@Entity
@Table(name="Score")
public class Score {

    public int getScoreID() {
        return scoreID;
    }

    public void setScoreID(int scoreID) {
        this.scoreID = scoreID;
    }

    @Id
    @GeneratedValue
    @Column(name = "SCORE_ID",unique = true,nullable = false)
    private int scoreID;

    private String mainTechName;
    private String subTechName;
    private String Score;
    private String studentID;

    @OneToMany(mappedBy = "score")
    private Set<ResultReport> resultReports;

    public Set<ResultReport> getResultReports() {
        return resultReports;
    }

    public void setResultReports(Set<ResultReport> resultReports) {
        this.resultReports = resultReports;
    }



    public String getStudentID() {
        return studentID;
    }

    public Score(String mainTechName, String subTechName, String score, String studentID, Date scoreDate) {
        this.mainTechName = mainTechName;
        this.subTechName = subTechName;
        Score = score;
        this.studentID = studentID;
        this.scoreDate = scoreDate;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    private Date scoreDate;

    public Score() {
    }



    public String getMainTechName() {
        return mainTechName;
    }

    public void setMainTechName(String mainTechName) {
        this.mainTechName = mainTechName;
    }

    public String getSubTechName() {
        return subTechName;
    }

    public void setSubTechName(String subTechName) {
        this.subTechName = subTechName;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public Date getScoreDate() {
        return scoreDate;
    }

    public void setScoreDate(Date scoreDate) {
        this.scoreDate = scoreDate;
    }
}
