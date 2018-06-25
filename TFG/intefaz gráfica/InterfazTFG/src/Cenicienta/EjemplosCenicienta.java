/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cenicienta;

import CodigosDeBarras.*;
import AAAALanzador.Documentacion;
import AAAALanzador.Problemas;

/**
 *
 * @author maxxi
 */
public class EjemplosCenicienta extends javax.swing.JFrame {

    
    public EjemplosCenicienta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButtonDOCUMENTACION = new javax.swing.JButton();
        jButtonPROBLEMAS = new javax.swing.JButton();
        jButtonENUNCIADO = new javax.swing.JButton();
        jButtonEJEMPLOS = new javax.swing.JButton();
        jButtonCREDITOS = new javax.swing.JButton();
        jButtonENVIAR = new javax.swing.JButton();
        jLabelTIEMPO = new javax.swing.JLabel();
        jLabelNOMBRE_EJERCICIO = new javax.swing.JLabel();
        jLabelENCABEZADO = new javax.swing.JLabel();
        jLabelFONDO_IZQ = new javax.swing.JLabel();
        jLabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1030, 600));
        setMinimumSize(new java.awt.Dimension(1030, 600));
        setPreferredSize(new java.awt.Dimension(1030, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("La entrada comienza con un entero que indica el número de casos de prueba que vendrán a continuación. Cada caso comienza con una línea con\nel tiempo que queda hasta el momento de salir de casa para ir al baile expresado como DD:HH:MM:SS (días, horas, minutos y segundos). La \nlínea siguiente contiene una lista con las duraciones de las entre 0 y 100 tareas que Cenicienta debe realizar. Los tiempos vienen expresados en\nel formato HH:MM:SS. La lista finaliza con una tarea de duración nula (00:00:00). Puede suponerse que los tiempos son correctos: \n0 ≤ horas < 24, 0 ≤ minutos < 60 y 0 ≤ segundos < 60. Además 0 ≤ días < 100.\n\nPara cada caso de prueba se indicará \"SI\" si Cenicienta puede realizar todas las tareas estrictamente antes de que termine el tiempo que queda\npara salir y \"NO\" en caso contrario.\n\nENTRADA DE EJEMPO\n\n2 \n00:05:40:00 \n01:30:00 00:45:20 03:20:50 00:00:00 \n01:02:00:00 \n08:05:40 05:00:10 07:55:00 05:10:06 00:00:00\n\nSALIDA DE EJEMPLO\n\nSI \nNO");
        jScrollPane1.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1000, 460));

        jButtonDOCUMENTACION.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDOCUMENTACION.setForeground(new java.awt.Color(0, 153, 153));
        jButtonDOCUMENTACION.setText("Documentación");
        jButtonDOCUMENTACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDOCUMENTACIONActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDOCUMENTACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 40));

        jButtonPROBLEMAS.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPROBLEMAS.setForeground(new java.awt.Color(0, 153, 153));
        jButtonPROBLEMAS.setText("Problemas");
        jButtonPROBLEMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPROBLEMASActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPROBLEMAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        jButtonENUNCIADO.setText("Enunciado");
        jButtonENUNCIADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENUNCIADOActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonENUNCIADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, 40));

        jButtonEJEMPLOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEJEMPLOS.setText("Ejemplos");
        jButtonEJEMPLOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEJEMPLOSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEJEMPLOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 130, 40));

        jButtonCREDITOS.setText("Créditos");
        jButtonCREDITOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCREDITOSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCREDITOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 130, 40));

        jButtonENVIAR.setText("Enviar");
        jButtonENVIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENVIARActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonENVIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 130, 40));

        jLabelTIEMPO.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTIEMPO.setText("Tiempo máximo: 1,000 s                             Memoria máxima: 4096 KiB");
        getContentPane().add(jLabelTIEMPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 480, -1));

        jLabelNOMBRE_EJERCICIO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNOMBRE_EJERCICIO.setText("EL BAILE DE CENICIENTA");
        getContentPane().add(jLabelNOMBRE_EJERCICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 40));

        jLabelENCABEZADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde oscuro.jpg"))); // NOI18N
        getContentPane().add(jLabelENCABEZADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jLabelFONDO_IZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde clarito.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO_IZQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 740, 60));
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENVIARActionPerformed
       
        EntregaCenicienta a= new EntregaCenicienta();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonENVIARActionPerformed

    private void jButtonEJEMPLOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJEMPLOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEJEMPLOSActionPerformed

    private void jButtonCREDITOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREDITOSActionPerformed
        CreditosCenicienta a= new CreditosCenicienta();
        a.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonCREDITOSActionPerformed

    private void jButtonPROBLEMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPROBLEMASActionPerformed
        // TODO add your handling code here:
        Problemas a= new Problemas();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPROBLEMASActionPerformed

    private void jButtonENUNCIADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENUNCIADOActionPerformed
        // TODO add your handling code here:
        EnunciadoCenicienta a= new EnunciadoCenicienta();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonENUNCIADOActionPerformed

    private void jButtonDOCUMENTACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDOCUMENTACIONActionPerformed
        // TODO add your handling code here:
        Documentacion a= new Documentacion();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonDOCUMENTACIONActionPerformed

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
            java.util.logging.Logger.getLogger(EjemplosCenicienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemplosCenicienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemplosCenicienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemplosCenicienta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemplosCenicienta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCREDITOS;
    private javax.swing.JButton jButtonDOCUMENTACION;
    private javax.swing.JButton jButtonEJEMPLOS;
    private javax.swing.JButton jButtonENUNCIADO;
    private javax.swing.JButton jButtonENVIAR;
    private javax.swing.JButton jButtonPROBLEMAS;
    private javax.swing.JLabel jLabelENCABEZADO;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelFONDO_IZQ;
    private javax.swing.JLabel jLabelNOMBRE_EJERCICIO;
    private javax.swing.JLabel jLabelTIEMPO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
