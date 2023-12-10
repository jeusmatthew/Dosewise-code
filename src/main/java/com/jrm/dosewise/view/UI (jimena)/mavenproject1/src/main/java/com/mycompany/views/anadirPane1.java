/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author IGNITER
 */
public class anadirPane1 extends javax.swing.JPanel {

    /**
     * Creates new form anadirPane1
     */
    public anadirPane1() {
        initComponents();
       
    }
    
    private void initContent() {
        showJPanel(new DatePane());
    }

    private void showJPanel(JPanel p) {
        p.setSize(870, 590);
        p.setLocation(0, 0);

        JPanel3.removeAll();
        JPanel3.add(p, BorderLayout.CENTER);
        JPanel3.revalidate();
        JPanel3.repaint();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel3 = new javax.swing.JPanel();
        labelAnadir = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        por = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        dosis = new javax.swing.JLabel();
        cada = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        añadir = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicamento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        JPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAnadir.setText("Añadir nuevo medicamento");
        JPanel3.add(labelAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dias", "semanas", "meses", " " }));
        JPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 93, -1));

        por.setText("por");
        JPanel3.add(por, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 30, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 93, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 93, -1));

        dosis.setText("Dosis de Toma");
        JPanel3.add(dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        cada.setText("Cada");
        JPanel3.add(cada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        JPanel3.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 140, 30));

        añadir.setText("Añadir Medicamento");
        añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        JPanel3.add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 200, 40));

        add(JPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 680, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
      
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel3;
    public javax.swing.JButton añadir;
    private javax.swing.JLabel cada;
    public javax.swing.JButton cancelar;
    private javax.swing.JLabel dosis;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel labelAnadir;
    private javax.swing.JLabel por;
    // End of variables declaration//GEN-END:variables
}
