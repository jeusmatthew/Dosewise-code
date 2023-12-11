/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import controller.Controller;


import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author IGNITER
 */
public class MainView extends javax.swing.JFrame {
    
    private Controller controller;
    private final WeekView weekView = new WeekView();
    private final AddMedicamentView addView = new AddMedicamentView(this);
    private final MedInfoView medView = new MedInfoView();
    
    /**
     * Creates new form NewJFrame
     */
    public MainView(Controller controller) {
        this.controller = controller;
        initComponents();
        initStyles();
        setDate();
        FlatSVGIcon icon = new FlatSVGIcon("svg/IconoBusqueda.svg");
        setIconImage(icon.getImage());
        setJPanel(weekView);
    }
    
    private void initStyles() {
        
        dateText.putClientProperty("FlatLaf.style", "font:bold $h4.regular.font");
        dateText.setForeground(Color.GRAY);

        jLabelName.putClientProperty("FlatLaf.style", "font:bold $h1.regular.font");
        jLabelName.setForeground(Color.black);
        textBuscar.putClientProperty("JComponent.roundRect", true);

        buscar.putClientProperty("JButton.buttonType", "roundRect");
        anadir.putClientProperty("JButton.buttonType", "roundRect");
        eliminar.putClientProperty("JButton.buttonType", "roundRect");
        
        listaPanel1.putClientProperty("FlatLaf.style", "font:bold $h3.regular.font");
        listaPanel1.setForeground(Color.black);
       
    }

    private void setDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "MX");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        textBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPanel1 = new javax.swing.JList<>();
        anadir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelBG.setToolTipText("");
        jPanelBG.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        buscar.setIcon(new FlatSVGIcon ("SVG/IconoBusqueda.svg"));
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar Medicamento");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        textBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscarActionPerformed(evt);
            }
        });

        listaPanel1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPanel1);

        anadir.setText("Añadir Medicamento");
        anadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 580));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateText.setBackground(new java.awt.Color(0, 0, 0));
        dateText.setText("Hoy es {dayname} {day} de {month} del {year} ");
        jPanel1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 250, 40));

        jLabelName.setText("DOSE WISE ");
        jPanel1.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanelBG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 870, 110));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanelBG.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 730, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1120, 582));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void textBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        setMenuButtonsVisible(false);
        changeToAddView();
        
    }//GEN-LAST:event_anadirActionPerformed

    public void setMenuButtonsVisible(boolean b) {
        anadir.setVisible(b);
        eliminar.setVisible(b);
    }

    /**
     * @param args the command line arguments
     */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */


//  /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {

//             @Override
//             public void run() {
//                 new MainView().setVisible(true);
//             }
//         });
//     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JButton buscar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPanel1;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables

}
