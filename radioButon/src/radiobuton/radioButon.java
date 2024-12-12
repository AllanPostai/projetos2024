/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobuton;

import javax.swing.JOptionPane;

/**
 *
 * @author Tech Consertos
 */
public class radioButon extends javax.swing.JFrame {

    /**
     * Creates new form radioButon
     */
    public radioButon() {
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

        bgSistemas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jrbWindows = new javax.swing.JRadioButton();
        jrbIOS = new javax.swing.JRadioButton();
        jrbLinux = new javax.swing.JRadioButton();
        jrbAndroid = new javax.swing.JRadioButton();
        jbConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Escolha seu sistêma operacional preferido!");

        bgSistemas.add(jrbWindows);
        jrbWindows.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbWindows.setText("Windows");

        bgSistemas.add(jrbIOS);
        jrbIOS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbIOS.setText("IOS");

        bgSistemas.add(jrbLinux);
        jrbLinux.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbLinux.setText("Linux");

        bgSistemas.add(jrbAndroid);
        jrbAndroid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbAndroid.setText("Android");

        jbConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbConfirmar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jrbIOS)
                                .addComponent(jrbWindows)
                                .addComponent(jrbLinux)
                                .addComponent(jrbAndroid)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbIOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbAndroid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jbConfirmar)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
JOptionPane.showMessageDialog(null, "so escolhido: "+ getOpcaoSelecionada());
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private String getOpcaoSelecionada(){
        if(jrbWindows.isSelected()){
            return "Windows";
        }
         if(jrbIOS.isSelected()){
            return "IOS";
        }
          if(jrbLinux.isSelected()){
            return "Linux";
        }
           if(jrbAndroid.isSelected()){
            return "Android";
        }
           return "";
    }
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
            java.util.logging.Logger.getLogger(radioButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(radioButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(radioButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(radioButon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new radioButon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSistemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JRadioButton jrbAndroid;
    private javax.swing.JRadioButton jrbIOS;
    private javax.swing.JRadioButton jrbLinux;
    private javax.swing.JRadioButton jrbWindows;
    // End of variables declaration//GEN-END:variables
}