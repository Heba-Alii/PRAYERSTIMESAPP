package com.example.heba.model.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class Root implements Serializable {
    public int code;
    public String status;
    public ArrayList<Datum> data;

    public Root(int code, String status, ArrayList<Datum> data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }
}
