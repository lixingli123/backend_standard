package com.mxjzq.entity;

import java.util.Date;

public class StudentFirstAccess {
    private Integer id;

    private Integer studentId;

    private String phone;

    private Byte type;

    private String futurePath;

    private String goSchoolGoal;

    private String achievementGoal;

    private String studyHabit;

    private String goodHabit;

    private String badHabit;

    private String chineseAchievement;

    private String chineseReadAbility;

    private String chineseAugmentSide;

    private String englishAchievement;

    private String englishReadAbility;

    private String englishAugmentSide;

    private String mathAchievement;

    private String mathOutStudy;

    private String mathAugmentSide;

    private Byte isDelete;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getFuturePath() {
        return futurePath;
    }

    public void setFuturePath(String futurePath) {
        this.futurePath = futurePath == null ? null : futurePath.trim();
    }

    public String getGoSchoolGoal() {
        return goSchoolGoal;
    }

    public void setGoSchoolGoal(String goSchoolGoal) {
        this.goSchoolGoal = goSchoolGoal == null ? null : goSchoolGoal.trim();
    }

    public String getAchievementGoal() {
        return achievementGoal;
    }

    public void setAchievementGoal(String achievementGoal) {
        this.achievementGoal = achievementGoal == null ? null : achievementGoal.trim();
    }

    public String getStudyHabit() {
        return studyHabit;
    }

    public void setStudyHabit(String studyHabit) {
        this.studyHabit = studyHabit == null ? null : studyHabit.trim();
    }

    public String getGoodHabit() {
        return goodHabit;
    }

    public void setGoodHabit(String goodHabit) {
        this.goodHabit = goodHabit == null ? null : goodHabit.trim();
    }

    public String getBadHabit() {
        return badHabit;
    }

    public void setBadHabit(String badHabit) {
        this.badHabit = badHabit == null ? null : badHabit.trim();
    }

    public String getChineseAchievement() {
        return chineseAchievement;
    }

    public void setChineseAchievement(String chineseAchievement) {
        this.chineseAchievement = chineseAchievement == null ? null : chineseAchievement.trim();
    }

    public String getChineseReadAbility() {
        return chineseReadAbility;
    }

    public void setChineseReadAbility(String chineseReadAbility) {
        this.chineseReadAbility = chineseReadAbility == null ? null : chineseReadAbility.trim();
    }

    public String getChineseAugmentSide() {
        return chineseAugmentSide;
    }

    public void setChineseAugmentSide(String chineseAugmentSide) {
        this.chineseAugmentSide = chineseAugmentSide == null ? null : chineseAugmentSide.trim();
    }

    public String getEnglishAchievement() {
        return englishAchievement;
    }

    public void setEnglishAchievement(String englishAchievement) {
        this.englishAchievement = englishAchievement == null ? null : englishAchievement.trim();
    }

    public String getEnglishReadAbility() {
        return englishReadAbility;
    }

    public void setEnglishReadAbility(String englishReadAbility) {
        this.englishReadAbility = englishReadAbility == null ? null : englishReadAbility.trim();
    }

    public String getEnglishAugmentSide() {
        return englishAugmentSide;
    }

    public void setEnglishAugmentSide(String englishAugmentSide) {
        this.englishAugmentSide = englishAugmentSide == null ? null : englishAugmentSide.trim();
    }

    public String getMathAchievement() {
        return mathAchievement;
    }

    public void setMathAchievement(String mathAchievement) {
        this.mathAchievement = mathAchievement == null ? null : mathAchievement.trim();
    }

    public String getMathOutStudy() {
        return mathOutStudy;
    }

    public void setMathOutStudy(String mathOutStudy) {
        this.mathOutStudy = mathOutStudy == null ? null : mathOutStudy.trim();
    }

    public String getMathAugmentSide() {
        return mathAugmentSide;
    }

    public void setMathAugmentSide(String mathAugmentSide) {
        this.mathAugmentSide = mathAugmentSide == null ? null : mathAugmentSide.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }
}