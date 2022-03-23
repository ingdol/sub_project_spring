package com.multi.sub_project_spring.SpaceClassList;

import java.util.Date;

public class ClassVO {
    private int classNo;
    private String memNick;
    private String classTitle;
    private String classInfo;
    private String hobbyNo;
    private String classArea;
    private String classPhoto;
    private Date classOpen;
    private int classRecommand;

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getMemNick() {
        return memNick;
    }

    public void setMemNick(String memNick) {
        this.memNick = memNick;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    public String getHobbyNo() {
        return hobbyNo;
    }

    public void setHobbyNo(String hobbyNo) {
        this.hobbyNo = hobbyNo;
    }

    public String getClassArea() {
        return classArea;
    }

    public void setClassArea(String classArea) {
        this.classArea = classArea;
    }

    public String getClassPhoto() {
        return classPhoto;
    }

    public void setClassPhoto(String classPhoto) {
        this.classPhoto = classPhoto;
    }

    public Date getClassOpen() {
        return classOpen;
    }

    public void setClassOpen(Date classOpen) {
        this.classOpen = classOpen;
    }

    public int getClassRecommand() {
        return classRecommand;
    }

    public void setClassRecommand(int classRecommand) {
        this.classRecommand = classRecommand;
    }
}
