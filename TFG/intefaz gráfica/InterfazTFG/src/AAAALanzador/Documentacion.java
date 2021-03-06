/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AAAALanzador;

import LlenandoPiscinas.*;
import CodigosDeBarras.*;

/**
 *
 * @author maxxi
 */
public class Documentacion extends javax.swing.JFrame {

    
    public Documentacion() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabelso = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabeljava = new javax.swing.JLabel();
        jButtonSalidas = new javax.swing.JButton();
        jButtonDOCUMENTACION = new javax.swing.JButton();
        jButtonPROBLEMAS = new javax.swing.JButton();
        jLabelENCABEZADO = new javax.swing.JLabel();
        jLabelFONDO_IZQ = new javax.swing.JLabel();
        jLabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1030, 600));
        setMinimumSize(new java.awt.Dimension(1030, 600));
        setPreferredSize(new java.awt.Dimension(1030, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("TIPOS DE SALIDAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabelso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelso.setText("Selección de sistema operativo");
        getContentPane().add(jLabelso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("El programa se ha diseñado para que funcione en más de un sistema operativo para facilitar su acceso a más personas. Los sistemas\noperativos compatibles 100%,  una vez tengan instalados las versiones de java necesarias, son: Ubuntu 16.04 y Windows 10. El problema\nreside en que la función que realiza las pruebas no es igual en ambos sistemas. La detección del sistema operativo se realiza con una\nprueba muy sencilla que precisa del paso anterior. Si el sistema operativo no corresponde a una distribución de Windows o Linux, saltará\nun mensaje indicando \"Sistema operativo incompatible\" que pondrá fin a la prueba del código.");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 970, 130));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("En este caso no hace falta notificar al usuario que ha seleccionado su archivo .java, así que, solo saltará una notificación cuando le haya\ndado al botón de enviar y no haya seleccionado nada. El mensaje de error es el siguiente: \"Aun no has seleccionado ningun archivo\".\nEste mensaje impide continuar hasta que no se seleccione un archivo con extensión .java.");
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.getAccessibleContext().setAccessibleParent(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 970, 100));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("El programa tiene una serie de salidas por pantalla determinadas en función del valor que arroje el corrector tras realizar una prueba.\nPrincipalmente, estas se pueden agrupar en función de 4 momentos concretos durante la correción: selección del archivo,\nreconocimiento del sistema operativo, compilación del código y prueba del código.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleParent(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 970, 100));

        jLabeljava.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabeljava.setText("Selección del archivo .java");
        getContentPane().add(jLabeljava, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

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
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPROBLEMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPROBLEMASActionPerformed
        // TODO add your handling code here:
        Problemas a= new Problemas();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPROBLEMASActionPerformed

    private void jButtonSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidasActionPerformed
        // TODO add your handling code here:
        Documentacion1 a= new Documentacion1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalidasActionPerformed

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
            java.util.logging.Logger.getLogger(Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Documentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDOCUMENTACION;
    private javax.swing.JButton jButtonPROBLEMAS;
    private javax.swing.JButton jButtonSalidas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelENCABEZADO;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelFONDO_IZQ;
    private javax.swing.JLabel jLabeljava;
    private javax.swing.JLabel jLabelso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
