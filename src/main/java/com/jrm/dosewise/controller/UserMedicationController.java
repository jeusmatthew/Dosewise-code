package com.jrm.dosewise.controller;

import java.util.List;

import com.jrm.dosewise.model.MedicamentReminder;
import com.jrm.dosewise.model.UserMedication;
import com.jrm.dosewise.view.ConsoleView;

public class UserMedicationController {
    private UserMedication model;
    private ConsoleView view;

    public UserMedicationController(UserMedication model) {
        this.model = model;
        this.view = new ConsoleView(model, this);
    }

    public void addMedication(MedicamentReminder medication) {
        model.addMedication(medication);
    }

    public void removeMedication(MedicamentReminder medication) {
        model.removeMedication(medication);
    }

    public void removeMedication(int index) {
        model.removeMedication(index);
    }

    public void updateMedication(MedicamentReminder medication) {
        model.updateMedication(medication);
    }

    public List<MedicamentReminder> getMedicationList() {
        return model.getMedications();
    }
    
    public void setMedicationList(List<MedicamentReminder> medications) {
        model.setMedications(medications);
    }

    public void start() {
        view.printMenu();
        view.getUserInput();
    }

}
