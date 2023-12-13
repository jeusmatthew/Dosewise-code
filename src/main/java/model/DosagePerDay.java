package model;

public class DosagePerDay implements Dosage{
    private int days;
    private int weeks;

    public DosagePerDay(int days, int weeks) {
        this.days = days;
        this.weeks = weeks;
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
        return weeks * (7 / days);
    }    
}
