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

    public void updateMedication(AlarmsRoutine medication) {
        AlarmsRoutine oldMedication = medications.stream()
                .filter(m -> m.getMedicament().getName().equals(medication.getMedicament().getName())).findFirst()
                .orElse(null);
        if (oldMedication != null) {
            oldMedication.setDosage(medication.getDosage());
            oldMedication.setMedicament(medication.getMedicament());
        }
    }

    public List<AlarmsRoutine> getMedications() {
        return medications;
    }

    public void setMedications(List<AlarmsRoutine> medications) {
        this.medications = medications;
    }

}
