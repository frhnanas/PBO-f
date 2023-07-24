/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Farhan
 */
public class ShowTable extends javax.swing.JFrame {

    /**
     * Creates new form table
     */
    public ShowTable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        klasemen = new javax.swing.JTable();
        ADD_DATA = new javax.swing.JButton();
        home = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        klasemen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        klasemen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team", "MP", "W", "D", "L", "GF", "GA", "GD", "Pts"
            }
        ));
        jScrollPane1.setViewportView(klasemen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 810, 200));

        ADD_DATA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ADD_DATA.setText("ADD DATA");
        ADD_DATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_DATAActionPerformed(evt);
            }
        });
        getContentPane().add(ADD_DATA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 120, 25));

        home.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 120, 25));

        Reset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Reset.setText("DELETE");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 120, -1));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/table.jpg"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADD_DATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_DATAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD_DATAActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_DATA;
    private javax.swing.JButton Reset;
    private javax.swing.JButton home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable klasemen;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

    public JButton getADD_DATA() {
        return ADD_DATA;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JButton getHome() {
        return home;
    }

    public JButton getReset() {
        return Reset;
    }


    public JTable getKlasemen() {
        return klasemen;
    }
    
    public int getSelectedKlasemen(){
        return klasemen.getSelectedRow();
    }

 
    public void setklasemen(DefaultTableModel x){
        klasemen.setModel(x);
    }
    

    
    public void addActionListener(ActionListener x){
        ADD_DATA.addActionListener(x); 
        home.addActionListener(x);
        Reset.addActionListener(x);
    }

    
    public void addMouseAdapter(MouseAdapter x){
        klasemen.addMouseListener(x);
    }
   
}