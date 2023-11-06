package com.jrm.dosewise.model;

public class DosagePerDay implements Dosage{
    private int days;
    private int takes;

    public DosagePerDay(int days) {
        this.days = days;
    }

    @Override
    public int getTakePeriod() {
        return days * 24;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public int getTotalTakes() {
        return days * takes;
    }    
}
