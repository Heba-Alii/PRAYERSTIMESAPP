package com.example.heba.model.pojo;

import java.io.Serializable;

public class Datum implements Serializable {
    public Timings timings;
    public Date date;
    public Meta meta;

    public Datum(Timings timings, Date date, Meta meta) {
        this.timings = timings;
        this.date = date;
        this.meta = meta;
    }

    public Timings getTimings() {
        return timings;
    }

    public void setTimings(Timings timings) {
        this.timings = timings;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
