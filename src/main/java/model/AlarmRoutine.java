package model;

import java.time.LocalDateTime;
import java.util.Stack;

public class AlarmRoutine {
    private Stack<Alarm> alarms = new Stack<>();
    private Dosage dosage;
    private Medicament medicament;

    public AlarmRoutine(Dosage dosage, Medicament medicament) {
        this.dosage = dosage;
        this.medicament = medicament;
        generateAlarms();
    }

    private void generateAlarms() {
        for (int i = dosage.getTotalTakes() - 1; i >= 0; i--) {
            Alarm alarm = new Alarm();
            alarm.setMessage(medicament.getName());
            alarm.setTime(LocalDateTime.now().plusMinutes(5).plusHours(dosage.getTakePeriod() * i));
            alarms.add(alarm);
            System.out.println(i + "\t" + alarm.getTime().getDayOfWeek() + " " + alarm.getTime().getHour() + ":" + alarm.getTime().getMinute());
        }

    }

    public void triggerAlarm() {
        alarms.pop().ring();
    }

    public Alarm getAlarm() {
        return alarms.pop();
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
