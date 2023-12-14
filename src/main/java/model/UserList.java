package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<AlarmRoutine> alarmsRoutine = new ArrayList<>();

    // CRUD operations
    public void addAlarmRoutine(AlarmRoutine medication) {
        alarmsRoutine.add(medication);
    }

    public void removeAlarmRoutine(AlarmRoutine medication) {
        alarmsRoutine.remove(medication);
    }

    public void removeAlarmRoutine(int index) {
        alarmsRoutine.remove(index);
    }

    public void removeAll() {
        alarmsRoutine.clear();
    }

    public void updateAlarmRoutine(int index, AlarmRoutine medication) {
        alarmsRoutine.set(index, medication);
    }

    public AlarmRoutine getAlarmRoutine(int index) {
        return alarmsRoutine.get(index);
    }

    public void setAlarmRoutine(int index, AlarmRoutine medication) {
        alarmsRoutine.set(index, medication);
    }

    public List<AlarmRoutine> getAll() {
        return alarmsRoutine;
    }

    public void setAll(List<AlarmRoutine> medications) {
        this.alarmsRoutine = medications;
    }

}
