/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LlenandoPiscinas;

import AAAALanzador.Documentacion;
import CodigosDeBarras.*;
import AAAALanzador.Problemas;

/**
 *
 * @author maxxi
 */
public class EjemplosLlenandoPiscinas extends javax.swing.JFrame {

    
    public EjemplosLlenandoPiscinas() {
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
        jTextArea5.setText("La entrada estará compuesta de múltiples casos de prueba, cada uno en una línea.\nCada uno de los casos de prueba empezará con la descripción de una \"competición\" entre nosotros y el vecino. Los tres primeros números indican \nlos litros de agua de nuestra piscina (1≤ p ≤ 10^9), el número de litros de nuestro barreño (1 ≤ b ≤ 10^9) y por último los litros de agua que la \npiscina pierde durante el viaje. \nA continuación aparecen tres números para indicar la misma información pero de nuestro vecino.\nLa entrada termina cuando alguna de las piscinas no tiene capacidad (aparece a cero).\n\nPara cada caso de prueba aparecerá una línea compuesta por el ganador y el número de viajes que ha realizado. Como ganador, se indicará YO si \nnosotros terminamos antes de llenar la piscina (hacemos menos viajes para conseguirlo) y VECINO si es el vecino. En caso de empate, se indicará \nEMPATE.\n\nENTRADA DE EJEMPLO\n\n10 5 1 15 6 1 \n50 5 1 50 5 0 \n50 5 1 50 5 6 \n0 0 0 0 0 0\n\nSALIDA DE EJEMPLO\n\nEMPATE 3 \nVECINO 10 \nYO 13\n");
        jScrollPane1.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1000, 430));

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
        getContentPane().add(jLabelTIEMPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 660, -1));

        jLabelNOMBRE_EJERCICIO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNOMBRE_EJERCICIO.setText("LLENANDO PISCINAS");
        getContentPane().add(jLabelNOMBRE_EJERCICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 40));

        jLabelENCABEZADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde oscuro.jpg"))); // NOI18N
        getContentPane().add(jLabelENCABEZADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jLabelFONDO_IZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde clarito.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO_IZQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 740, 60));
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENVIARActionPerformed
       
        EntregaLlenandoPiscinas a= new EntregaLlenandoPiscinas();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonENVIARActionPerformed

    private void jButtonEJEMPLOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJEMPLOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEJEMPLOSActionPerformed

    private void jButtonCREDITOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREDITOSActionPerformed
        CreditosLlenandoPiscinas a= new CreditosLlenandoPiscinas();
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
        EnunciadoLlenandoPiscinas a= new EnunciadoLlenandoPiscinas();
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
            java.util.logging.Logger.getLogger(EjemplosLlenandoPiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemplosLlenandoPiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemplosLlenandoPiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemplosLlenandoPiscinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EjemplosLlenandoPiscinas().setVisible(true);
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
