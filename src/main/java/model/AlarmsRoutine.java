package model;

import java.time.LocalDateTime;
import java.util.Stack;

public class AlarmsRoutine {
    private Stack<Alarm> alarms = new Stack<>();
    private Dosage dosage;
    private Medicament medicament;

    public AlarmsRoutine(Dosage dosage, Medicament medicament) {
        this.dosage = dosage;
        this.medicament = medicament;
        generateAlarms();
    }

    private void generateAlarms() {
        for (int i = 0; i < dosage.getTotalTakes(); i++) {
            Alarm alarm = new Alarm();
            alarm.setMessage(medicament.getName());
            alarm.setTime(LocalDateTime.now().plusHours(dosage.getTakePeriod() * i));
            alarms.add(alarm);
        }
    }

    public void triggerAlarm() {
        alarms.pop().ring();
    }

    public Stack<Alarm> getAlarms() {
        return alarms;
    }

    public void setAlarms(Stack<Alarm> alarms) {
        this.alarms = alarms;
    }

    public Dosage getDosage() {
        return dosage;
    }

    public void setDosage(Dosage dosage) {
        this.dosage = dosage;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

}
