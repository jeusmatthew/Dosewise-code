package controller;

import java.util.List;

import database.Consultas;
import model.AlarmRoutine;
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

    public void addAlarmRoutine(AlarmRoutine medication) {
        model.addAlarmRoutine(medication);
    }

    public void removeAlarmRoutine(AlarmRoutine medication) {
        model.removeAlarmRoutine(medication);
    }

    public void removeAlarmRoutine(int index) {
        model.removeAlarmRoutine(index);
    }

    public void updateAlarmRoutine(int index, AlarmRoutine medication) {
        model.updateAlarmRoutine(index, medication);
    }

    public List<AlarmRoutine> getAlarmsRoutine() {
        return model.getAll();
    }

    public void setMedicationList(List<AlarmRoutine> medications) {
        model.setAll(medications);
    }

    public void start() {
        mainView.setVisible(true);
        mainView.updateList();
        mainView.updateWeekList();
    }

    public List<Medicament> getMedicamentsFromDB() {
        return consultas.getAllMedicaments();
    }

    public Medicament getMedicamentFromDB(int id) {
        return consultas.searchMedicament(id);
    }

    public Medicament getMedicamentFromDB(String name) {
        return consultas.searchMedicament(name);
    }
}
