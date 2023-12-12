package controller;

import java.util.List;

import database.Consultas;
import model.AlarmsRoutine;
import model.Medicament;
import model.UserList;
import view.*;

public class Controller {
    private final UserList model;
    private final Consultas consultas;
    private final MainView mainView = new MainView(this);

    public Controller(UserList model, Consultas consultas) {
        this.model = model;
        this.consultas = consultas;
    }

    public void addAlarmRoutine(AlarmsRoutine medication) {
        model.addAlarmRoutine(medication);
    }

    public void removeAlarmRoutine(AlarmsRoutine medication) {
        model.removeAlarmRoutine(medication);
    }

    public void removeAlarmRoutine(int index) {
        model.removeAlarmRoutine(index);
    }

    public void updateAlarmRoutine(int index, AlarmsRoutine medication) {
        model.updateAlarmRoutine(index, medication);
    }

    public List<AlarmsRoutine> getAlarmsRoutine() {
        return model.getAll();
    }

    public void setMedicationList(List<AlarmsRoutine> medications) {
        model.setAll(medications);
    }

    public void start() {
        mainView.setVisible(true);
        mainView.updateList();
    }

    public List<Medicament> getMedicamentsFromDB() {
        return consultas.getMedicaments();
    }

    public Medicament getMedicamentFromDB(int id) {
        return consultas.buscarMedicamento(id);
    }
}
