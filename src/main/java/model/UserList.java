package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<AlarmsRoutine> alarmsRoutine = new ArrayList<>();

    // CRUD operations
    public void addAlarmRoutine(AlarmsRoutine medication) {
        alarmsRoutine.add(medication);
    }

    public void removeAlarmRoutine(AlarmsRoutine medication) {
        alarmsRoutine.remove(medication);
    }

    public void removeAlarmRoutine(int index) {
        alarmsRoutine.remove(index);
    }

    public void removeAll() {
        alarmsRoutine.clear();
    }

    public void updateAlarmRoutine(int index, AlarmsRoutine medication) {
        alarmsRoutine.set(index, medication);
    }

    public AlarmsRoutine getAlarmRoutine(int index) {
        return alarmsRoutine.get(index);
    }

    public void setAlarmRoutine(int index, AlarmsRoutine medication) {
        alarmsRoutine.set(index, medication);
    }

    public List<AlarmsRoutine> getAll() {
        return alarmsRoutine;
    }

    public void setAll(List<AlarmsRoutine> medications) {
        this.alarmsRoutine = medications;
    }

}
