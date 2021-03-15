package com.dwj.freshmall.vo;

public class Myorder {


    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private Integer goodsid;
    private String goodsName;
    private Integer num;
    private Float price;
    private String details;
    private String image;
    private Integer orderid;
    private Integer userid;


    public Myorder() {
    }

    public Myorder(Integer orderid, Integer userid, Integer goodsid, String goodsName, Integer num, Float price, String details, String image) {
        this.orderid = orderid;
        this.userid = userid;
        this.num = num;
        this.price = price;
        this.details = details;
        this.goodsName = goodsName;
        this.image = image;
        this.goodsid = goodsid;

    }
}
