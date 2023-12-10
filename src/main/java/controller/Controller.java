package controller;

import java.util.List;

import model.AlarmsRoutine;
import model.MedicamentList;
import view.ConsoleView;

public class Controller {
    private MedicamentList model;
    private ConsoleView view;
    

    public Controller(MedicamentList model) {
        this.model = model;
        this.view = new ConsoleView(model, this);
    }

    public void addMedication(AlarmsRoutine medication) {
        model.addMedication(medication);
    }

    public void removeMedication(AlarmsRoutine medication) {
        model.removeMedication(medication);
    }

    public void removeMedication(int index) {
        model.removeMedication(index);
    }

    public void updateMedication(int index, AlarmsRoutine medication) {
        model.updateMedication(index, medication);
    }

    public List<AlarmsRoutine> getMedicationList() {
        return model.getMedications();
    }
    
    public void setMedicationList(List<AlarmsRoutine> medications) {
        model.setMedications(medications);
    }

    public void start() {
        view.printMenu();
        view.getUserInput();
    }

}
