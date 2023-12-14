package model;

public class DosagePerHour implements Dosage {
    private int days;
    private int hours;
    private int DAY = 24;

    public DosagePerHour(int hours, int days) {
        this.days = days;
        this.hours = hours;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getTakePeriod() {
        return hours;
    }

    @Override
    public int getTotalTakes() {
        return days * (DAY / hours);
    }
}
