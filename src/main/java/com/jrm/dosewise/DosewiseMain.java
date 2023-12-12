/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jrm.dosewise;

import model.UserList;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import controller.Controller;
import database.Consultas;

/**
 *
 * @author
 *         Jimena Guadalupe Garcia Rios
 * @author
 *         Raul Alejandro Magaña Flores
 * @author
 *         Jesus Mateo Ortiz Chay
 * 
 * @version 0.9.0a
 */
public class DosewiseMain {

    public static void main(String[] args) {

        FlatMacLightLaf.setup();

        var model = new UserList();
        var consultas = new Consultas();
        var controller = new Controller(model, consultas);

        controller.start();
    }
}
