package com.example.heba.model.pojo;

import java.io.Serializable;

public class Designation implements Serializable {
    public String abbreviated;
    public String expanded;

    public Designation(String abbreviated, String expanded) {
        this.abbreviated = abbreviated;
        this.expanded = expanded;
    }

    public String getAbbreviated() {
        return abbreviated;
    }

    public void setAbbreviated(String abbreviated) {
        this.abbreviated = abbreviated;
    }

    public String getExpanded() {
        return expanded;
    }

    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }
}
