package com.example.heba.model.pojo;

import java.io.Serializable;

public class Month implements Serializable {
    public int number;
    public String en;
    public String ar;

    public Month(int number, String en, String ar) {
        this.number = number;
        this.en = en;
        this.ar = ar;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }
}
