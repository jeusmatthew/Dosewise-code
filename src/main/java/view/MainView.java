/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import controller.Controller;
import model.AlarmRoutine;
import model.Medicament;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author IGNITER
 */
public class MainView extends javax.swing.JFrame {

    private final Controller controller;
    private final WeekView weekView = new WeekView(this);
    private final AddMedicamentView addView = new AddMedicamentView(this);
    private final MedInfoView medView = new MedInfoView(this);

    /**
     * Creates new form NewJFrame
     * 
     * @param controller
     */
    public MainView(Controller controller) {
        this.controller = controller;
        initComponents();
        initStyles();
        setDate();
        FlatSVGIcon icon = new FlatSVGIcon("svg/IconoBusqueda.svg");
        setIconImage(icon.getImage());
        changeToWeekView();
    }

    private void initStyles() {

        dateText.putClientProperty("FlatLaf.style", "font: bold $h4.font");
        dateText.setForeground(Color.GRAY);
        lblActualMed.putClientProperty("FlatLaf.style", "font: bold $h2.regular.font");
        lblActualMed.setForeground(Color.black);
        lblMed.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        lblMed.setForeground(Color.black);
        jLabelName.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        jLabelName.setForeground(Color.black);
        // textBuscar.putClientProperty("JComponent.roundRect", true);

        // btnSearch.putClientProperty("JButton.buttonType", "roundRect");
        btnAdd.putClientProperty("JButton.buttonType", "roundRect");
        btnDelete.putClientProperty("JButton.buttonType", "roundRect");

        lstMeds.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        lstMeds.setForeground(Color.black);

    }

    private void setDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "MX");
        dateText.setText(
                now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    public void setJPanel(JPanel p) {
        p.setSize(870, 590);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public void changeToWeekView() {
        setJPanel(weekView);
    }

    public void changeToAddView() {
        setJPanel(addView);
    }

    public void changeToMedView() {
        setJPanel(medView);
    }

    public Medicament getMedicamentFromDB(int id) {
        return controller.getMedicamentFromDB(id);
    }

    public void addAlarmRoutine(AlarmRoutine a) {
        controller.addAlarmRoutine(a);
        lblActualMed.setText(String.format("%s (%s)", a.getMedicament().getName(), a.getMedicament().getCompound()));
        updateList();
        updateWeekList(a);
    }

    public void updateList() {
        var temp = new ArrayList<String>();
        for (AlarmRoutine alarmsRoutine : controller.getAlarmsRoutine()) {
            temp.add(alarmsRoutine.getMedicament().getName());
        }

        lstMeds.setListData(temp.toArray(new String[0]));
    }

    public List<AlarmRoutine> getAlarmsRoutine() {
        return controller.getAlarmsRoutine();
    }

    public void updateWeekList(AlarmRoutine a) {
        weekView.updateAlarmsSchedule(a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMeds = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        lblMed = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        lblActualMed = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelBG.setToolTipText("");
        jPanelBG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnDelete.setText("Eliminar Medicamento");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lstMeds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMedsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstMeds);

        btnAdd.setText("Añadir Medicamento");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblMed.setText("Medicamentos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel2Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jScrollPane1))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 14, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMed)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblMed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        jPanelBG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 580));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateText.setBackground(new java.awt.Color(0, 0, 0));
        dateText.setText("Hoy es {dayname} {day} de {month} del {year} ");
        jPanel1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 250, 40));

        jLabelName.setText("DOSEWISE ");
        jPanel1.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblActualMed.setText(" ");
        jPanel1.add(lblActualMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanelBG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 870, 110));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 730, Short.MAX_VALUE));
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 410, Short.MAX_VALUE));

        jPanelBG.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 730, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        setSize(new java.awt.Dimension(1120, 582));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
        int index = lstMeds.getSelectedIndex();
        if (index != -1) {
            controller.removeAlarmRoutine(index);
            updateList();
        }
        weekView.clearFields();
        lblActualMed.setText(" ");
    }// GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
        setMenuButtonsVisible(false);

        String[] temp = new String[controller.getMedicamentsFromDB().size()];
        for (int i = 0; i < controller.getMedicamentsFromDB().size(); i++) {
            temp[i] = controller.getMedicamentsFromDB().get(i).getName();
        }
        addView.setMedicaments(temp);
        changeToAddView();

    }// GEN-LAST:event_btnAddActionPerformed

    private void lstMedsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lstMedsMouseClicked
        int index = lstMeds.getSelectedIndex();

        if (evt.getClickCount() == 2) {
            if (index != -1) {
                medView.setMedicament(controller.getMedicamentFromDB(lstMeds.getSelectedValue()));
                changeToMedView();
            }
        } else if (evt.getClickCount() == 1) {
            if (index != -1) {
                AlarmRoutine ar = controller.getAlarmsRoutine().get(index);
                lblActualMed.setText(
                        String.format("%s (%s)", ar.getMedicament().getName(), ar.getMedicament().getCompound()));
                weekView.updateAlarmsSchedule(ar);
                medView.setMedicament(controller.getMedicamentFromDB(lstMeds.getSelectedValue()));
            }
        }
    }// GEN-LAST:event_lstMedsMouseClicked

    public void setMenuButtonsVisible(boolean b) {
        btnAdd.setVisible(b);
        btnDelete.setVisible(b);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualMed;
    private javax.swing.JLabel lblMed;
    private javax.swing.JList<String> lstMeds;
    // End of variables declaration//GEN-END:variables

}