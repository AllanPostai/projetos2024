/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acaocomunutaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Tech Consertos
 */
public class AcaoComunitaria extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame
     */
    public AcaoComunitaria() {
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

        jcbcadastro = new javax.swing.JLabel();
        jcb3dias = new javax.swing.JLabel();
        jcbsegunda = new javax.swing.JCheckBox();
        jcbterca = new javax.swing.JCheckBox();
        jcbquarta = new javax.swing.JCheckBox();
        jcbquinta = new javax.swing.JCheckBox();
        jcbsexta = new javax.swing.JCheckBox();
        jcbenviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro comunitário ");

        jcbcadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbcadastro.setText("Cadastro para ação comunitária");

        jcb3dias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcb3dias.setText("3 dias da semana:");

        jcbsegunda.setText("Segunda-feira");

        jcbterca.setText("Terça-feira");
        jcbterca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbtercaActionPerformed(evt);
            }
        });

        jcbquarta.setText("Quarta-feira");
        jcbquarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbquartaActionPerformed(evt);
            }
        });

        jcbquinta.setText("Qunta-feira");
        jcbquinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbquintaActionPerformed(evt);
            }
        });

        jcbsexta.setText("sexta-feira");
        jcbsexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbsextaActionPerformed(evt);
            }
        });

        jcbenviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbenviar.setText("ENVIAR");
        jcbenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbenviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbquinta)
                            .addComponent(jcbquarta)
                            .addComponent(jcbterca)
                            .addComponent(jcbsegunda)
                            .addComponent(jcbcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(126, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbsexta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcb3dias, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jcbcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jcb3dias, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbsegunda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbterca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbquarta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbquinta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbsexta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jcbenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbtercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbtercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbtercaActionPerformed

    private void jcbquartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbquartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbquartaActionPerformed

    private void jcbquintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbquintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbquintaActionPerformed

    private void jcbsextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbsextaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbsextaActionPerformed

    private void jcbenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbenviarActionPerformed
        int quantidadeDias = 0;
        String diasMarcados = "";
        if (jcbsegunda.isSelected()) {
            quantidadeDias++;
            diasMarcados += "Segunda-feira\n";
        }
        if (jcbterca.isSelected()) {
            quantidadeDias++;
            diasMarcados += "Terça-feira\n";
        }
        if (jcbquarta.isSelected()) {
            quantidadeDias++;
            diasMarcados += "Quarta-feira\n";
        }
        if (jcbquinta.isSelected()) {
            quantidadeDias++;
            diasMarcados += "Quinta-feira\n";
        }
        if (jcbsexta.isSelected()) {
            quantidadeDias++;
            diasMarcados += "Sexta-feira\n";

        }
        if (quantidadeDias < 3) {
            JOptionPane.showMessageDialog(null, "Você escolheu poucos dias."
                    + "Deves escolher exatamente 3 dias!");
            return;
        }
        if (quantidadeDias > 3) {
            JOptionPane.showMessageDialog(null, "Você escolheu dias demais."
                    + "Você deve escolher exatamente 3 dias!");
            return;

        }
        JOptionPane.showMessageDialog(null, "Você escolheu " + quantidadeDias + " dias\n" + diasMarcados);
    }//GEN-LAST:event_jcbenviarActionPerformed

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
            java.util.logging.Logger.getLogger(AcaoComunitaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcaoComunitaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcaoComunitaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcaoComunitaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcaoComunitaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jcb3dias;
    private javax.swing.JLabel jcbcadastro;
    private javax.swing.JButton jcbenviar;
    private javax.swing.JCheckBox jcbquarta;
    private javax.swing.JCheckBox jcbquinta;
    private javax.swing.JCheckBox jcbsegunda;
    private javax.swing.JCheckBox jcbsexta;
    private javax.swing.JCheckBox jcbterca;
    // End of variables declaration//GEN-END:variables
}
