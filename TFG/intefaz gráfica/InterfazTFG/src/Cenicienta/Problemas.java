/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cenicienta;

import AAAALanzador.*;
import LlenandoPiscinas.*;
import CodigosDeBarras.*;

/**
 *
 * @author maxxi
 */
public class Problemas extends javax.swing.JFrame {

    
    public Problemas() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCB = new javax.swing.JButton();
        jButtonCenicienta = new javax.swing.JButton();
        jButtonLP = new javax.swing.JButton();
        jButtonLPDSR = new javax.swing.JButton();
        SC = new javax.swing.JButton();
        jButtonPA = new javax.swing.JButton();
        jButtonQM = new javax.swing.JButton();
        jButtonLTDLE = new javax.swing.JButton();
        jButtonMJF = new javax.swing.JButton();
        jButtonSalidas = new javax.swing.JButton();
        jButtonDOCUMENTACION = new javax.swing.JButton();
        jButtonPROBLEMAS = new javax.swing.JButton();
        jLabelENCABEZADO = new javax.swing.JLabel();
        jLabelFONDO_IZQ = new javax.swing.JLabel();
        jLabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCB.setText("jButton1");
        jButtonCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jButtonCenicienta.setText("jButton2");
        jButtonCenicienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCenicientaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCenicienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jButtonLP.setText("jButton3");
        jButtonLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jButtonLPDSR.setText("jButton4");
        jButtonLPDSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLPDSRActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLPDSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        SC.setText("jButton5");
        SC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCActionPerformed(evt);
            }
        });
        getContentPane().add(SC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jButtonPA.setText("jButton6");
        jButtonPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jButtonQM.setText("jButton7");
        jButtonQM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jButtonLTDLE.setText("jButton8");
        jButtonLTDLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLTDLEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLTDLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jButtonMJF.setText("jButton9");
        jButtonMJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMJFActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        jButtonSalidas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalidas.setText("Más salidas");
        jButtonSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 170, 40));

        jButtonDOCUMENTACION.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDOCUMENTACION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDOCUMENTACION.setForeground(new java.awt.Color(0, 153, 153));
        jButtonDOCUMENTACION.setText("Documentación");
        jButtonDOCUMENTACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDOCUMENTACIONActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDOCUMENTACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 160, 40));

        jButtonPROBLEMAS.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPROBLEMAS.setForeground(new java.awt.Color(0, 153, 153));
        jButtonPROBLEMAS.setText("Problemas");
        jButtonPROBLEMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPROBLEMASActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPROBLEMAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        jLabelENCABEZADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde oscuro.jpg"))); // NOI18N
        getContentPane().add(jLabelENCABEZADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jLabelFONDO_IZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde clarito.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO_IZQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 740, 60));

        jLabelFONDO.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 1000, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPROBLEMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPROBLEMASActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonPROBLEMASActionPerformed

    private void jButtonSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidasActionPerformed
        // TODO add your handling code here:
        Documentacion1 a= new Documentacion1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalidasActionPerformed

    private void jButtonDOCUMENTACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDOCUMENTACIONActionPerformed
        // TODO add your handling code here:
        Documentacion a= new Documentacion();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonDOCUMENTACIONActionPerformed

    private void jButtonQMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonQMActionPerformed

    private void jButtonCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonCBActionPerformed

    private void jButtonCenicientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenicientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCenicientaActionPerformed

    private void jButtonLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLPActionPerformed

    private void jButtonLPDSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLPDSRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLPDSRActionPerformed

    private void SCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCActionPerformed

    private void jButtonPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPAActionPerformed

    private void jButtonLTDLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLTDLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLTDLEActionPerformed

    private void jButtonMJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMJFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMJFActionPerformed

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
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Problemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SC;
    private javax.swing.JButton jButtonCB;
    private javax.swing.JButton jButtonCenicienta;
    private javax.swing.JButton jButtonDOCUMENTACION;
    private javax.swing.JButton jButtonLP;
    private javax.swing.JButton jButtonLPDSR;
    private javax.swing.JButton jButtonLTDLE;
    private javax.swing.JButton jButtonMJF;
    private javax.swing.JButton jButtonPA;
    private javax.swing.JButton jButtonPROBLEMAS;
    private javax.swing.JButton jButtonQM;
    private javax.swing.JButton jButtonSalidas;
    private javax.swing.JLabel jLabelENCABEZADO;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelFONDO_IZQ;
    // End of variables declaration//GEN-END:variables
}
