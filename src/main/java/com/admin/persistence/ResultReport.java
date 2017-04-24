package com.admin.persistence;

import javax.persistence.*;

/**
 * Created by binesh on 4/23/2017.
 */

@Entity
@Table(name="RESULTTABLE")
public class ResultReport {

    @Id
    @GeneratedValue
    @Column(name = "RESULT_ID",unique = true,nullable = false)
    private int resultID;
    private int scoreID;
    private int questionID;
    private String selectedAnswer;

    @ManyToOne
    @JoinColumn(name="SCORE_ID",nullable = false)
    private Score score;

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public ResultReport() {
    }

    public ResultReport(int scoreID, int questionID, String selectedAnswer,Score score) {
        this.scoreID = scoreID;
        this.questionID = questionID;
        this.selectedAnswer = selectedAnswer;
        this.score=score;
    }

    public int getResultID() {
        return resultID;
    }

    public void setResultID(int resultID) {
        this.resultID = resultID;
    }

    public int getScoreID() {
        return scoreID;
    }

    public void setScoreID(int scoreID) {
        this.scoreID = scoreID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }
}
