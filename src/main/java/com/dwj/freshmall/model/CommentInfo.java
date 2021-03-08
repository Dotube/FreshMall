package com.dwj.freshmall.model;

public class CommentInfo {
    private Integer commentid;

    private Integer userid;

    private Integer goodid;

    private String detail;

    private String images1;

    private String images2;

    private String images3;

    private String images4;

    private String images5;

    private Float rate;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getImages1() {
        return images1;
    }

    public void setImages1(String images1) {
        this.images1 = images1 == null ? null : images1.trim();
    }

    public String getImages2() {
        return images2;
    }

    public void setImages2(String images2) {
        this.images2 = images2 == null ? null : images2.trim();
    }

    public String getImages3() {
        return images3;
    }

    public void setImages3(String images3) {
        this.images3 = images3 == null ? null : images3.trim();
    }

    public String getImages4() {
        return images4;
    }

    public void setImages4(String images4) {
        this.images4 = images4 == null ? null : images4.trim();
    }

    public String getImages5() {
        return images5;
    }

    public void setImages5(String images5) {
        this.images5 = images5 == null ? null : images5.trim();
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}