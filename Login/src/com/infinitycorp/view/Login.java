/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinitycorp.view;

import com.infinitycorp.controller.LoginController;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author perge
 */
public class Login extends javax.swing.JFrame {
    
    private final LoginController controller;    
 
    public Login(){
        initComponents();
        this.setTitle("Tela de Login");
        controller = new LoginController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lblTitutoLogin = new javax.swing.JLabel();
        lblSubtitutoLogin = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        String imagePath2 = "src/com/infinitycorp/view/icon/Forms.png";
        ImageIcon icon2 = new ImageIcon(imagePath2);

        // Verifica se a imagem foi carregada corretamente
        if (icon2.getIconWidth() == -1) {
            System.out.println("Imagem não encontrada: " + imagePath2);
        } else {
            System.out.println("Imagem encontrada: " + imagePath2);
            jLabel1 = new javax.swing.JLabel(icon2);
            btnLogin = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            lblInfoText = new javax.swing.JLabel();
            String imagePath = "src/com/infinitycorp/view/icon/User.png";
            ImageIcon icon = new ImageIcon(imagePath);

            // Verifica se a imagem foi carregada corretamente
            if (icon.getIconWidth() == -1) {
                System.out.println("Imagem não encontrada: " + imagePath);
            } else {
                System.out.println("Imagem encontrada: " + imagePath);
                profileLogin = new javax.swing.JLabel(icon);

                jLabel6.setText("Insirar aqui uma Imagem");
                jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(142, 39, 217));

                lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                lblUsuario.setForeground(new java.awt.Color(16, 18, 15));
                lblUsuario.setText("Usuário:");

                lblSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                lblSenha.setForeground(new java.awt.Color(16, 18, 15));
                lblSenha.setText("Senha:");
                lblSenha.setToolTipText("");

                txtClient.setBackground(new java.awt.Color(74, 80, 67));
                txtClient.setForeground(new java.awt.Color(255, 255, 255));
                txtClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                txtClient.setMargin(new java.awt.Insets(2, 10, 2, 2));
                txtClient.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txtClientActionPerformed(evt);
                    }
                });

                txtPassword.setBackground(new java.awt.Color(74, 80, 67));
                txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jPanel2.setBackground(new java.awt.Color(59, 16, 89));
                jPanel2.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(190,39,217)));

                lblTitutoLogin.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
                lblTitutoLogin.setForeground(new java.awt.Color(255, 255, 255));
                lblTitutoLogin.setText("Listador Online");

                lblSubtitutoLogin.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
                lblSubtitutoLogin.setForeground(new java.awt.Color(255, 255, 255));
                lblSubtitutoLogin.setText("Organize seus IG's para sorteios");

                lblCadastro.setFont(new java.awt.Font("Monospaced", 3, 12)); // NOI18N
                lblCadastro.setForeground(new java.awt.Color(53, 167, 255));
                lblCadastro.setText("Não tem um cadastro ainda? Clique aqui");
                lblCadastro.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(106,127,219)));
                lblCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                lblCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        lblCadastroMouseClicked(evt);
                    }
                });

            }
            jLabel1.setText("");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(90, 90, 90))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblCadastro)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblTitutoLogin)
                                    .addGap(73, 73, 73))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblSubtitutoLogin)
                                    .addGap(21, 21, 21))))))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(lblTitutoLogin)
                    .addGap(58, 58, 58)
                    .addComponent(jLabel1)
                    .addGap(30, 30, 30)
                    .addComponent(lblSubtitutoLogin)
                    .addGap(33, 33, 33)
                    .addComponent(lblCadastro)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            btnLogin.setBackground(new java.awt.Color(223, 36, 40));
            btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
            btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnLoginMouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    btnLoginMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    btnLoginMouseExited(evt);
                }
            });

            jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("ENTRAR");
            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel2MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel2MouseEntered(evt);
                }
            });

            javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
            btnLogin.setLayout(btnLoginLayout);
            btnLoginLayout.setHorizontalGroup(
                btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(14, 14, 14))
            );
            btnLoginLayout.setVerticalGroup(
                btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLoginLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel2)
                    .addGap(5, 5, 5))
            );

            lblInfoText.setForeground(new java.awt.Color(255, 255, 255));
            lblInfoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblInfoText.setText("Seja Bem-vindo!");
            lblInfoText.setToolTipText("");
            lblInfoText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            lblInfoText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        }
        profileLogin.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblSenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profileLogin)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblUsuario)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(profileLogin)
                .addGap(44, 44, 44)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfoText)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.btnLoginMouseClicked(evt);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

        this.controller.checkIfFieldsIsEmpty();
        
    }//GEN-LAST:event_btnLoginMouseClicked

    private void lblCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroMouseClicked
        // TODO add your handling code here:
        Register telaRegister = new Register();
        telaRegister.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCadastroMouseClicked

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(new java.awt.Color(209,33,36));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(new java.awt.Color(223,36,40));
    }//GEN-LAST:event_btnLoginMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(new java.awt.Color(209,33,36));
    }//GEN-LAST:event_jLabel2MouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblInfoText;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSubtitutoLogin;
    private javax.swing.JLabel lblTitutoLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel profileLogin;
    private javax.swing.JTextField txtClient;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    public void showMessagePane(String mensagem, Color cor) {
        lblInfoText.setForeground(cor);
        lblInfoText.setText(mensagem);
    }

    public JTextField getTxtClient() {
        return txtClient;
    }

    public void setTxtClient(JTextField txtClient) {
        this.txtClient = txtClient;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }
    
    
}
