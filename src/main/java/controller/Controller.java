package controller;

import java.util.List;

import model.AlarmsRoutine;
import model.MedicamentList;
import view.*;

public class Controller {
    private MedicamentList model;
    private Panel1 view;
    private DatePane pnlDate;
    private anadirPane1 pnlAdd;
    

    public Controller(MedicamentList model) {
        this.model = model;
        this.view = new Panel1();
        
        // paneles de la vista que se cambian segun el programa
        this.pnlAdd = new anadirPane1();
        this.pnlDate = new DatePane();
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
        view.setVisible(true);
    }

}
