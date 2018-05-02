/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaztfg;

/**
 *
 * @author maxxi
 */
public class EntregaCodigodeBarras extends javax.swing.JFrame {

    /**
     * Creates new form Prueba
     */
    public EntregaCodigodeBarras() {
        initComponents();
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

        jButtonESTADISTICA = new javax.swing.JButton();
        jButtonDOCUMENTACION = new javax.swing.JButton();
        jButtonPROBLEMAS = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButtonESTADISTICAS = new javax.swing.JButton();
        jButtonENUNCIADO = new javax.swing.JButton();
        jButtonEJEMPLOS = new javax.swing.JButton();
        jButtonCREDITOS = new javax.swing.JButton();
        jButtonENVIAR = new javax.swing.JButton();
        jLabelTIEMPO = new javax.swing.JLabel();
        jLabelNOMBRE_EJERCICIO = new javax.swing.JLabel();
        jLabelENCABEZADO = new javax.swing.JLabel();
        jLabelFONDO_IZQ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPanelTEXTO = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButtonREALIZARENVIO = new javax.swing.JButton();
        jLabelFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonESTADISTICA.setBackground(new java.awt.Color(204, 204, 204));
        jButtonESTADISTICA.setForeground(new java.awt.Color(0, 153, 153));
        jButtonESTADISTICA.setText("Estadisticas");
        jButtonESTADISTICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonESTADISTICAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonESTADISTICA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButtonDOCUMENTACION.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDOCUMENTACION.setForeground(new java.awt.Color(0, 153, 153));
        jButtonDOCUMENTACION.setText("Documentación");
        getContentPane().add(jButtonDOCUMENTACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jButtonPROBLEMAS.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPROBLEMAS.setForeground(new java.awt.Color(0, 153, 153));
        jButtonPROBLEMAS.setText("Problemas");
        getContentPane().add(jButtonPROBLEMAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField1.setText("Buscar");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 170, -1));

        jButtonESTADISTICAS.setText("Estadísticas");
        getContentPane().add(jButtonESTADISTICAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        jButtonENUNCIADO.setText("Enunciado");
        getContentPane().add(jButtonENUNCIADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, -1));

        jButtonEJEMPLOS.setText("Ejemplos");
        getContentPane().add(jButtonEJEMPLOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        jButtonCREDITOS.setText("Créditos");
        getContentPane().add(jButtonCREDITOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, -1));

        jButtonENVIAR.setText("Enviar");
        getContentPane().add(jButtonENVIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, -1));

        jLabelTIEMPO.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTIEMPO.setText("Tiempo máximo: 1,000 s                             Memoria máxima: 4096 KiB");
        getContentPane().add(jLabelTIEMPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 660, -1));

        jLabelNOMBRE_EJERCICIO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNOMBRE_EJERCICIO.setText("CÓDIGOS DE BARRAS");
        getContentPane().add(jLabelNOMBRE_EJERCICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 350, 40));

        jLabelENCABEZADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde oscuro.jpg"))); // NOI18N
        getContentPane().add(jLabelENCABEZADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jLabelFONDO_IZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde clarito.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO_IZQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ESCRIBA O COPIE SU CÓDIGO EN EL SIGUIENTE CUADRO DE TEXTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPanelTEXTO.setViewportView(jTextArea2);

        getContentPane().add(jScrollPanelTEXTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 800, 680));

        jButtonREALIZARENVIO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonREALIZARENVIO.setText("REALIZAR ENVÍO");
        getContentPane().add(jButtonREALIZARENVIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 890, 190, 70));
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonESTADISTICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonESTADISTICAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonESTADISTICAActionPerformed

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
            java.util.logging.Logger.getLogger(EntregaCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregaCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregaCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregaCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new EntregaCodigodeBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCREDITOS;
    private javax.swing.JButton jButtonDOCUMENTACION;
    private javax.swing.JButton jButtonEJEMPLOS;
    private javax.swing.JButton jButtonENUNCIADO;
    private javax.swing.JButton jButtonENVIAR;
    private javax.swing.JButton jButtonESTADISTICA;
    private javax.swing.JButton jButtonESTADISTICAS;
    private javax.swing.JButton jButtonPROBLEMAS;
    private javax.swing.JButton jButtonREALIZARENVIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelENCABEZADO;
    private javax.swing.JLabel jLabelFONDO;
    private javax.swing.JLabel jLabelFONDO_IZQ;
    private javax.swing.JLabel jLabelNOMBRE_EJERCICIO;
    private javax.swing.JLabel jLabelTIEMPO;
    private javax.swing.JScrollPane jScrollPanelTEXTO;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
