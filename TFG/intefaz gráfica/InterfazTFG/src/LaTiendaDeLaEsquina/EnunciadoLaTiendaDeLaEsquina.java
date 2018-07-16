/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaTiendaDeLaEsquina;

import LlenandoPiscinas.*;
import CodigosDeBarras.*;
import AAAALanzador.Documentacion;
import AAAALanzador.Problemas;

/**
 *
 * @author maxxi
 */
public class EnunciadoLaTiendaDeLaEsquina extends javax.swing.JFrame {

    
    public EnunciadoLaTiendaDeLaEsquina() {
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
        jScrollPanelTEXTO = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1030, 600));
        setMinimumSize(new java.awt.Dimension(1030, 600));
        setPreferredSize(new java.awt.Dimension(1030, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButtonENUNCIADO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonENUNCIADO.setText("Enunciado");
        getContentPane().add(jButtonENUNCIADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, 40));

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
        jLabelTIEMPO.setText("Tiempo máximo: 3,000 s                             ");
        getContentPane().add(jLabelTIEMPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 510, -1));

        jLabelNOMBRE_EJERCICIO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNOMBRE_EJERCICIO.setText("LA TIENDA DE LA ESQUINA");
        getContentPane().add(jLabelNOMBRE_EJERCICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 40));

        jLabelENCABEZADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde oscuro.jpg"))); // NOI18N
        getContentPane().add(jLabelENCABEZADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jLabelFONDO_IZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde clarito.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO_IZQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 730, 60));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("El abuelo de Quique es el dueño de una tienda en la esquina de mi calle. Este verano ha pedido a su nieto que le ayude encargándose de cobrar.\nQuique está muy preocupado, porque su abuelo tiene muchas manías. Para empezar no tiene caja registradora, sino que realiza las cuentas de\ncabeza. Además para agradar a sus clientes les entrega siempre el menor número posible de monedas para que no se les llene el bolsillo.\n\nComo a Quique no se le da muy bien eso de las cuentas, ha decidido llevarse su ordenador sin que se entere su abuelo. Ahora necesita un \nprograma que le calcule cuántas monedas de cada tipo debe dar de cambio");
        jScrollPanelTEXTO.setViewportView(jTextArea2);

        getContentPane().add(jScrollPanelTEXTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1000, 440));
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENVIARActionPerformed
       
        EntregaLaTiendaDeLaEsquina a= new EntregaLaTiendaDeLaEsquina();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonENVIARActionPerformed

    private void jButtonEJEMPLOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJEMPLOSActionPerformed
        EjemplosLaTiendaDeLaEsquina a= new EjemplosLaTiendaDeLaEsquina();
        a.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonEJEMPLOSActionPerformed

    private void jButtonCREDITOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREDITOSActionPerformed
        CreditosLaTiendaDeLaEsquina a= new CreditosLaTiendaDeLaEsquina();
        a.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonCREDITOSActionPerformed

    private void jButtonPROBLEMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPROBLEMASActionPerformed
        // TODO add your handling code here:
        Problemas a= new Problemas();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPROBLEMASActionPerformed

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
            java.util.logging.Logger.getLogger(EnunciadoLaTiendaDeLaEsquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnunciadoLaTiendaDeLaEsquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnunciadoLaTiendaDeLaEsquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnunciadoLaTiendaDeLaEsquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnunciadoLaTiendaDeLaEsquina().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPanelTEXTO;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
