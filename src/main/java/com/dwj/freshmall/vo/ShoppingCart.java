package com.dwj.freshmall.vo;


public class ShoppingCart {

    private Integer id;
    private Integer userid;
    private Integer goodsid;
    private String goodsName;
    private Integer num;
    private Float price;
    private String details;
    private String image;
    private boolean checked;

    public ShoppingCart(Integer id, Integer userid, boolean checked,Integer goodsid, String goodsName, Integer num, Float price, String details, String image) {
        this.id = id;
        this.userid = userid;
        this.goodsid = goodsid;
        this.goodsName = goodsName;
        this.num = num;
        this.price = price;
        this.details = details;
        this.image = image;
        this.checked = checked;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }



    public ShoppingCart() {
    }

}
