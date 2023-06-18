package com.example.heba.model.pojo;

import java.io.Serializable;

public class Datum implements Serializable {
    public Timings timings;
    public DateResponse date;
    public Meta meta;

    public Datum() {
    }

    public Datum(Timings timings, DateResponse dateResponse, Meta meta) {
        this.timings = timings;
        this.date = dateResponse;
        this.meta = meta;
    }

    public Timings getTimings() {
        return timings;
    }

    public void setTimings(Timings timings) {
        this.timings = timings;
    }

    public DateResponse getDate() {
        return date;
    }

    public void setDate(DateResponse dateResponse) {
        this.date = dateResponse;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
