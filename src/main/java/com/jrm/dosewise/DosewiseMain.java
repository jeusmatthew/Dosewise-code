/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jrm.dosewise;

import model.MedicamentList;
import controller.Controller;
import database.Consultas;

/**
 *
 * @author 
 * Jimena Guadalupe Garcia Rios
 * Raul Alejandro Magaña Flores
 * Jesus Mateo Ortiz Chay
 */
public class DosewiseMain {

    public static void main(String[] args) {
        var model = new MedicamentList();
        var consultas = new Consultas();
        var controller = new Controller(model, consultas);

        controller.start();
    }
}
