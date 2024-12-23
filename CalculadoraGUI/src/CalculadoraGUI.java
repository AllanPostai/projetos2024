
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CalculadoraGUI extends javax.swing.JFrame {

    String op = "";
    double valor1 = 0;
    double valor2 = 0;
    DecimalFormat df = new DecimalFormat("#.####");

    public CalculadoraGUI() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTFvisor = new javax.swing.JTextField();
        jB8 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jBsoma = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        jBvirgula = new javax.swing.JButton();
        jBigual = new javax.swing.JButton();
        jBsubtracao = new javax.swing.JButton();
        jBmultiplicacao = new javax.swing.JButton();
        jBdevisao = new javax.swing.JButton();
        jBraiz = new javax.swing.JButton();
        JBlimpar = new javax.swing.JButton();
        jBapagar1 = new javax.swing.JButton();
        jBFAtorial = new javax.swing.JButton();
        jBEXP2 = new javax.swing.JButton();
        jbExpx = new javax.swing.JButton();
        jBporcento = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        JTFvisor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTFvisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTFvisor.setText("0");
        JTFvisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFvisorActionPerformed(evt);
            }
        });

        jB8.setBackground(new java.awt.Color(0, 0, 0));
        jB8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB8.setForeground(new java.awt.Color(255, 255, 255));
        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB7.setBackground(new java.awt.Color(0, 0, 0));
        jB7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB7.setForeground(new java.awt.Color(255, 255, 255));
        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB9.setBackground(new java.awt.Color(0, 0, 0));
        jB9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB9.setForeground(new java.awt.Color(255, 255, 255));
        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jBsoma.setBackground(new java.awt.Color(0, 0, 0));
        jBsoma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBsoma.setForeground(new java.awt.Color(255, 255, 255));
        jBsoma.setText("+");
        jBsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomaActionPerformed(evt);
            }
        });

        jB5.setBackground(new java.awt.Color(0, 0, 0));
        jB5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB5.setForeground(new java.awt.Color(255, 255, 255));
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB4.setBackground(new java.awt.Color(0, 0, 0));
        jB4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB4.setForeground(new java.awt.Color(255, 255, 255));
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB6.setBackground(new java.awt.Color(0, 0, 0));
        jB6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB6.setForeground(new java.awt.Color(255, 255, 255));
        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB1.setBackground(new java.awt.Color(0, 0, 0));
        jB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB1.setForeground(new java.awt.Color(255, 255, 255));
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setBackground(new java.awt.Color(0, 0, 0));
        jB2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB2.setForeground(new java.awt.Color(255, 255, 255));
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setBackground(new java.awt.Color(0, 0, 0));
        jB3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB3.setForeground(new java.awt.Color(255, 255, 255));
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB0.setBackground(new java.awt.Color(0, 0, 0));
        jB0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB0.setForeground(new java.awt.Color(255, 255, 255));
        jB0.setText("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        jBvirgula.setBackground(new java.awt.Color(0, 0, 0));
        jBvirgula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBvirgula.setForeground(new java.awt.Color(255, 255, 255));
        jBvirgula.setText(",");
        jBvirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvirgulaActionPerformed(evt);
            }
        });

        jBigual.setBackground(new java.awt.Color(0, 0, 0));
        jBigual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBigual.setForeground(new java.awt.Color(255, 255, 255));
        jBigual.setText("=");
        jBigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBigualActionPerformed(evt);
            }
        });

        jBsubtracao.setBackground(new java.awt.Color(0, 0, 0));
        jBsubtracao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBsubtracao.setForeground(new java.awt.Color(255, 255, 255));
        jBsubtracao.setText("-");
        jBsubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsubtracaoActionPerformed(evt);
            }
        });

        jBmultiplicacao.setBackground(new java.awt.Color(0, 0, 0));
        jBmultiplicacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBmultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        jBmultiplicacao.setText("x");
        jBmultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmultiplicacaoActionPerformed(evt);
            }
        });

        jBdevisao.setBackground(new java.awt.Color(0, 0, 0));
        jBdevisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBdevisao.setForeground(new java.awt.Color(255, 255, 255));
        jBdevisao.setText("/");
        jBdevisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdevisaoActionPerformed(evt);
            }
        });

        jBraiz.setBackground(new java.awt.Color(0, 0, 0));
        jBraiz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBraiz.setForeground(new java.awt.Color(255, 255, 255));
        jBraiz.setText("√");
        jBraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBraizActionPerformed(evt);
            }
        });

        JBlimpar.setBackground(new java.awt.Color(0, 0, 0));
        JBlimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JBlimpar.setForeground(new java.awt.Color(255, 255, 255));
        JBlimpar.setText("CE");
        JBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBlimparActionPerformed(evt);
            }
        });

        jBapagar1.setBackground(new java.awt.Color(0, 0, 0));
        jBapagar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBapagar1.setForeground(new java.awt.Color(255, 255, 255));
        jBapagar1.setText("<");
        jBapagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBapagar1ActionPerformed(evt);
            }
        });

        jBFAtorial.setBackground(new java.awt.Color(0, 0, 0));
        jBFAtorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBFAtorial.setForeground(new java.awt.Color(255, 255, 255));
        jBFAtorial.setText("!");
        jBFAtorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFAtorialActionPerformed(evt);
            }
        });

        jBEXP2.setBackground(new java.awt.Color(0, 0, 0));
        jBEXP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBEXP2.setForeground(new java.awt.Color(255, 255, 255));
        jBEXP2.setText("X²");
        jBEXP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEXP2ActionPerformed(evt);
            }
        });

        jbExpx.setBackground(new java.awt.Color(0, 0, 0));
        jbExpx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbExpx.setForeground(new java.awt.Color(255, 255, 255));
        jbExpx.setText("x^y");
        jbExpx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExpxActionPerformed(evt);
            }
        });

        jBporcento.setBackground(new java.awt.Color(0, 0, 0));
        jBporcento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBporcento.setForeground(new java.awt.Color(255, 255, 255));
        jBporcento.setText("%");
        jBporcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBporcentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFvisor)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBvirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBigual, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBporcento, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBdevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBmultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBsoma, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBapagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBsubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBFAtorial, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbExpx, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(jBEXP2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JTFvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBapagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsoma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBporcento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEXP2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExpx, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBFAtorial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBsubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBmultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBigual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBvirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBdevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        if (!JTFvisor.getText().equals("0")) {

            preencherVIsor("0");
        }
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        preencherVIsor("1");
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        preencherVIsor("2");
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        preencherVIsor("3");
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        preencherVIsor("4");
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        preencherVIsor("5");
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        preencherVIsor("6");
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        preencherVIsor("7");
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        preencherVIsor("8");
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        preencherVIsor("9");
    }//GEN-LAST:event_jB9ActionPerformed

    private void jBsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomaActionPerformed
        operacoes();
        op = "+";
    }//GEN-LAST:event_jBsomaActionPerformed

    private void jBsubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsubtracaoActionPerformed
        operacoes();
        op = "-";
    }//GEN-LAST:event_jBsubtracaoActionPerformed

    private void jBmultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultiplicacaoActionPerformed
        operacoes();
        op = "*";
    }//GEN-LAST:event_jBmultiplicacaoActionPerformed

    private void jBdevisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdevisaoActionPerformed
        operacoes();
        op = "/";
    }//GEN-LAST:event_jBdevisaoActionPerformed

    private void jBigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBigualActionPerformed
        valor2 = Double.parseDouble(JTFvisor.getText());
        double resultado = 0;
        switch (op) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
            case "exp":
                resultado = Math.pow(valor1, valor2);
                break;
        }
        JTFvisor.setText(df.format(resultado));


    }//GEN-LAST:event_jBigualActionPerformed

    private void jBvirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvirgulaActionPerformed
        if (!JTFvisor.getText().contains(",")) {
            preencherVIsor(",");
        }
    }//GEN-LAST:event_jBvirgulaActionPerformed

    private void JTFvisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFvisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFvisorActionPerformed

    private void jBraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBraizActionPerformed
        valor2 = Double.parseDouble(JTFvisor.getText());
        double raizQuadrada = Math.sqrt(valor2);
        JTFvisor.setText(df.format(raizQuadrada));
    }//GEN-LAST:event_jBraizActionPerformed

    private void JBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBlimparActionPerformed
        JTFvisor.setText("0");
        op = "";
        valor1 = 0;
        valor2 = 0;
    }//GEN-LAST:event_JBlimparActionPerformed

    private void jBapagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBapagar1ActionPerformed
        String numero = JTFvisor.getText();
        if (numero.length() > 1) {
            JTFvisor.setText(numero.substring(0, numero.length() - 1));
        } else {
            JTFvisor.setText("0");
        }
    }//GEN-LAST:event_jBapagar1ActionPerformed

    private void jBFAtorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFAtorialActionPerformed
        int valor = Integer.parseInt(JTFvisor.getText());
        for (int i = valor - 1; i > 1; i--) {
            valor *= i;
        }
        JTFvisor.setText(df.format(valor));
    }//GEN-LAST:event_jBFAtorialActionPerformed

    private void jBEXP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEXP2ActionPerformed
        int valor = Integer.parseInt(JTFvisor.getText());
        JTFvisor.setText(df.format(Math.pow(valor, 2)));
    }//GEN-LAST:event_jBEXP2ActionPerformed

    private void jbExpxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExpxActionPerformed
        operacoes();
        op = "exp";
    }//GEN-LAST:event_jbExpxActionPerformed

    private void jBporcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBporcentoActionPerformed
         valor2 = Double.parseDouble(JTFvisor.getText());
        double resultado = 0;
        switch (op) {
            case "+":
                resultado = valor1 + (valor2/100*valor1);
                break;
            case "-":
                resultado = valor1 - (valor2/100*valor1);
                break;
            case "*":
                resultado = valor1 * (valor2/100*valor1);
                break;
            case "/":
                resultado = valor1 / (valor2/100*valor1);
                break;
           
        }
        JTFvisor.setText(df.format(resultado));

    }//GEN-LAST:event_jBporcentoActionPerformed

    public void preencherVIsor(String digito) {
        if (JTFvisor.getText().length() < 10) {
            if (JTFvisor.getText().equals("0") && !digito.equals(",")) {
                JTFvisor.setText("");
            }
            JTFvisor.setText(JTFvisor.getText() + digito);

        }
    }

    public void operacoes() {
        valor1 = Double.parseDouble(JTFvisor.getText());
        JTFvisor.setText("0");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CalculadoraGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(CalculadoraGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CalculadoraGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CalculadoraGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBlimpar;
    private javax.swing.JTextField JTFvisor;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBEXP2;
    private javax.swing.JButton jBFAtorial;
    private javax.swing.JButton jBapagar1;
    private javax.swing.JButton jBdevisao;
    private javax.swing.JButton jBigual;
    private javax.swing.JButton jBmultiplicacao;
    private javax.swing.JButton jBporcento;
    private javax.swing.JButton jBraiz;
    private javax.swing.JButton jBsoma;
    private javax.swing.JButton jBsubtracao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jBvirgula;
    private javax.swing.JButton jbExpx;
    // End of variables declaration//GEN-END:variables
}
