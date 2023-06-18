package com.example.heba.model.pojo;

import java.io.Serializable;

public class DateResponse implements Serializable {
    private String readable;
    private String timestamp;
    private Gregorian gregorian;
    private Hijri hijri;

    public DateResponse(String readable, String timestamp, Gregorian gregorian, Hijri hijri) {
        this.readable = readable;
        this.timestamp = timestamp;
        this.gregorian = gregorian;
        this.hijri = hijri;
    }

    public String getReadable() {
        return readable;
    }

    public void setReadable(String readable) {
        this.readable = readable;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Gregorian getGregorian() {
        return gregorian;
    }

    public void setGregorian(Gregorian gregorian) {
        this.gregorian = gregorian;
    }

    public Hijri getHijri() {
        return hijri;
    }

    public void setHijri(Hijri hijri) {
        this.hijri = hijri;
    }
}
