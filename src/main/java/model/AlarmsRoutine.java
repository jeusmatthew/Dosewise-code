package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AlarmsRoutine {
    private List<Alarm> alarms = new ArrayList<Alarm>();
    private Dosage dosage;
    private Medicament medicament;

    public AlarmsRoutine(Dosage dosage, Medicament medicament) {
        this.dosage = dosage;
        this.medicament = medicament;

        // Generating alarms
        for (int i = 0; i < dosage.getTotalTakes(); i++) {
            Alarm alarm = new Alarm();
            alarm.setMessage(medicament.getName());
            alarm.setTime(LocalDateTime.now().plusHours(dosage.getTakePeriod() * i));
            alarms.add(alarm);
        }
    }

    public void ringAlarm() {
        alarms.get(0).ring();
    }

    public void setAllAlarmsActive(boolean active) {
        for (Alarm alarm : alarms) {
            alarm.setActive(active);
        }
    }

    public void setAllAlarmsMessage(String message) {
        for (Alarm alarm : alarms) {
            alarm.setMessage(message);
        }
    }

    public void setAllAlarmsTime(LocalDateTime time) {
        for (Alarm alarm : alarms) {
            alarm.setTime(time);
        }
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public List<Alarm> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<Alarm> alarms) {
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
