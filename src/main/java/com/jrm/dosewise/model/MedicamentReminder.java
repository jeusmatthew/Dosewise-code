package com.jrm.dosewise.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MedicamentReminder {
    private List<MedicamentAlarm> alarms = new ArrayList<MedicamentAlarm>();
    private Dosage dosage;
    private Medicament medicament;

    public void initialize(Dosage dosage, Medicament medicament) {
        this.dosage = dosage;
        this.medicament = medicament;

        // Generating alarms
        // TODO: ALAVERGA ME GENERO ESTO AAAAAAAAAAAAAAAAAAA
        for (int i = 0; i < dosage.getTotalTakes(); i++) {
            MedicamentAlarm alarm = new MedicamentAlarm();
            alarm.setMessage(medicament.getName());
            alarm.setTime(LocalDateTime.now().plusHours(dosage.getTakePeriod() * i));
            alarms.add(alarm);
        }
    }
    
    public void ringAlarm() {
        alarms.get(0).ring();
    }

    public void setAllAlarmsActive(boolean active) {
        for (MedicamentAlarm alarm : alarms) {
            alarm.setActive(active);
        }
    }

    public void setAllAlarmsMessage(String message) {
        for (MedicamentAlarm alarm : alarms) {
            alarm.setMessage(message);
        }
    }

    public void setAllAlarmsTime(LocalDateTime time) {
        for (MedicamentAlarm alarm : alarms) {
            alarm.setTime(time);
        }
    }

    public void removeAlarm(MedicamentAlarm alarm) {
        alarms.remove(alarm);
    }

    public List<MedicamentAlarm> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<MedicamentAlarm> alarms) {
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
