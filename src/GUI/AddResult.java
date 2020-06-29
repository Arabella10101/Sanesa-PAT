/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DATA.DataValidation;
import DATA.UseOtherClasses;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arabella
 */
public class AddResult extends javax.swing.JFrame {

    //object contructors
    DataValidation objDataValid = new DataValidation();
    UseOtherClasses objUOC;

    /**
     * Creates new form AddHorseRider
     */
    public AddResult() {
        //default constructor 
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAddResult = new javax.swing.JPanel();
        lblHRID = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblPlacing = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtHRID = new javax.swing.JTextField();
        txtScore = new javax.swing.JTextField();
        txtPlacing = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        lblHRIDErrorMessage = new javax.swing.JLabel();
        lblQualifierErrorMessage = new javax.swing.JLabel();
        lblScoreErrorMessage = new javax.swing.JLabel();
        lblPlacingErrorMessage = new javax.swing.JLabel();
        btnAddResult = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblQualifier = new javax.swing.JLabel();
        txtQualifier = new javax.swing.JTextField();
        lblStatusErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHRID.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblHRID.setText("HRID");

        lblScore.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblScore.setText("Score");

        lblPlacing.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblPlacing.setText("Placing");

        lblStatus.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblStatus.setText("Status");

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setText("Enter Result");

        txtHRID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        txtScore.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        txtPlacing.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        lblHRIDErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblHRIDErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        lblQualifierErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblQualifierErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        lblScoreErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblScoreErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        lblPlacingErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblPlacingErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        btnAddResult.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnAddResult.setText("Add ");
        btnAddResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddResultActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblQualifier.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblQualifier.setText("Qualifier");

        lblStatusErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblStatusErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlAddResultLayout = new javax.swing.GroupLayout(pnlAddResult);
        pnlAddResult.setLayout(pnlAddResultLayout);
        pnlAddResultLayout.setHorizontalGroup(
            pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddResultLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddResultLayout.createSequentialGroup()
                        .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddResultLayout.createSequentialGroup()
                                .addComponent(lblQualifier)
                                .addGap(43, 43, 43)
                                .addComponent(txtQualifier, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddResultLayout.createSequentialGroup()
                                .addComponent(btnAddResult, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTitle))
                        .addGap(0, 273, Short.MAX_VALUE))
                    .addGroup(pnlAddResultLayout.createSequentialGroup()
                        .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatus)
                            .addComponent(lblPlacing)
                            .addComponent(lblScore)
                            .addComponent(lblHRID))
                        .addGap(55, 55, 55)
                        .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScoreErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQualifierErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHRIDErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlAddResultLayout.createSequentialGroup()
                                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHRID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlacing, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblPlacingErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatusErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlAddResultLayout.setVerticalGroup(
            pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddResultLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(38, 38, 38)
                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHRID)
                    .addComponent(txtHRID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblHRIDErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScore)
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblScoreErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlacing)
                    .addComponent(txtPlacing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(lblPlacingErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddResultLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblQualifier))
                    .addGroup(pnlAddResultLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblStatusErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtQualifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(lblQualifierErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlAddResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddResult, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAddResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAddResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddResultActionPerformed
        /*
            calls methods to determines if data entered into text fields is valid 
            and then the method either adds data to database or results in an error message
         */

        int totalValidCounter = 0; // counter to keep track of how many field's data is valid   
        try {
            objUOC = new UseOtherClasses(); //constructor
        } catch (SQLException ex) {
            Logger.getLogger(AddResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddResult.class.getName()).log(Level.SEVERE, null, ex);
        }

        //gets data from text fields
        String HRID = txtHRID.getText();
        String sc = txtScore.getText();
        String pl = txtPlacing.getText();
        String st = txtStatus.getText();
        String q = txtQualifier.getText();

        if (objDataValid.numberValidation(HRID, "HRID", lblHRIDErrorMessage) > 1) // validates HRID
        {
            try {
                if (objDataValid.testInHorseRiderDatabase(HRID, "HRID", lblHRIDErrorMessage, " must be a valid ID")) {
                    totalValidCounter++; // increases valid counter
                    lblHRIDErrorMessage.setText(""); //sets error message to blank if HRID is valid
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddResult.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddResult.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (objDataValid.numberValidation(sc, "Score", lblScoreErrorMessage) > 1) // validates Score
        {
            totalValidCounter++; // increases valid counter
            lblScoreErrorMessage.setText(""); //sets error message to blank if score is valid
        }

        if (objDataValid.numberValidation(pl, "Placing", lblPlacingErrorMessage) > 1) //validates placing
        {
            totalValidCounter++; // increases valid counter
            lblPlacingErrorMessage.setText(""); //sets error message to blank if placing is valid
        }
        if (st.equalsIgnoreCase("c") || st.equalsIgnoreCase("e") || st.equalsIgnoreCase("s")) { //validates status
            totalValidCounter++; // increases valid counter
            lblStatusErrorMessage.setText(""); //sets error message to blank if status is valid
        } else {
            lblStatusErrorMessage.setText("Must be 'c' for completed, 'e' for eliminated or 's' for scratched");
        }
        if (objDataValid.testPresence(q, "Qualifier", lblQualifierErrorMessage)) {
            totalValidCounter++; // increases valid counter
            lblQualifierErrorMessage.setText(""); //sets error message to blank if qualifier is valid
        }

        if (totalValidCounter > 4) // if all fields are logged as valid result will be added
        {
            try {
                objUOC.addResult(HRID, sc, pl, st, q); // calls the addResult method
                JOptionPane.showConfirmDialog(null, "Result added", null, JOptionPane.DEFAULT_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(AddResult.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showConfirmDialog(null, "Adding Result not successful", null, JOptionPane.DEFAULT_OPTION);
            }
        }
    }//GEN-LAST:event_btnAddResultActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //returns to NormalMainFrame
        this.dispose();
        try {
            new NormalMainFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddResult.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddResult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddResult;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblHRID;
    private javax.swing.JLabel lblHRIDErrorMessage;
    private javax.swing.JLabel lblPlacing;
    private javax.swing.JLabel lblPlacingErrorMessage;
    private javax.swing.JLabel lblQualifier;
    private javax.swing.JLabel lblQualifierErrorMessage;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScoreErrorMessage;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusErrorMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlAddResult;
    private javax.swing.JTextField txtHRID;
    private javax.swing.JTextField txtPlacing;
    private javax.swing.JTextField txtQualifier;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
