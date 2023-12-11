package model;

import java.util.ArrayList;
import java.util.List;

public class MedicamentList {
    private List<AlarmsRoutine> medications = new ArrayList<>();

    // CRUD operations
    public void addMedication(AlarmsRoutine medication) {
        medications.add(medication);
    }

    public void removeMedication(AlarmsRoutine medication) {
        medications.remove(medication);
    }

    public void removeMedication(int index) {
        medications.remove(index);
    }

    public void removeAllMedicaments() {
        medications.clear();
    }

    public void updateMedication(int index, AlarmsRoutine medication) {
        medications.set(index, medication);
    }

    public AlarmsRoutine getMedicament(int index) {
        return medications.get(index);
    }

    public void setMedicament(int index, AlarmsRoutine medication) {
        medications.set(index, medication);
    }

    public List<AlarmsRoutine> getAllMedications() {
        return medications;
    }

    public void setAllMedications(List<AlarmsRoutine> medications) {
        this.medications = medications;
    }

}
