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

    public void updateMedication(int index, AlarmsRoutine medication) {
        medications.set(index, medication);
    }

    public List<AlarmsRoutine> getMedications() {
        return medications;
    }

    public void setMedications(List<AlarmsRoutine> medications) {
        this.medications = medications;
    }

}
