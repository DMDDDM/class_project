package cn.dmdddm.entity;

import java.io.Serializable;
import java.util.Date;

public class YdmaResult implements Serializable {

    private int code;

    private String msg;

    private Date date;

    //保存token
    private Object data;




    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
