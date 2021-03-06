/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosDeBarras;

import AAAALanzador.Documentacion;
import AAAALanzador.Problemas;

/**
 *
 * @author maxxi
 */
public class EnunciadoCodigodeBarras extends javax.swing.JFrame {

    
    public EnunciadoCodigodeBarras() {
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
        jLabelTIEMPO.setText("Tiempo máximo: 1,000 s                             ");
        getContentPane().add(jLabelTIEMPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 660, -1));

        jLabelNOMBRE_EJERCICIO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNOMBRE_EJERCICIO.setText("CÓDIGOS DE BARRAS");
        getContentPane().add(jLabelNOMBRE_EJERCICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 40));

        jLabelENCABEZADO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde oscuro.jpg"))); // NOI18N
        getContentPane().add(jLabelENCABEZADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jLabelFONDO_IZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde clarito.jpg"))); // NOI18N
        getContentPane().add(jLabelFONDO_IZQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 730, 60));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("En el lejano 1952, tres norteamericanos patentaron lo que terminó llamándose código de barras. Consiste en una técnica para representar números\n(y, en menos ocasiones, letras) mediante una serie de líneas verticales paralelas, con diferentes grosores y separaciones entre ellas. Si bien el\nprimer uso sirvió para identificar de manera automática los vagones de un ferrocarril, hoy los códigos de barras se utilizan en infinidad de lugares, \nsiendo la catalogación de productos la más habitual.\n\nLa manera concreta de codificar mediante barras los números y las letras puede ser muy variada,lo que ha llevado a la aparición de diferentes \nestándares. De todos ellos, el EAN (European Article Number) resulta ser el más extendido. De éste, hay principalmente dos formatos, que se \ndiferencian en el ancho. Existe así el llamado EAN-8, que codifica 8 números, y el EAN-13, que, naturalmente, codifica 13.\n\nEl último dígito del código se utiliza para detección de errores, y se calcula a partir de los demás. Para eso:\n\n-Empezando por la derecha (sin contar el dígito de control que se está calculando), se suman los dígitos individuales, multiplicados por un factor:\n\t*Los dígitos en posiciones impares (empezando a contar por la derecha saltándonos el de control) se multiplican por 3.\n\t*Los dígitos en posiciones pares se multiplican por 1.\n\nPor ejemplo, para el código EAN-8 de la figura la operación a realizar es:  2 · 3 + 5 · 1 + 9 · 3 + 3 · 1 + 8 · 3 + 5 · 1 + 6 · 3 = 88\n\n-El dígito de comprobación es el número que hay que sumar al resultado anterior para llegar a un  valor múltiplo de 10. En el  ejemplo de EAN-8, \npara llegar al múltiplo de 10 más cercano por encima del número 88 hay que sumar 2 (y llegar al 90). Ten encuenta que si la suma resulta ser ya\nmúltiplo de 10, el dígito de control será 0.\n\nEn EAN-13, los primeros dígitos se usan además para identificar al país. A continuación se indica una tabla (parcial) de esos códigos de país.\n\nCódigo:  0            380            50                   539                560                 70                   759                850          890\nPaís:     EEUU     Bulgaria      Inglaterra         Irlanda            Portugal          Noruega           Venezuela     Cuba        India");
        jScrollPanelTEXTO.setViewportView(jTextArea2);

        getContentPane().add(jScrollPanelTEXTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1000, 460));
        getContentPane().add(jLabelFONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENVIARActionPerformed
       
        EntregaCodigodeBarras a= new EntregaCodigodeBarras();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonENVIARActionPerformed

    private void jButtonEJEMPLOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEJEMPLOSActionPerformed
        EjemplosCodigodeBarras a= new EjemplosCodigodeBarras();
        a.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonEJEMPLOSActionPerformed

    private void jButtonCREDITOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREDITOSActionPerformed
        CreditosCodigodeBarras a= new CreditosCodigodeBarras();
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
            java.util.logging.Logger.getLogger(EnunciadoCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnunciadoCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnunciadoCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnunciadoCodigodeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EnunciadoCodigodeBarras().setVisible(true);
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
