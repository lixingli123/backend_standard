package com.mxjzq.entity;

import java.util.Date;

public class CourseFragment {
    private Integer id;

    private String subjectcode;

    private String gradecode;

    private String teachingcode;

    private String knowledge;

    private String title;

    private String content;

    private Double price;

    private Double promoteprice;

    private String status;

    private Long interval;

    private String totalfenshu;

    private Integer fenshuflag;

    private String averagefenshu;

    private String groupcode;

    private Integer reportflag;

    private Integer userid;

    private Date createtime;

    private Integer type;

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

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public String getTotalfenshu() {
        return totalfenshu;
    }

    public void setTotalfenshu(String totalfenshu) {
        this.totalfenshu = totalfenshu == null ? null : totalfenshu.trim();
    }

    public Integer getFenshuflag() {
        return fenshuflag;
    }

    public void setFenshuflag(Integer fenshuflag) {
        this.fenshuflag = fenshuflag;
    }

    public String getAveragefenshu() {
        return averagefenshu;
    }

    public void setAveragefenshu(String averagefenshu) {
        this.averagefenshu = averagefenshu == null ? null : averagefenshu.trim();
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode == null ? null : groupcode.trim();
    }

    public Integer getReportflag() {
        return reportflag;
    }

    public void setReportflag(Integer reportflag) {
        this.reportflag = reportflag;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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