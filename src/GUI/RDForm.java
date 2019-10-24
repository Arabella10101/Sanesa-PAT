/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DATA.DBConnection;
import DATA.DataValidation;
import DATA.RiderDetails;
import DATA.UseRiderDetails;
import java.awt.Desktop;
import java.awt.Panel;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author 20baliar
 */
public class RDForm extends javax.swing.JFrame {
DATA.UseRiderDetails objURD;
DataValidation objDataValid = new DataValidation();

    public RDForm() throws SQLException 
    {
         // try {
        initComponents();
        setLocationRelativeTo(null);
        /*  objCon= new DBConnection();
          getData();
      } catch (SQLException ex) {
          Logger.getLogger(DBForm.class.getName()).log(Level.SEVERE, null, ex);
      }*/
        objURD = new DATA.UseRiderDetails(RiderDetailsTable);
        objURD.getRDList();//populates array list in the UseRiderDetails  class
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RiderDetailsTable = new javax.swing.JTable();
        pnlNavigation = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlEdit = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        cbColum = new javax.swing.JComboBox<>();
        pnlMoreInformation = new javax.swing.JPanel();
        btnCount = new javax.swing.JButton();
        btnLink = new javax.swing.JButton();
        lblNameErrorMessage = new javax.swing.JLabel();
        pnlEditRider = new javax.swing.JPanel();
        txtNameEdit = new javax.swing.JTextField();
        txtSurnameEdit = new javax.swing.JTextField();
        txtSchoolEdit = new javax.swing.JTextField();
        txtAccountIDEdit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRiderID = new javax.swing.JLabel();
        lblSurnameErrorMessage = new javax.swing.JLabel();
        lblAccountIDErrorMessage = new javax.swing.JLabel();
        lblSchoolErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RiderDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RiderID", "Rider name", "Rider Surname", "School", "AccountID"
            }
        ));
        RiderDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiderDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RiderDetailsTable);

        pnlNavigation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        btnFirst.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlNavigationLayout.setVerticalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pnlEdit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        btnAdd.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblSearch.setText("Enter ");

        cbColum.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cbColum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RiderID", "RiderName", "RiderSurname", "School", "AccountID" }));

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbColum, 0, 0, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbColum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSearch)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pnlMoreInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "More Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        btnCount.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnCount.setText("Count Riders");
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });

        btnLink.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btnLink.setText("Sanesa Website");
        btnLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMoreInformationLayout = new javax.swing.GroupLayout(pnlMoreInformation);
        pnlMoreInformation.setLayout(pnlMoreInformationLayout);
        pnlMoreInformationLayout.setHorizontalGroup(
            pnlMoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMoreInformationLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlMoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlMoreInformationLayout.setVerticalGroup(
            pnlMoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMoreInformationLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnLink, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblNameErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblNameErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblNameErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pnlEditRider.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Rider", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Surname");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("School");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Account ID");

        lblRiderID.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnlEditRiderLayout = new javax.swing.GroupLayout(pnlEditRider);
        pnlEditRider.setLayout(pnlEditRiderLayout);
        pnlEditRiderLayout.setHorizontalGroup(
            pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditRiderLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblRiderID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSurnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSchoolEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAccountIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35))
        );
        pnlEditRiderLayout.setVerticalGroup(
            pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditRiderLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditRiderLayout.createSequentialGroup()
                        .addComponent(lblRiderID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditRiderLayout.createSequentialGroup()
                        .addGroup(pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEditRiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSurnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSchoolEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAccountIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))))
        );

        lblSurnameErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblSurnameErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblSurnameErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblAccountIDErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblAccountIDErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblAccountIDErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblSchoolErrorMessage.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblSchoolErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblSchoolErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(pnlMoreInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnlEditRider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSurnameErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addComponent(lblNameErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAccountIDErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                        .addComponent(lblSchoolErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMoreInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(pnlEditRider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblSurnameErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblSchoolErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblAccountIDErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pnlMoreInformation.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RiderDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiderDetailsTableMouseClicked
        String riderID = ""+RiderDetailsTable.getValueAt(RiderDetailsTable.getSelectedRow(), 0);
        lblRiderID.setText("Rider ID: "+riderID);
    }//GEN-LAST:event_RiderDetailsTableMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        RiderDetailsTable.setRowSelectionInterval(0, 0);  //select the row
        RiderDetailsTable.scrollRectToVisible(RiderDetailsTable.getCellRect(0, 0, true)); //move the vertical scroll

    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if (RiderDetailsTable.getSelectedRow() - 1 > -1)
        {
            RiderDetailsTable.setRowSelectionInterval(RiderDetailsTable.getSelectedRow() - 1, RiderDetailsTable.getSelectedRow() - 1); //select the row
            RiderDetailsTable.scrollRectToVisible(RiderDetailsTable.getCellRect(RiderDetailsTable.getSelectedRow() - 1, 0, true)); //move the vertical scroll

        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST User", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (RiderDetailsTable.getSelectedRow() + 1 < RiderDetailsTable.getRowCount())
        {
            RiderDetailsTable.setRowSelectionInterval(RiderDetailsTable.getSelectedRow() + 1, RiderDetailsTable.getSelectedRow() + 1); //select the row
            RiderDetailsTable.scrollRectToVisible(RiderDetailsTable.getCellRect(RiderDetailsTable.getSelectedRow() + 1, 0, true)); //move the vertical scroll

        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST User", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        RiderDetailsTable.setRowSelectionInterval(RiderDetailsTable.getRowCount() - 1, RiderDetailsTable.getRowCount() - 1);  //select the row
        RiderDetailsTable.scrollRectToVisible(RiderDetailsTable.getCellRect(RiderDetailsTable.getRowCount() - 1, 0, true)); //move the vertical scroll

    }//GEN-LAST:event_btnLastActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.dispose(); //closes this gui and opens the add rider gui
        
        new AddRider().setVisible(true);                          // TODO add your handling code here:    
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try
        {
            String riderID = ""+RiderDetailsTable.getValueAt(RiderDetailsTable.getSelectedRow(), 0);//gets the selected rows RiderID

            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete Rider " + riderID, "Warning", JOptionPane.YES_NO_OPTION);//asks the user if they are sure they want to delete the rider
            if (dialogResult == 0)
            {
                objURD.deleteRider(Integer.parseInt(riderID));//deletes the rider
            }

        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //store all the values form the selected row into these variables
        String riderID = ""+RiderDetailsTable.getValueAt(RiderDetailsTable.getSelectedRow(), 0);
        String name = txtNameEdit.getText();
        String surname = txtSurnameEdit.getText();
        String school = txtSchoolEdit.getText();
        String accountID = txtAccountIDEdit.getText();
        int totalValidCounter=0;  
  
        try {
            objURD = new UseRiderDetails();
        } catch (SQLException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (objDataValid.textValidation(name, "Name", lblNameErrorMessage)>1) 
        {
            totalValidCounter++;
        }
        
        if (objDataValid.textValidation(surname, "Surname", lblSurnameErrorMessage)>1) 
        {
            totalValidCounter++;
        }
        
        if (objDataValid.textValidation(school, "School", lblSchoolErrorMessage)>1) 
        {
            totalValidCounter++;
        }
        
        if (objDataValid.numberValidation(accountID, "Account ID", lblAccountIDErrorMessage)>1 ) 
        {
            totalValidCounter++;
        }        
        if (objDataValid.testPresence(accountID, "Account ID", lblAccountIDErrorMessage)==true) {
        try {                      
            if (objDataValid.testInDatabase(accountID, "Account ID", lblAccountIDErrorMessage, " must be a valid ID")==true) 
            {
                totalValidCounter++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        if (totalValidCounter>4)
        {
            try
            {       
                objURD.editRider(riderID,name,surname,school,accountID);//edits rider
                lblNameErrorMessage.setText("");
                JOptionPane.showConfirmDialog(null, "Rider saved", null, JOptionPane.DEFAULT_OPTION);
            } catch (SQLException ex)
            {
                Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showConfirmDialog(null, "Rider edit not successful", null, JOptionPane.DEFAULT_OPTION);
            }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String vals = txtSearch.getText();//gets the values entered in txtSearch
        int row = cbColum.getSelectedIndex();//gets the ID for what you are searching for
        searchID(vals,RiderDetailsTable,row);    // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
    try {
        objURD.countRiders();
    } catch (SQLException ex) {
        Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnCountActionPerformed

    private void btnLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkActionPerformed
        Desktop desktop;
    try {
        Desktop.getDesktop().browse(new URL("https://www.sanesa.co.za/home.php").toURI()); //creates link to SANESA website
    } catch (MalformedURLException ex) {
        Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (URISyntaxException ex) {
        Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnLinkActionPerformed
     private void searchID(String vals, JTable j,int row)//searches for the Rider as it is being typed
    {
        TableModel sk = (DefaultTableModel) j.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) sk);
        
        List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2);
        filters.add(RowFilter.regexFilter(vals.toLowerCase()));
        filters.add(RowFilter.regexFilter(vals.toUpperCase()));

        RowFilter<Object, Object> rf = RowFilter.orFilter(filters);
        
        j.setRowSorter(tr);
        tr.setRowFilter(rf); 
        //tr.setRowFilter(RowFilter.regexFilter(vals, row));
        
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
            java.util.logging.Logger.getLogger(RDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RDForm().setVisible(true); 
                } catch (SQLException ex) {
                    Logger.getLogger(RDForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RiderDetailsTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLink;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbColum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccountIDErrorMessage;
    private javax.swing.JLabel lblNameErrorMessage;
    private javax.swing.JLabel lblRiderID;
    private javax.swing.JLabel lblSchoolErrorMessage;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSurnameErrorMessage;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlEditRider;
    private javax.swing.JPanel pnlMoreInformation;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JTextField txtAccountIDEdit;
    private javax.swing.JTextField txtNameEdit;
    private javax.swing.JTextField txtSchoolEdit;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSurnameEdit;
    // End of variables declaration//GEN-END:variables
}
