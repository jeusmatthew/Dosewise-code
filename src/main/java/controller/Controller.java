package controller;

import java.util.List;

import database.Consultas;
import model.Alarm;
import model.AlarmsRoutine;
import model.MedicamentList;
import view.*;

public class Controller {
    private MedicamentList model;
    private Consultas consultas;
    private final MainView view = new MainView();
    private final WeekView pnlDate = new WeekView();
    private final AddMedicamentView pnlAdd = new AddMedicamentView();

    public Controller(MedicamentList model, Consultas consultas) {
        this.model = model;
        this.consultas = consultas;
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
        return model.getAllMedications();
    }

    public void setMedicationList(List<AlarmsRoutine> medications) {
        model.setAllMedications(medications);
    }

    public void start() {
        view.setVisible(true);
    }

}
