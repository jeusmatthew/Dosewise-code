/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme;
import javax.swing.UIManager;

/**
 *
 * @author Jimena
 */
public class Mavenproject1 {

    public static void main(String[] args) {
       FlatLightLaf.setup();
       
        Panel1 f = new Panel1();
        f.setVisible(true);
    }
}
