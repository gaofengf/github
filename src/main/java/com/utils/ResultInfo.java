package com.utils;

import lombok.Data;

@Data
public class ResultInfo {
    private Boolean flag;
    private String msg;

    public ResultInfo(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public ResultInfo() {
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
