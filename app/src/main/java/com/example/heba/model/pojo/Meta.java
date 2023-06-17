package com.example.heba.model.pojo;

import java.io.Serializable;

public class Meta implements Serializable {
    public double latitude;
    public double longitude;
    public String timezone;
    public Method method;
    public String latitudeAdjustmentMethod;
    public String midnightMode;
    public String school;
    public Offset offset;

    public Meta(double latitude, double longitude, String timezone, Method method, String latitudeAdjustmentMethod, String midnightMode, String school, Offset offset) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timezone = timezone;
        this.method = method;
        this.latitudeAdjustmentMethod = latitudeAdjustmentMethod;
        this.midnightMode = midnightMode;
        this.school = school;
        this.offset = offset;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getLatitudeAdjustmentMethod() {
        return latitudeAdjustmentMethod;
    }

    public void setLatitudeAdjustmentMethod(String latitudeAdjustmentMethod) {
        this.latitudeAdjustmentMethod = latitudeAdjustmentMethod;
    }

    public String getMidnightMode() {
        return midnightMode;
    }

    public void setMidnightMode(String midnightMode) {
        this.midnightMode = midnightMode;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Offset getOffset() {
        return offset;
    }

    public void setOffset(Offset offset) {
        this.offset = offset;
    }
}
