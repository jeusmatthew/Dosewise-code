package com.jrm.dosewise.model;

import java.util.List;

public class UserMedicationList {
    private List<MedicamentReminder> medications;

    // CRUD operations
    public void addMedication(MedicamentReminder medication) {
        medications.add(medication);
    }

    public void removeMedication(MedicamentReminder medication) {
        medications.remove(medication);
    }

    public void updateMedication(MedicamentReminder medication) {
        MedicamentReminder oldMedication = medications.stream()
                .filter(m -> m.getMedicament().getName().equals(medication.getMedicament().getName())).findFirst()
                .orElse(null);
        if (oldMedication != null) {
            oldMedication.setDosage(medication.getDosage());
            oldMedication.setMedicament(medication.getMedicament());
        }
    }

    public List<MedicamentReminder> getMedications() {
        return medications;
    }

    public void setMedications(List<MedicamentReminder> medications) {
        this.medications = medications;
    }

}
