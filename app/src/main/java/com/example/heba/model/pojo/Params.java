package com.example.heba.model.pojo;

public class Params {
  //  @JsonProperty("Fajr")
    public int Fajr;
   // @JsonProperty("Isha")
    public int Isha;

    public Params(int fajr, int isha) {
        Fajr = fajr;
        Isha = isha;
    }

    public int getFajr() {
        return Fajr;
    }

    public void setFajr(int fajr) {
        Fajr = fajr;
    }

    public int getIsha() {
        return Isha;
    }

    public void setIsha(int isha) {
        Isha = isha;
    }
}
