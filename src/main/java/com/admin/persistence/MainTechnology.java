package com.admin.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

import com.admin.persistence.SubTechnology;

/**
 * Created by binesh on 4/23/2017.
 */
@Entity
@Table(name="MAINTECHNOLOGIES")
public class MainTechnology {

    @Id
    @GeneratedValue
    @Column(name = "MAINTECHNOLOGYID",unique = true,nullable = false)
    private int mainTechnologyID;

    private String mainTechnologyName;

    @OneToMany(mappedBy = "mainTechnology")
    private Set<SubTechnology> subTechnology;

    public Set<SubTechnology> getSubTechnology() {
        return subTechnology;
    }

    public void setSubTechnology(Set<SubTechnology> subTechnology) {
        this.subTechnology = subTechnology;
    }

    public MainTechnology(String mainTechnologyName) {
        this.mainTechnologyName = mainTechnologyName;
    }

    public MainTechnology() {
    }

    public int getMainTechnologyID() {
        return mainTechnologyID;
    }

    public void setMainTechnologyID(int mainTechnologyID) {
        this.mainTechnologyID = mainTechnologyID;
    }

    public String getMainTechnologyName() {
        return mainTechnologyName;
    }

    public void setMainTechnologyName(String mainTechnologyName) {
        this.mainTechnologyName = mainTechnologyName;
    }

}
