package com.dwj.freshmall.model;

import java.util.Date;

public class DeliverInfo {
    private String wlid;

    private String orderid;

    private String deliverman;

    private String status;

    private Date date;

    private String location;

    public String getWlid() {
        return wlid;
    }

    public void setWlid(String wlid) {
        this.wlid = wlid == null ? null : wlid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getDeliverman() {
        return deliverman;
    }

    public void setDeliverman(String deliverman) {
        this.deliverman = deliverman == null ? null : deliverman.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}