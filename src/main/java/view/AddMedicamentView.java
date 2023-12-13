/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.AlarmRoutine;
import model.Dosage;
import model.DosagePerDay;
import model.DosagePerHour;
import model.Medicament;


/**
 *
 * @author IGNITER
 */
public class AddMedicamentView extends javax.swing.JPanel {
    private MainView parent;
    /**
     * Creates new form anadirPane1
     */
    public AddMedicamentView(MainView parent) {
        this.parent = parent;
        initComponents();
        initStyles();
    }
    
    private void initStyles() {
        btnAdd.putClientProperty("JButton.buttonType", "roundRect");
        btnCancelar.putClientProperty("JButton.buttonType", "roundRect");
    }
   
    public void setMedicaments(String[] medicaments) {
        cmbMeds.setModel(new javax.swing.DefaultComboBoxModel<>(medicaments));
    }

    public String getMedicament() {
        return cmbMeds.getSelectedItem().toString();
    }

    private void clearFields() {
        txtPeriodo1.setText("");
        txtPeriodo2.setText("");
        cmbMeds.setSelectedIndex(0);
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
        cmbPer2 = new javax.swing.JComboBox<>();
        por = new javax.swing.JLabel();
        cmbMeds = new javax.swing.JComboBox<>();
        cmbPer1 = new javax.swing.JComboBox<>();
        dosis = new javax.swing.JLabel();
        cada = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtPeriodo2 = new javax.swing.JTextField();
        txtPeriodo1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicamento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        labelAnadir.setText("Añadir nuevo medicamento");

        cmbPer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dias", "semanas" }));

        por.setText("por");

        cmbMeds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMeds.setToolTipText("");

        cmbPer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "dias" }));
        cmbPer1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPer1ItemStateChanged(evt);
            }
        });
        cmbPer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPer1ActionPerformed(evt);
            }
        });

        dosis.setText("Dosis de Toma");

        cada.setText("Cada");

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAdd.setText("Añadir Medicamento");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPeriodo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodo2ActionPerformed(evt);
            }
        });

        txtPeriodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel3Layout = new javax.swing.GroupLayout(JPanel3);
        JPanel3.setLayout(JPanel3Layout);
        JPanel3Layout.setHorizontalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel3Layout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addComponent(cada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPer2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(JPanel3Layout.createSequentialGroup()
                .addGroup(JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel3Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cmbMeds, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAnadir)))
                    .addGroup(JPanel3Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel3Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(dosis)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel3Layout.setVerticalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelAnadir)
                .addGap(30, 30, 30)
                .addComponent(cmbMeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dosis)
                .addGap(26, 26, 26)
                .addGroup(JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(por)
                    .addComponent(cmbPer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeriodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cada))
                .addGap(32, 32, 32)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(JPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 680, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        Dosage dosage = null;
        
        if(cmbPer1.getSelectedItem().toString().equals("horas") && cmbPer2.getSelectedItem().toString().equals("dias")) {
            dosage = new DosagePerHour(Integer.parseInt(txtPeriodo1.getText()),
            Integer.parseInt(txtPeriodo2.getText()));
        } else if (cmbPer1.getSelectedItem().toString().equals("dias")
        && cmbPer2.getSelectedItem().toString().equals("semanas")) {
            dosage = new DosagePerDay(Integer.parseInt(txtPeriodo1.getText()), Integer.parseInt(txtPeriodo2.getText()));
        } 
        else {
            JOptionPane.showMessageDialog(this, "Ingrese un periodo valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        AlarmRoutine ar = new AlarmRoutine(dosage, parent.getMedicamentFromDB(cmbMeds.getSelectedIndex() + 1));
        parent.addAlarmRoutine(ar);
        parent.changeToWeekView();
        parent.setMenuButtonsVisible(true);
        clearFields();
    }//GEN-LAST:event_btnAddActionPerformed

    

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        parent.changeToWeekView();
        parent.setMenuButtonsVisible(true);
        clearFields();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbPer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPer1ActionPerformed

    private void txtPeriodo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodo2ActionPerformed

    private void txtPeriodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodo1ActionPerformed

    private void cmbPer1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPer1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPer1ItemStateChanged

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel3;
    public javax.swing.JButton btnAdd;
    public javax.swing.JButton btnCancelar;
    private javax.swing.JLabel cada;
    public javax.swing.JComboBox<String> cmbMeds;
    public javax.swing.JComboBox<String> cmbPer1;
    public javax.swing.JComboBox<String> cmbPer2;
    private javax.swing.JLabel dosis;
    private javax.swing.JLabel labelAnadir;
    private javax.swing.JLabel por;
    private javax.swing.JTextField txtPeriodo1;
    private javax.swing.JTextField txtPeriodo2;
    // End of variables declaration//GEN-END:variables
}
