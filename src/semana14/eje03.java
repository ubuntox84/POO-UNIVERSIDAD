/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class eje03 extends javax.swing.JFrame {

    /**
     * Creates new form eje03
     */
    int vectInicial[];
    HashSet<Integer> vectFinal;
    int n;

    public eje03() {
        initComponents();
        vectFinal = new HashSet<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtainicial = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtafinal = new javax.swing.JTextArea();
        lbinicial = new javax.swing.JLabel();
        lbfinal = new javax.swing.JLabel();
        btngenerar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtimpresion = new javax.swing.JTextField();
        lbnroelementos = new javax.swing.JLabel();
        txtnroelementos = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtainicial.setColumns(20);
        txtainicial.setRows(5);
        jScrollPane1.setViewportView(txtainicial);

        txtafinal.setColumns(20);
        txtafinal.setRows(5);
        jScrollPane2.setViewportView(txtafinal);

        lbinicial.setText("Vector Inicial");

        lbfinal.setText("Vector Final");

        btngenerar.setText("Generar");
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        btnmostrar.setText("Mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Impresion final ");

        lbnroelementos.setText("N° Elementos: ");

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lbnroelementos)
                        .addGap(18, 18, 18)
                        .addComponent(txtnroelementos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btngenerar)
                        .addGap(140, 140, 140)
                        .addComponent(btnmostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbinicial)
                        .addGap(156, 156, 156)
                        .addComponent(lbfinal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(txtimpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnuevo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbnroelementos)
                    .addComponent(txtnroelementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngenerar)
                    .addComponent(btnmostrar))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbinicial)
                    .addComponent(lbfinal))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtimpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        // TODO add your handling code here:
        try {
            n = Integer.parseInt(txtnroelementos.getText());
            vectInicial = new int[n];
            generarVector(vectInicial);
            String cadinicio = mostrarVector(vectInicial);
            txtainicial.setText(cadinicio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Tamaño del vector no ingresado!!!");
            txtnroelementos.requestFocus();
        }


    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        try {
            norepetidos();
            String cad = mostrarFinal();
            txtafinal.setText(cad);
            txtimpresion.setText(String.valueOf(vectFinal.size()));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tamaño del vector no ingresado!!!");
            txtnroelementos.requestFocus();
        }

    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        txtnroelementos.setText("");
        txtnroelementos.requestFocus();
        txtainicial.setText("");
        txtafinal.setText("");
        txtimpresion.setText("");
        vectFinal = new HashSet<>();
        vectInicial = new int[0];
    }//GEN-LAST:event_btnnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(eje03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eje03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eje03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eje03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eje03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbfinal;
    private javax.swing.JLabel lbinicial;
    private javax.swing.JLabel lbnroelementos;
    private javax.swing.JTextArea txtafinal;
    private javax.swing.JTextArea txtainicial;
    private javax.swing.JTextField txtimpresion;
    private javax.swing.JTextField txtnroelementos;
    // End of variables declaration//GEN-END:variables

    private void generarVector(int[] v) {
        Random rd = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(10);
        }
    }

    private String mostrarVector(int[] v) {
        String cad = "";
        for (Integer i : v) {
            cad += String.valueOf(i) + "\n";
        }
        return cad;
    }

    private void norepetidos() {
        for (Integer i : vectInicial) {
            vectFinal.add(i);
        }
    }

    private String mostrarFinal() {
        String cad = "";
        for (Integer x : vectFinal) {
            cad += String.valueOf(x) + "\n";
        }
        return cad;
    }
}
