/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jrm.dosewise;

import java.util.Scanner;

import model.UserMedication;
import controller.UserMedicationController;

/**
 *
 * @author jeusm
 */
public class DosewiseMain {

    public static void main(String[] args) {
        UserMedication model = new UserMedication();
        UserMedicationController controller = new UserMedicationController(model);

        controller.start();
    }
}
