package com.jrm.dosewise.model;

import java.util.ArrayList;
import java.util.List;

import com.jrm.dosewise.view.Observer;

public class UserMedication implements Observable {
    private List<MedicamentReminder> medications = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // CRUD operations
    public void addMedication(MedicamentReminder medication) {
        medications.add(medication);
    }

    public void removeMedication(MedicamentReminder medication) {
        medications.remove(medication);
    }

    public void removeMedication(int index) {
        medications.remove(index);
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

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
