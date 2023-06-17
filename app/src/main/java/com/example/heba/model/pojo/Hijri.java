package com.example.heba.model.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class Hijri implements Serializable {
    public String date;
    public String format;
    public String day;
    public Weekday weekday;
    public Month month;
    public String year;
    public Designation designation;
    public ArrayList<String> holidays;

    public Hijri(String date, String format, String day, Weekday weekday, Month month, String year, Designation designation, ArrayList<String> holidays) {
        this.date = date;
        this.format = format;
        this.day = day;
        this.weekday = weekday;
        this.month = month;
        this.year = year;
        this.designation = designation;
        this.holidays = holidays;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public ArrayList<String> getHolidays() {
        return holidays;
    }

    public void setHolidays(ArrayList<String> holidays) {
        this.holidays = holidays;
    }
}
