package com.example.heba.model.pojo;

import java.io.Serializable;

public class Method implements Serializable {
    public int id;
    public String name;
    public Params params;
    public Location location;

    public Method(int id, String name, Params params, Location location) {
        this.id = id;
        this.name = name;
        this.params = params;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
