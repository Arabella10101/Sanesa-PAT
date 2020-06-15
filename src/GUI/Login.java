/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DATA.Actions;
import DATA.DataValidation;
import DATA.UseUserClass;
import DATA.User;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 20baliar
 */
public class Login extends javax.swing.JFrame {

    //object constructors 
    UseUserClass objUUC;
    Actions objAct;
    CardLayout cardLayout;
    DataValidation objDV;

    /**
     * Creates new form Login
     */
    public Login() throws SQLException, ClassNotFoundException {
        objUUC = new UseUserClass();//creates new UseUserClass object
        objAct = new Actions(); // creates new Actions class object
        objDV = new DataValidation(); //creates new DataValidation class object
        initComponents();
        setLocationRelativeTo(this);

        cardLayout = (CardLayout) (pnlCardLayout.getLayout()); //adds panels to cardlayout 
        cardLayout.addLayoutComponent(pnlLogin, "pnlLogin");
        cardLayout.addLayoutComponent(pnlForgotPassword, "pnlForgotPassword");
        cardLayout.addLayoutComponent(pnlNewAccount, "pnlNewUser");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCardLayout = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblLoginScreen = new javax.swing.JLabel();
        lblUsernamepnlLogin = new javax.swing.JLabel();
        txtUsernamepnlLogin = new javax.swing.JTextField();
        lblPasswordpnlLogin = new javax.swing.JLabel();
        lblErrorMessagepnlLogin = new javax.swing.JLabel();
        btnForgotPasswordpnlLogin = new javax.swing.JButton();
        btnLoginpnlLogin = new javax.swing.JButton();
        lblNewAccountpnlLogin = new javax.swing.JLabel();
        pwfPasswordpnlLogin = new javax.swing.JPasswordField();
        pnlForgotPassword = new javax.swing.JPanel();
        lblForgotPassword = new javax.swing.JLabel();
        btnBacktoLogin = new javax.swing.JButton();
        lblUsernamepnlForgotPassword = new javax.swing.JLabel();
        txtUsernamepnlForgotPassword = new javax.swing.JTextField();
        lblNewPasswordpnlForgotPassword = new javax.swing.JLabel();
        pwfNewPasswordpnlForgotPassword = new javax.swing.JPasswordField();
        btnUpdatePasswordpnlForgotPassword = new javax.swing.JButton();
        lblEmailpnlForgotPassword = new javax.swing.JLabel();
        txtEmailpnlForgotPassword = new javax.swing.JTextField();
        lblErrorMessageUsernamepnlForgotPassword = new javax.swing.JLabel();
        lblErrorMessageNewPasswordpnlForgotPassword = new javax.swing.JLabel();
        lblErrorMessageEmailpnlForgotPassword = new javax.swing.JLabel();
        pnlNewAccount = new javax.swing.JPanel();
        lblCreateAccount = new javax.swing.JLabel();
        lblUsernamepnlCreateAccount = new javax.swing.JLabel();
        lblPasswordpnlCreateAccount = new javax.swing.JLabel();
        lblEmailpnlCreateAccount = new javax.swing.JLabel();
        txtUsernamepnlCreateAccount = new javax.swing.JTextField();
        txtEmailpnlCreateAccount = new javax.swing.JTextField();
        btnCreateAccountpnlCreateAccount = new javax.swing.JButton();
        lblErrorMessageUsernamepnlCreateAccount = new javax.swing.JLabel();
        lblErrorMessageEmailpnlCreateAccount = new javax.swing.JLabel();
        lblErrorMessagePasswordpnlCreateAccount = new javax.swing.JLabel();
        pwfPasswordpnlCreateAccount = new javax.swing.JPasswordField();
        btnBacktoLoginpnlCreateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCardLayout.setLayout(new java.awt.CardLayout());

        lblLoginScreen.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblLoginScreen.setText("LOGIN SCREEN");

        lblUsernamepnlLogin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblUsernamepnlLogin.setText("Username");

        txtUsernamepnlLogin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        lblPasswordpnlLogin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblPasswordpnlLogin.setText("Password");

        lblErrorMessagepnlLogin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        btnForgotPasswordpnlLogin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnForgotPasswordpnlLogin.setText("Forgot Password");
        btnForgotPasswordpnlLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPasswordpnlLoginActionPerformed(evt);
            }
        });

        btnLoginpnlLogin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnLoginpnlLogin.setText("Login");
        btnLoginpnlLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginpnlLoginActionPerformed(evt);
            }
        });

        lblNewAccountpnlLogin.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblNewAccountpnlLogin.setText("Dont have an account? Click here to create one");
        lblNewAccountpnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewAccountpnlLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnForgotPasswordpnlLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoginpnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewAccountpnlLogin)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(lblLoginScreen)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasswordpnlLogin)
                            .addComponent(lblUsernamepnlLogin))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrorMessagepnlLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsernamepnlLogin)
                            .addComponent(pwfPasswordpnlLogin))))
                .addGap(205, 205, 205))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLoginScreen)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblUsernamepnlLogin))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtUsernamepnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblPasswordpnlLogin))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblErrorMessagepnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pwfPasswordpnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForgotPasswordpnlLogin)
                    .addComponent(btnLoginpnlLogin))
                .addGap(20, 20, 20)
                .addComponent(lblNewAccountpnlLogin)
                .addGap(100, 100, 100))
        );

        pnlCardLayout.add(pnlLogin, "card2");

        lblForgotPassword.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblForgotPassword.setText("Forgot Password");

        btnBacktoLogin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnBacktoLogin.setText("Back");
        btnBacktoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoLoginActionPerformed(evt);
            }
        });

        lblUsernamepnlForgotPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblUsernamepnlForgotPassword.setText("Username");

        txtUsernamepnlForgotPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        lblNewPasswordpnlForgotPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblNewPasswordpnlForgotPassword.setText("New Password");

        btnUpdatePasswordpnlForgotPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnUpdatePasswordpnlForgotPassword.setText("Update Password");
        btnUpdatePasswordpnlForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasswordpnlForgotPasswordActionPerformed(evt);
            }
        });

        lblEmailpnlForgotPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblEmailpnlForgotPassword.setText("Email");

        javax.swing.GroupLayout pnlForgotPasswordLayout = new javax.swing.GroupLayout(pnlForgotPassword);
        pnlForgotPassword.setLayout(pnlForgotPasswordLayout);
        pnlForgotPasswordLayout.setHorizontalGroup(
            pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlForgotPasswordLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdatePasswordpnlForgotPassword)
                        .addGap(162, 162, 162))
                    .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                        .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(lblForgotPassword))
                            .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNewPasswordpnlForgotPassword)
                                    .addComponent(lblUsernamepnlForgotPassword)
                                    .addComponent(lblEmailpnlForgotPassword))
                                .addGap(67, 67, 67)
                                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwfNewPasswordpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsernamepnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorMessageEmailpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblErrorMessageUsernamepnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorMessageNewPasswordpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlForgotPasswordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBacktoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pnlForgotPasswordLayout.setVerticalGroup(
            pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblForgotPassword)
                .addGap(40, 40, 40)
                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsernamepnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsernamepnlForgotPassword))
                .addGap(10, 10, 10)
                .addComponent(lblErrorMessageUsernamepnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewPasswordpnlForgotPassword)
                    .addComponent(pwfNewPasswordpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblErrorMessageNewPasswordpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailpnlForgotPassword)
                    .addComponent(txtEmailpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblErrorMessageEmailpnlForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnlForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(btnBacktoLogin)
                        .addGap(30, 30, 30))
                    .addGroup(pnlForgotPasswordLayout.createSequentialGroup()
                        .addComponent(btnUpdatePasswordpnlForgotPassword)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlCardLayout.add(pnlForgotPassword, "card3");

        lblCreateAccount.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblCreateAccount.setText("Create Account");

        lblUsernamepnlCreateAccount.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblUsernamepnlCreateAccount.setText("Username");

        lblPasswordpnlCreateAccount.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblPasswordpnlCreateAccount.setText("Password");

        lblEmailpnlCreateAccount.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblEmailpnlCreateAccount.setText("Email");

        btnCreateAccountpnlCreateAccount.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnCreateAccountpnlCreateAccount.setText("Create Account");
        btnCreateAccountpnlCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountpnlCreateAccountActionPerformed(evt);
            }
        });

        btnBacktoLoginpnlCreateAccount.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnBacktoLoginpnlCreateAccount.setText("Back");
        btnBacktoLoginpnlCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoLoginpnlCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewAccountLayout = new javax.swing.GroupLayout(pnlNewAccount);
        pnlNewAccount.setLayout(pnlNewAccountLayout);
        pnlNewAccountLayout.setHorizontalGroup(
            pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewAccountLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(lblCreateAccount)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewAccountLayout.createSequentialGroup()
                .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNewAccountLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreateAccountpnlCreateAccount)
                        .addGap(3, 3, 3))
                    .addGroup(pnlNewAccountLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewAccountLayout.createSequentialGroup()
                                .addComponent(lblEmailpnlCreateAccount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlNewAccountLayout.createSequentialGroup()
                                    .addComponent(lblPasswordpnlCreateAccount)
                                    .addGap(62, 62, 62))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewAccountLayout.createSequentialGroup()
                                    .addComponent(lblUsernamepnlCreateAccount)
                                    .addGap(56, 56, 56))))
                        .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmailpnlCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtUsernamepnlCreateAccount))
                            .addComponent(pwfPasswordpnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(190, 190, 190))
            .addGroup(pnlNewAccountLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorMessagePasswordpnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBacktoLoginpnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrorMessageUsernamepnlCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(lblErrorMessageEmailpnlCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNewAccountLayout.setVerticalGroup(
            pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewAccountLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCreateAccount)
                .addGap(59, 59, 59)
                .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewAccountLayout.createSequentialGroup()
                        .addComponent(lblUsernamepnlCreateAccount)
                        .addGap(49, 49, 49)
                        .addComponent(lblPasswordpnlCreateAccount))
                    .addGroup(pnlNewAccountLayout.createSequentialGroup()
                        .addComponent(txtUsernamepnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorMessageUsernamepnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pwfPasswordpnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(lblErrorMessagePasswordpnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailpnlCreateAccount)
                    .addComponent(txtEmailpnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblErrorMessageEmailpnlCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCreateAccountpnlCreateAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnBacktoLoginpnlCreateAccount)
                .addGap(49, 49, 49))
        );

        pnlCardLayout.add(pnlNewAccount, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCardLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginpnlLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginpnlLoginActionPerformed
        /*
        calls method to determine if username and password are correct, and if true cahnge to NormalMainFrame
         */
        String username = txtUsernamepnlLogin.getText();
        String password = pwfPasswordpnlLogin.getText();

        try {
            if (objAct.login(username, password, lblErrorMessagepnlLogin) == true) { //method to validate
                this.dispose();
                new NormalMainFrame().setVisible(true); //changes frames
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginpnlLoginActionPerformed

    private void btnForgotPasswordpnlLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPasswordpnlLoginActionPerformed
        cardLayout.show(pnlCardLayout, "pnlForgotPassword"); //changes panels
    }//GEN-LAST:event_btnForgotPasswordpnlLoginActionPerformed

    private void btnBacktoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoLoginActionPerformed
        cardLayout.show(pnlCardLayout, "pnlLogin");//changes panels
    }//GEN-LAST:event_btnBacktoLoginActionPerformed

    private void lblNewAccountpnlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewAccountpnlLoginMouseClicked
        cardLayout.show(pnlCardLayout, "pnlNewUser");//changes panels
    }//GEN-LAST:event_lblNewAccountpnlLoginMouseClicked

    private void btnUpdatePasswordpnlForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasswordpnlForgotPasswordActionPerformed
        //updates users password if the data is valid
        String username = txtUsernamepnlForgotPassword.getText();
        String email = txtEmailpnlForgotPassword.getText();
        String password = " ";
        int c1 = 0; //counter to keep track of how many fields are valid 

        if (objDV.testPresence(username, "Username", lblErrorMessageUsernamepnlForgotPassword)) {
            c1++;
            lblErrorMessageUsernamepnlForgotPassword.setText("");
        }
        if (objDV.testPresence(email, "Email", lblErrorMessageEmailpnlForgotPassword)) {
            c1++;
            lblErrorMessageEmailpnlForgotPassword.setText("");
        }
        if (objDV.testPresence(pwfNewPasswordpnlForgotPassword.getText(), "New Password", lblErrorMessageNewPasswordpnlForgotPassword)) {
            lblErrorMessageNewPasswordpnlForgotPassword.setText("");
            password = pwfNewPasswordpnlForgotPassword.getText();
            c1++;
        }

        if (c1 > 2) {
            try {
                objUUC.editUserUpdatePassword(username, password, email);
                JOptionPane.showConfirmDialog(null, "Password updated, Please go back to Login Screen", null, JOptionPane.DEFAULT_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showConfirmDialog(null, "Password update failed", null, JOptionPane.DEFAULT_OPTION); //error message
            }
        }
    }//GEN-LAST:event_btnUpdatePasswordpnlForgotPasswordActionPerformed

    private void btnCreateAccountpnlCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountpnlCreateAccountActionPerformed
        //creates an account if the data is valid
        String username = txtUsernamepnlCreateAccount.getText();
        String password = pwfPasswordpnlCreateAccount.getText();
        String email = txtEmailpnlCreateAccount.getText();
        int c1 = 0; //counter to keep track of how many fields are valid  

        if (objDV.testPresence(username, "username", lblErrorMessageUsernamepnlCreateAccount)) {
            lblErrorMessageUsernamepnlCreateAccount.setText("");
            c1++;
        }
        if (objDV.testPresence(password, "password", lblErrorMessagePasswordpnlCreateAccount)) {
            lblErrorMessagePasswordpnlCreateAccount.setText("");
            c1++;
        }
        if (objDV.testPresence(email, "email", lblErrorMessageEmailpnlCreateAccount)) {
            lblErrorMessageEmailpnlCreateAccount.setText("");
            c1++;
        }
        User objU = new User();
        if (c1 > 2) {
            try {
                objU = new User(username, password, email, false); //creates account
                objUUC.addUser(objU);
                JOptionPane.showConfirmDialog(null, "Account Created, Please go back to Login Screen", null, JOptionPane.DEFAULT_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showConfirmDialog(null, "Creating account failed, Please try again", null, JOptionPane.DEFAULT_OPTION); //error message
            }
        }
    }//GEN-LAST:event_btnCreateAccountpnlCreateAccountActionPerformed

    private void btnBacktoLoginpnlCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoLoginpnlCreateAccountActionPerformed
        cardLayout.show(pnlCardLayout, "pnlLogin"); //changes panels
    }//GEN-LAST:event_btnBacktoLoginpnlCreateAccountActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacktoLogin;
    private javax.swing.JButton btnBacktoLoginpnlCreateAccount;
    private javax.swing.JButton btnCreateAccountpnlCreateAccount;
    private javax.swing.JButton btnForgotPasswordpnlLogin;
    private javax.swing.JButton btnLoginpnlLogin;
    private javax.swing.JButton btnUpdatePasswordpnlForgotPassword;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblEmailpnlCreateAccount;
    private javax.swing.JLabel lblEmailpnlForgotPassword;
    private javax.swing.JLabel lblErrorMessageEmailpnlCreateAccount;
    private javax.swing.JLabel lblErrorMessageEmailpnlForgotPassword;
    private javax.swing.JLabel lblErrorMessageNewPasswordpnlForgotPassword;
    private javax.swing.JLabel lblErrorMessagePasswordpnlCreateAccount;
    private javax.swing.JLabel lblErrorMessageUsernamepnlCreateAccount;
    private javax.swing.JLabel lblErrorMessageUsernamepnlForgotPassword;
    private javax.swing.JLabel lblErrorMessagepnlLogin;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblLoginScreen;
    private javax.swing.JLabel lblNewAccountpnlLogin;
    private javax.swing.JLabel lblNewPasswordpnlForgotPassword;
    private javax.swing.JLabel lblPasswordpnlCreateAccount;
    private javax.swing.JLabel lblPasswordpnlLogin;
    private javax.swing.JLabel lblUsernamepnlCreateAccount;
    private javax.swing.JLabel lblUsernamepnlForgotPassword;
    private javax.swing.JLabel lblUsernamepnlLogin;
    private javax.swing.JPanel pnlCardLayout;
    private javax.swing.JPanel pnlForgotPassword;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlNewAccount;
    private javax.swing.JPasswordField pwfNewPasswordpnlForgotPassword;
    private javax.swing.JPasswordField pwfPasswordpnlCreateAccount;
    private javax.swing.JPasswordField pwfPasswordpnlLogin;
    private javax.swing.JTextField txtEmailpnlCreateAccount;
    private javax.swing.JTextField txtEmailpnlForgotPassword;
    private javax.swing.JTextField txtUsernamepnlCreateAccount;
    private javax.swing.JTextField txtUsernamepnlForgotPassword;
    private javax.swing.JTextField txtUsernamepnlLogin;
    // End of variables declaration//GEN-END:variables
}
