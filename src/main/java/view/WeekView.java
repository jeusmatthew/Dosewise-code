/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;

import model.AlarmRoutine;

/**
 *
 * @author IGNITER
 */
public class WeekView extends javax.swing.JPanel {
    private final MainView parent;

    public WeekView(MainView parent) {
        this.parent = parent;
        initComponents();
        initStyles();

        // Highlight today in the week view
        var today = java.time.LocalDate.now().getDayOfWeek().getValue();
        switch (today) {
            case 1:
                lunes.setBackground(Color.yellow);
                break;
            case 2:
                martes.setBackground(Color.yellow);
                break;
            case 3:
                miercoles.setBackground(Color.yellow);
                break;
            case 4:
                jueves.setBackground(Color.yellow);
                break;
            case 5:
                viernes.setBackground(Color.yellow);
                break;
            case 6:
                sabado.setBackground(Color.yellow);
                break;
            case 7:
                domingo.setBackground(Color.yellow);
                break;
        }
    }

    public void updateAlarmsSchedule(AlarmRoutine a) {
        String[] dom = new String[0];
        String[] lun = new String[0];
        String[] mar = new String[0];
        String[] mier = new String[0];
        String[] jue = new String[0];
        String[] vie = new String[0];
        String[] sab = new String[0];

        dom = a.getAlarms().stream().filter(alarm -> alarm.getTime().getDayOfWeek().getValue() == 7)
                .map(alarm -> alarm.getTime().getHour() + ":" + String.format("%02d", alarm.getTime().getMinute()))
                .toArray(String[]::new);

        lun = a.getAlarms().stream().filter(alarm -> alarm.getTime().getDayOfWeek().getValue() == 1)
                .map(alarm -> alarm.getTime().getHour() + ":"
                        + String.format("%02d", alarm.getTime().getMinute()))
                .toArray(String[]::new);

        mar = a.getAlarms().stream().filter(alarm -> alarm.getTime().getDayOfWeek().getValue() == 2)
                .map(alarm -> alarm.getTime().getHour() + ":"
                        + String.format("%02d", alarm.getTime().getMinute()))
                .toArray(String[]::new);

        mier = a.getAlarms().stream().filter(alarm -> alarm.getTime().getDayOfWeek().getValue() == 3)
                .map(alarm -> alarm.getTime().getHour() + ":"
                        + String.format("%02d", alarm.getTime().getMinute()))
                .toArray(String[]::new);

        jue = a.getAlarms().stream().filter(alarm -> alarm.getTime().getDayOfWeek().getValue() == 4)
                .map(alarm -> alarm.getTime().getHour() + ":"
                        + String.format("%02d", alarm.getTime().getMinute()))
                .toArray(String[]::new);

        vie = a.getAlarms().stream().filter(alarm -> alarm.getTime().getDayOfWeek().getValue() == 5)
                .map(alarm -> alarm.getTime().getHour() + ":"
                        + String.format("%02d", alarm.getTime().getMinute()))
                .toArray(String[]::new);

        sab = a.getAlarms().stream().filter(alarm -> alarm.getTime().getDayOfWeek().getValue() == 6)
                .map(alarm -> alarm.getTime().getHour() + ":"
                        + String.format("%02d", alarm.getTime().getMinute()))
                .toArray(String[]::new);

        listaDom.setListData(dom);
        listaLunes.setListData(lun);
        listaMartes.setListData(mar);
        listaMier.setListData(mier);
        listaJueves.setListData(jue);
        listaViernes.setListData(vie);
        listaSabado.setListData(sab);
    }

    public void clearFields() {
        listaDom.setListData(new String[0]);
        listaLunes.setListData(new String[0]);
        listaMartes.setListData(new String[0]);
        listaMier.setListData(new String[0]);
        listaJueves.setListData(new String[0]);
        listaViernes.setListData(new String[0]);
        listaSabado.setListData(new String[0]);
    }

    private void initStyles() {

        domingo.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        domingo.setForeground(Color.black);

        lunes.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        lunes.setForeground(Color.black);

        martes.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        martes.setForeground(Color.black);

        miercoles.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        miercoles.setForeground(Color.black);

        jueves.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        jueves.setForeground(Color.black);

        viernes.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        viernes.setForeground(Color.black);

        sabado.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        sabado.setForeground(Color.black);

        listaLunes.putClientProperty("FlatLaf.style", "font:bold $h4.font");
        listaLunes.setForeground(Color.black);

        listaMartes.putClientProperty("FlatLaf.style", "font:bold $h4.font");
        listaMartes.setForeground(Color.black);

        listaMier.putClientProperty("FlatLaf.style", "font:bold $h4.font");
        listaMier.setForeground(Color.black);

        listaJueves.putClientProperty("FlatLaf.style", "font:bold $h4.font");
        listaJueves.setForeground(Color.black);

        listaViernes.putClientProperty("FlatLaf.style", "font:bold $h4.font");
        listaViernes.setForeground(Color.black);

        listaSabado.putClientProperty("FlatLaf.style", "font:bold $h4.font");
        listaSabado.setForeground(Color.black);

        listaDom.putClientProperty("FlatLaf.style", "font:bold $h4.font");
        listaDom.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lunes = new javax.swing.JLabel();
        domingo = new javax.swing.JLabel();
        miercoles = new javax.swing.JLabel();
        martes = new javax.swing.JLabel();
        jueves = new javax.swing.JLabel();
        sabado = new javax.swing.JLabel();
        viernes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSabado = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        listaDom = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        listaLunes = new javax.swing.JList<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        listaMartes = new javax.swing.JList<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        listaMier = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        listaJueves = new javax.swing.JList<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        listaViernes = new javax.swing.JList<>();

        setBackground(getBackground());
        setPreferredSize(new java.awt.Dimension(730, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lunes.setText("Lunes");
        lunes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lunes.setOpaque(true);
        add(lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 70));

        domingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        domingo.setText("Domingo");
        domingo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        domingo.setOpaque(true);
        add(domingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        miercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miercoles.setText("Miércoles");
        miercoles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        miercoles.setOpaque(true);
        add(miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 100, 70));

        martes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        martes.setText("Martes");
        martes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        martes.setOpaque(true);
        add(martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 70));

        jueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jueves.setText("Jueves");
        jueves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jueves.setOpaque(true);
        add(jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 100, 70));

        sabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sabado.setText("Sabado");
        sabado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sabado.setOpaque(true);
        add(sabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 100, 70));

        viernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viernes.setText("Viernes");
        viernes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viernes.setOpaque(true);
        add(viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 100, 70));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaSabado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaSabado.setFocusable(false);
        jScrollPane1.setViewportView(listaSabado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 100, 310));

        jScrollPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane9.setToolTipText("");
        jScrollPane9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane9.setFocusable(false);
        jScrollPane9.setViewportView(listaDom);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 100, 310));

        jScrollPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane10.setToolTipText("");
        jScrollPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaLunes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaLunes.setFocusable(false);
        jScrollPane10.setViewportView(listaLunes);

        add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 310));

        jScrollPane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane11.setToolTipText("");
        jScrollPane11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaMartes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaMartes.setFocusable(false);
        jScrollPane11.setViewportView(listaMartes);

        add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 100, 310));

        jScrollPane12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane12.setToolTipText("");
        jScrollPane12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaMier.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaMier.setFocusable(false);
        jScrollPane12.setViewportView(listaMier);

        add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, 310));

        jScrollPane13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane13.setToolTipText("");
        jScrollPane13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaJueves.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaJueves.setFocusable(false);
        jScrollPane13.setViewportView(listaJueves);

        add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 100, 310));

        jScrollPane14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane14.setToolTipText("");
        jScrollPane14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listaViernes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaViernes.setFocusable(false);
        jScrollPane14.setViewportView(listaViernes);

        add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 100, 310));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel domingo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel jueves;
    private javax.swing.JList<String> listaDom;
    private javax.swing.JList<String> listaJueves;
    private javax.swing.JList<String> listaLunes;
    private javax.swing.JList<String> listaMartes;
    private javax.swing.JList<String> listaMier;
    private javax.swing.JList<String> listaSabado;
    private javax.swing.JList<String> listaViernes;
    private javax.swing.JLabel lunes;
    private javax.swing.JLabel martes;
    private javax.swing.JLabel miercoles;
    private javax.swing.JLabel sabado;
    private javax.swing.JLabel viernes;
    // End of variables declaration//GEN-END:variables
}
