/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jrm.dosewise;

import java.util.Scanner;

import model.MedicamentList;
import controller.Controller;

/**
 *
 * @author jeusm
 */
public class DosewiseMain {

    public static void main(String[] args) {
        MedicamentList model = new MedicamentList();
        Controller controller = new Controller(model);

        controller.start();
    }
}
