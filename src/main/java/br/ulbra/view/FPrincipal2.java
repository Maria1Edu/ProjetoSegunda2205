/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ulbra.view;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberlei
 */
public class FPrincipal2 extends javax.swing.JFrame {

    /**
     * Creates new form FPrincipal2
     */
    public FPrincipal2() {
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

        lbTítulo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lbPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btVerificar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbRNome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JLabel();
        lbRIMC = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbClas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTítulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lbTítulo.setForeground(new java.awt.Color(255, 102, 204));
        lbTítulo.setText("NUTRIÇÃO");

        lbNome.setForeground(new java.awt.Color(153, 0, 153));
        lbNome.setText("NOME");

        lbAltura.setForeground(new java.awt.Color(153, 0, 153));
        lbAltura.setText("ALTURA");

        lbPeso.setForeground(new java.awt.Color(153, 0, 153));
        lbPeso.setText("PESO");

        btVerificar.setBackground(new java.awt.Color(255, 153, 255));
        btVerificar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btVerificar.setText("VERIFICAR");
        btVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 0, 0));
        btLimpar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 51, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("RESULTADO");

        lbRNome.setText("??");

        jPanel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 0, 255));
        jPanel2.setText("IMC:");

        lbRIMC.setText("???");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("CLASSIFICAÇÃO:");

        lbClas.setText("????");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbRNome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbClas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbRNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbClas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNome)
                    .addComponent(lbAltura)
                    .addComponent(lbPeso)
                    .addComponent(txtNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVerificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(lbTítulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbAltura)
                        .addGap(12, 12, 12)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbPeso)
                        .addGap(23, 23, 23)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVerificar)
                            .addComponent(btLimpar)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNome.setText(null);
        txtAltura.setText(null);
        txtPeso.setText(null);
        lbRNome.setText("??");
        lbRIMC.setText("???");
        lbClas.setText("????");
        JOptionPane.showMessageDialog(null,"Campos limpos com sucesso!");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarActionPerformed
        String nome;
        double altura, peso, imc;
        DecimalFormat f = new DecimalFormat("0.0");
        nome=txtNome.getText();
        altura=Double.parseDouble(txtAltura.getText());
        peso=Double.parseDouble(txtPeso.getText());
        imc=peso/Math.pow(altura,2);
        lbRNome.setText(nome);
        lbRIMC.setText(String.valueOf(f.format (imc)));
        if(imc<18){
            lbClas.setText("MAGRO :)");
            jPanel1.setBackground(Color.GREEN);
        }else if (imc>=18&&imc<=25){
            lbClas.setText("NORMAL :/");
            jPanel1.setBackground(Color.ORANGE);
        }else{
            lbClas.setText("GORDO ;)");
            jPanel1.setBackground(Color.RED);
        }
    }//GEN-LAST:event_btVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(FPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPanel2;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbClas;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbRIMC;
    private javax.swing.JLabel lbRNome;
    private javax.swing.JLabel lbTítulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
