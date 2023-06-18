package com.example.heba.model.pojo;

import java.io.Serializable;

public class Offset implements Serializable {
    // @JsonProperty("Isak")
    public int Isak;
    //  @JsonProperty("Fajr")
    public int Fajr;
    // @JsonProperty("Sunrise")
    public int Sunrise;
    // @JsonProperty("Dhuhr")
    public int Dhuhr;
    // @JsonProperty("Asr")
    public int Asr;
    // @JsonProperty("Maghrib")
    public int Maghrib;
    //  @JsonProperty("Sunset")
    public int Sunset;
    // @JsonProperty("Isha")
    public int Isha;
    // @JsonProperty("Midnight")
    public int Midnight;

    public Offset(int isak, int fajr, int sunrise, int dhuhr, int asr, int maghrib, int sunset, int isha, int midnight) {
        Isak = isak;
        Fajr = fajr;
        Sunrise = sunrise;
        Dhuhr = dhuhr;
        Asr = asr;
        Maghrib = maghrib;
        Sunset = sunset;
        Isha = isha;
        Midnight = midnight;
    }

    public int getIsak() {
        return Isak;
    }

    public void setIsak(int isak) {
        Isak = isak;
    }

    public int getFajr() {
        return Fajr;
    }

    public void setFajr(int fajr) {
        Fajr = fajr;
    }

    public int getSunrise() {
        return Sunrise;
    }

    public void setSunrise(int sunrise) {
        Sunrise = sunrise;
    }

    public int getDhuhr() {
        return Dhuhr;
    }

    public void setDhuhr(int dhuhr) {
        Dhuhr = dhuhr;
    }

    public int getAsr() {
        return Asr;
    }

    public void setAsr(int asr) {
        Asr = asr;
    }

    public int getMaghrib() {
        return Maghrib;
    }

    public void setMaghrib(int maghrib) {
        Maghrib = maghrib;
    }

    public int getSunset() {
        return Sunset;
    }

    public void setSunset(int sunset) {
        Sunset = sunset;
    }

    public int getIsha() {
        return Isha;
    }

    public void setIsha(int isha) {
        Isha = isha;
    }

    public int getMidnight() {
        return Midnight;
    }

    public void setMidnight(int midnight) {
        Midnight = midnight;
    }
}
