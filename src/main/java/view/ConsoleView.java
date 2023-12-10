package view;

import java.util.List;
import java.util.Scanner;

import controller.UserMedicationController;
import model.Dosage;
import model.DosagePerHour;
import model.Medicament;
import model.MedicamentReminder;
import model.UserMedication;

public class ConsoleView implements Observer {
    private UserMedication model;
    private UserMedicationController controller;

    public ConsoleView(UserMedication model, UserMedicationController controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Medication list updated");
        controller.getMedicationList().forEach(m -> System.out.println(m));
    }

    public void dismissAlarm() {
        System.out.println("Alarm dismissed");
    }

    public void getUserInput() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        // ESTA demasiado acoplado a la implementacion de la lista en el contexto
        // acutal//// HASTA COPILOT LO SABE XDDDDDDDDDDD
        while (true) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Medication name: ");
                    String name = sc.next();
                    Medicament medicament = new Medicament(name, "description", "compound");
                    System.out.println("Dosage per hour:\nhours x days");
                    int hours = sc.nextInt();
                    int days = sc.nextInt();
                    Dosage dosagePerHour = new DosagePerHour(hours, days);
                    MedicamentReminder medication = new MedicamentReminder(dosagePerHour, medicament);
                    controller.addMedication(medication);
                    System.out.println("Medication " + name + " added");
                    break;

                case 2:
                    // imprime la lista de medicamentos y pide el indice a eliminar
                    controller.getMedicationList().forEach(m -> System.out.println(m.getMedicament().getName()));
                    System.out.println("Medication index: ");
                    int index = sc.nextInt();
                    controller.removeMedication(index-1);
                    System.out.println("Medication removed");
                    break;

                case 3:
                    System.out.println("Medication name: ");
                    name = sc.next();
                    medicament = new Medicament(name, "description", "compound");
                    dosagePerHour = new DosagePerHour(1, 1);
                    medication = new MedicamentReminder(dosagePerHour, medicament);
                    controller.updateMedication(medication);
                    System.out.println("Medication " + name + " updated");
                    break;

                case 4:
                    controller.getMedicationList().forEach(m -> System.out.println(m.getMedicament().getName()));
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }
            printMenu();
        }
    }

    public void printMenu() {
        System.out.println("1. Add medication");
        System.out.println("2. Remove medication");
        System.out.println("3. Update medication");
        System.out.println("4. View medication list");
        System.out.println("5. Exit");
    }

}
