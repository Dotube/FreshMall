package com.dwj.freshmall.vo;
public class ResultVO {
    private int state;

    public int getState() {
        return state;
    }

    public ResultVO() {
    }

    public ResultVO(int state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;
}
