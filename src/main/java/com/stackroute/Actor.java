package com.stackroute;


import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Actor {

    private String aname;
    private String agender;
    private int aage;

    public Actor() {
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAgender() {
        return agender;
    }

    public void setAgender(String agender) {
        this.agender = agender;
    }

    public int getAage() {
        return aage;
    }

    public void setAage(int aage) {
        this.aage = aage;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "aname='" + aname + '\'' +
                ", agender='" + agender + '\'' +
                ", aage=" + aage +
                '}';
    }
}