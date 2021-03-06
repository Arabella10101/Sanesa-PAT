/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DATA.DataValidation;
import DATA.RiderDetails;
import DATA.UseRiderDetails;
import static GUI.NormalMainFrame.ID;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arabella
 */
public class AddRider extends javax.swing.JFrame {

    //object contructors
    DataValidation objDataValid = new DataValidation();
    DATA.UseRiderDetails objURD;
    RiderDetails objRD;

    public AddRider() {
        //default constructor 
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAddRider = new javax.swing.JPanel();
        lblRiderName = new javax.swing.JLabel();
        lblRiderSurname = new javax.swing.JLabel();
        lblSchool = new javax.swing.JLabel();
        lblAccountID = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtRiderName = new javax.swing.JTextField();
        txtRiderSurname = new javax.swing.JTextField();
        txtSchool = new javax.swing.JTextField();
        txtAccountID = new javax.swing.JTextField();
        lblNameErrorMessage = new javax.swing.JLabel();
        lblAccountIDErrorMessage = new javax.swing.JLabel();
        lblSurnameErrorMessage = new javax.swing.JLabel();
        lblSchoolErrorMessage = new javax.swing.JLabel();
        btnAddRider = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRiderName.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblRiderName.setText("Name");

        lblRiderSurname.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblRiderSurname.setText("Surname");

        lblSchool.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblSchool.setText("School");

        lblAccountID.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblAccountID.setText("Account ID");

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setText("Enter Rider's Details");

        txtRiderName.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        txtRiderSurname.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        txtSchool.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        txtAccountID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        lblNameErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblNameErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        lblAccountIDErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblAccountIDErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        lblSurnameErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblSurnameErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        lblSchoolErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblSchoolErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        btnAddRider.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnAddRider.setText("Add Rider");
        btnAddRider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRiderActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddRiderLayout = new javax.swing.GroupLayout(pnlAddRider);
        pnlAddRider.setLayout(pnlAddRiderLayout);
        pnlAddRiderLayout.setHorizontalGroup(
            pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddRiderLayout.createSequentialGroup()
                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddRiderLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblSchoolErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlAddRiderLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddRiderLayout.createSequentialGroup()
                                .addComponent(btnAddRider, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlAddRiderLayout.createSequentialGroup()
                                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAccountID)
                                    .addComponent(lblSchool)
                                    .addComponent(lblRiderSurname)
                                    .addComponent(lblRiderName))
                                .addGap(55, 55, 55)
                                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSurnameErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAccountIDErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNameErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlAddRiderLayout.createSequentialGroup()
                                        .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRiderName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRiderSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTitle))
                                        .addGap(0, 157, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        pnlAddRiderLayout.setVerticalGroup(
            pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddRiderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addGap(41, 41, 41)
                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRiderName)
                    .addComponent(txtRiderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblNameErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRiderSurname)
                    .addComponent(txtRiderSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblSurnameErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchool)
                    .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblSchoolErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountID)
                    .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblAccountIDErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRider, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddRider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAddRider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRiderActionPerformed
        /*
            calls methods to determines if data entered into text fields is valid 
            and then the method either adds data to database or results in an error message
         */

        int totalValidCounter = 0; // counter to keep track of how many field's data is valid   
        objRD = new RiderDetails(); //constructor
        try {
            objURD = new UseRiderDetails(); //constructor
        } catch (SQLException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //gets data from text fields
        String name = txtRiderName.getText();
        String surname = txtRiderSurname.getText();
        String school = txtSchool.getText();
        String accountID = txtAccountID.getText();

        objRD = new RiderDetails(name, surname, school, accountID); //creates new rider object

        if (objDataValid.textValidation(name, "Name", lblNameErrorMessage) > 1) // validates name
        {
            totalValidCounter++; // increases valid counter
            lblNameErrorMessage.setText(""); //sets error message to blank if name is valid
        }

        if (objDataValid.textValidation(surname, "Surname", lblSurnameErrorMessage) > 1) // validates surname
        {
            totalValidCounter++; // increases valid counter
            lblSurnameErrorMessage.setText(""); //sets error message to blank if surname is valid
        }

        if (objDataValid.textValidation(school, "School", lblSchoolErrorMessage) > 1) //validates school
        {
            totalValidCounter++; // increases valid counter
            lblSchoolErrorMessage.setText(""); //sets error message to blank if school is valid
        }
        
        try {
            if (ID.contentEquals(accountID) || objDataValid.checkAdmin(ID) == true ) {
                
                if (objDataValid.numberValidation(accountID, "Account ID", lblAccountIDErrorMessage) > 1) //validates account ID
                {
                    totalValidCounter++; // increases valid counter
                    lblAccountIDErrorMessage.setText(""); //sets error message to blank if account id is valid
                }
                if (objDataValid.testPresence(accountID, "Account ID", lblAccountIDErrorMessage) == true) {
                    try {
                        if (objDataValid.testInAccountDatabase(accountID, "Account ID", lblAccountIDErrorMessage, " must be a valid ID") == true) //validates if account ID exists in the database
                        {
                            totalValidCounter++; // increases valid counter
                            lblAccountIDErrorMessage.setText(""); //sets error message to blank if account id is valid
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else
            {
                JOptionPane.showConfirmDialog(null, "You may not add a rider with this ID", null, JOptionPane.DEFAULT_OPTION); //error message
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (totalValidCounter > 4) // if all fields are logged as valid rider will be added
        {
            try {
                objURD.addRider(objRD); // calls the addRider method
                JOptionPane.showConfirmDialog(null, "Rider added", null, JOptionPane.DEFAULT_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showConfirmDialog(null, "Add rider not successful", null, JOptionPane.DEFAULT_OPTION);
            }
        }
    }//GEN-LAST:event_btnAddRiderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //returns to Normal main frame
        this.dispose();
        try {
            new NormalMainFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    public void store(String id) throws SQLException {
        /* stores the current users ID
        parameters passed - id, current users ID
         */
        ID = id;
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
            java.util.logging.Logger.getLogger(AddRider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRider;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAccountID;
    private javax.swing.JLabel lblAccountIDErrorMessage;
    private javax.swing.JLabel lblNameErrorMessage;
    private javax.swing.JLabel lblRiderName;
    private javax.swing.JLabel lblRiderSurname;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JLabel lblSchoolErrorMessage;
    private javax.swing.JLabel lblSurnameErrorMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlAddRider;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtRiderName;
    private javax.swing.JTextField txtRiderSurname;
    private javax.swing.JTextField txtSchool;
    // End of variables declaration//GEN-END:variables
}
