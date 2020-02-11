package com.mxjzq.entity;

import java.util.Date;

public class CourseSlide {
    private Integer id;

    private String subjectcode;

    private String gradecode;

    private String teachingcode;

    private String knowledge;

    private String title;

    private String headline;

    private String content;

    private Double price;

    private Double promoteprice;

    private String status;

    private Integer userid;

    private Integer fightflag;

    private Date createtime;

    private String shareimage;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode == null ? null : subjectcode.trim();
    }

    public String getGradecode() {
        return gradecode;
    }

    public void setGradecode(String gradecode) {
        this.gradecode = gradecode == null ? null : gradecode.trim();
    }

    public String getTeachingcode() {
        return teachingcode;
    }

    public void setTeachingcode(String teachingcode) {
        this.teachingcode = teachingcode == null ? null : teachingcode.trim();
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge == null ? null : knowledge.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline == null ? null : headline.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPromoteprice() {
        return promoteprice;
    }

    public void setPromoteprice(Double promoteprice) {
        this.promoteprice = promoteprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFightflag() {
        return fightflag;
    }

    public void setFightflag(Integer fightflag) {
        this.fightflag = fightflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getShareimage() {
        return shareimage;
    }

    public void setShareimage(String shareimage) {
        this.shareimage = shareimage == null ? null : shareimage.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}