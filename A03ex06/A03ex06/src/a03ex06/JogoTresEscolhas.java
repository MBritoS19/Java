/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a03ex06;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mb.sampaio
 */
public class JogoTresEscolhas extends javax.swing.JFrame {
    private int Erros = 0;
    private int Acertos = 0;
    private int Resposta = 0;
    private int RespostaErrada = 0;
    private int Num1 = 0;
    private int Num2 = 0;
    private int AleCorreto = 0;
    private int Alternativa1 = 0;
    private int Alternativa2 = 0;
    private int Alternativa3 = 0;
    
    public JogoTresEscolhas() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAcertos = new javax.swing.JLabel();
        lblErros = new javax.swing.JLabel();
        btnResposta1 = new javax.swing.JButton();
        btnResposta3 = new javax.swing.JButton();
        btnResposta2 = new javax.swing.JButton();
        lblNum1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Acertos: ");

        jLabel2.setText("Erros: ");

        lblAcertos.setForeground(new java.awt.Color(102, 204, 0));
        lblAcertos.setText("000");

        lblErros.setForeground(new java.awt.Color(255, 51, 0));
        lblErros.setText("000");

        btnResposta1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnResposta1.setText("0");
        btnResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResposta1ActionPerformed(evt);
            }
        });

        btnResposta3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnResposta3.setText("0");
        btnResposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResposta3ActionPerformed(evt);
            }
        });

        btnResposta2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnResposta2.setText("0");
        btnResposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResposta2ActionPerformed(evt);
            }
        });

        lblNum1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblNum1.setText("0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("+");

        lblNum2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblNum2.setText("0");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jLabel8.setText("Status:");

        lblStatus.setText("Digite o botão Novo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResposta2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnResposta3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNum1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNum2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAcertos)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblErros)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum1)
                    .addComponent(jLabel6)
                    .addComponent(lblNum2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResposta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResposta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResposta3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblStatus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResposta2ActionPerformed
        Alternativa2 = Integer.parseInt(btnResposta2.getText());
        
        if(Alternativa2 == Resposta)
        {
            Acertos++;
            lblAcertos.setText("" + Acertos);
        }
        else
        {
            Erros++;
            lblErros.setText("" + Erros);
        }
        
        inicio();
    }//GEN-LAST:event_btnResposta2ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        lblAcertos.setText("000");
        lblErros.setText("000");
        lblNum1.setText("0");
        lblNum2.setText("0");
        btnResposta1.setText("0");
        btnResposta2.setText("0");
        btnResposta3.setText("0");
        lblStatus.setText("Digite o botão Novo");

        Erros = 0;
        Acertos = 0;
        Resposta = 0;
        Num1 = 0;
        Num2 = 0;

        inicio();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResposta1ActionPerformed
        Alternativa1 = Integer.parseInt(btnResposta1.getText());
        
        if(Alternativa1 == Resposta)
        {
            Acertos++;
            lblAcertos.setText("" + Acertos);
        }
        else
        {
            Erros++;
            lblErros.setText("" + Erros);
        }
        
        inicio();
    }//GEN-LAST:event_btnResposta1ActionPerformed

    private void btnResposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResposta3ActionPerformed
        Alternativa3 = Integer.parseInt(btnResposta3.getText());
        
        if(Alternativa3 == Resposta)
        {
            Acertos++;
            lblAcertos.setText("" + Acertos);
        }
        else
        {
            Erros++;
            lblErros.setText("" + Erros);
        }
        
        inicio();
    }//GEN-LAST:event_btnResposta3ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoTresEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoTresEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoTresEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoTresEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoTresEscolhas().setVisible(true);
            }
        });
    }
    
    private void inicio()
    {
        lblNum1.setText("" + (int) ((Math.random() * 10) + (Math.random() * 10) + (Math.random() * 10) + (Math.random() * 10)));
        lblNum2.setText("" + (int) ((Math.random() * 10) + (Math.random() * 10) + (Math.random() * 10) + (Math.random() * 10)));
        
        AleCorreto = (int) ((Math.random() * 3) + 1);

        Num1 = Integer.parseInt(lblNum1.getText());
        Num2 = Integer.parseInt(lblNum2.getText());
        
        Resposta = Num1 + Num2;
        
        if(AleCorreto == 1)
        {
            btnResposta1.setText("" + Resposta);
        }
        else
        {
            RespostaErrada = Resposta + (int) (Math.random() * 10);
            btnResposta1.setText("" + RespostaErrada);
        }
        
        if(AleCorreto == 2)
        {
            btnResposta2.setText("" + Resposta);
        }
        else
        {
            RespostaErrada = Resposta + (int) (Math.random() * 10);
            btnResposta2.setText("" + RespostaErrada);
        }
                
        if(AleCorreto == 3)
        {
            btnResposta3.setText("" + Resposta);
        }
        else
        {
            RespostaErrada = Resposta + (int) (Math.random() * 10);
            btnResposta3.setText("" + RespostaErrada);
        }
        lblStatus.setText("Selecione a Resposta");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnResposta1;
    private javax.swing.JButton btnResposta2;
    private javax.swing.JButton btnResposta3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAcertos;
    private javax.swing.JLabel lblErros;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
