/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author 20baliar
 */
public class NormalMainFrame extends javax.swing.JFrame {
    CardLayout cardLayout;   
    
    public NormalMainFrame() {
        initComponents();

        cardLayout = (CardLayout)(pnlCardLayout.getLayout());
        cardLayout.addLayoutComponent(pnlHome, "pnlHome");
        cardLayout.addLayoutComponent(pnlRiders, "pnlRiders");
        cardLayout.addLayoutComponent(pnlCombos, "pnlCombos");
        cardLayout.addLayoutComponent(pnlResults, "pnlResults");
        cardLayout.addLayoutComponent(pnlHelp, "pnlHelp");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        side_pane = new javax.swing.JPanel();
        pnlMenu1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        pnlMenu2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        lblRiders = new javax.swing.JLabel();
        pnlMenu3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        lblCombos = new javax.swing.JLabel();
        pnlMenu4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        lblResults = new javax.swing.JLabel();
        pnlMenu5 = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        lblHelp = new javax.swing.JLabel();
        pnlCardLayout = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        pnlRiders = new javax.swing.JPanel();
        pnlCombos = new javax.swing.JPanel();
        pnlResults = new javax.swing.JPanel();
        pnlHelp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu1.setBackground(new java.awt.Color(23, 35, 51));
        pnlMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMenu1MousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblHome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setText("Home");
        lblHome.setToolTipText("");

        javax.swing.GroupLayout pnlMenu1Layout = new javax.swing.GroupLayout(pnlMenu1);
        pnlMenu1.setLayout(pnlMenu1Layout);
        pnlMenu1Layout.setHorizontalGroup(
            pnlMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblHome)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        pnlMenu1Layout.setVerticalGroup(
            pnlMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(pnlMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        pnlMenu2.setBackground(new java.awt.Color(23, 35, 51));
        pnlMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMenu2MousePressed(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblRiders.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblRiders.setForeground(new java.awt.Color(255, 255, 255));
        lblRiders.setText("Riders");

        javax.swing.GroupLayout pnlMenu2Layout = new javax.swing.GroupLayout(pnlMenu2);
        pnlMenu2.setLayout(pnlMenu2Layout);
        pnlMenu2Layout.setHorizontalGroup(
            pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblRiders)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        pnlMenu2Layout.setVerticalGroup(
            pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRiders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(pnlMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

        pnlMenu3.setBackground(new java.awt.Color(23, 35, 51));
        pnlMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMenu3MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblCombos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCombos.setForeground(new java.awt.Color(255, 255, 255));
        lblCombos.setText("Combos");

        javax.swing.GroupLayout pnlMenu3Layout = new javax.swing.GroupLayout(pnlMenu3);
        pnlMenu3.setLayout(pnlMenu3Layout);
        pnlMenu3Layout.setHorizontalGroup(
            pnlMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblCombos)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        pnlMenu3Layout.setVerticalGroup(
            pnlMenu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCombos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(pnlMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));

        pnlMenu4.setBackground(new java.awt.Color(23, 35, 51));
        pnlMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlMenu4MouseReleased(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblResults.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblResults.setForeground(new java.awt.Color(255, 255, 255));
        lblResults.setText("Results");

        javax.swing.GroupLayout pnlMenu4Layout = new javax.swing.GroupLayout(pnlMenu4);
        pnlMenu4.setLayout(pnlMenu4Layout);
        pnlMenu4Layout.setHorizontalGroup(
            pnlMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblResults)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        pnlMenu4Layout.setVerticalGroup(
            pnlMenu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(pnlMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, -1));

        pnlMenu5.setBackground(new java.awt.Color(23, 35, 51));
        pnlMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlMenu5MouseReleased(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        lblHelp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(255, 255, 255));
        lblHelp.setText("Help");

        javax.swing.GroupLayout pnlMenu5Layout = new javax.swing.GroupLayout(pnlMenu5);
        pnlMenu5.setLayout(pnlMenu5Layout);
        pnlMenu5Layout.setHorizontalGroup(
            pnlMenu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblHelp)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        pnlMenu5Layout.setVerticalGroup(
            pnlMenu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu5Layout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenu5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(pnlMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 120, -1));

        jSplitPane1.setLeftComponent(side_pane);

        pnlCardLayout.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        pnlCardLayout.add(pnlHome, "card2");

        pnlRiders.setBackground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout pnlRidersLayout = new javax.swing.GroupLayout(pnlRiders);
        pnlRiders.setLayout(pnlRidersLayout);
        pnlRidersLayout.setHorizontalGroup(
            pnlRidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        pnlRidersLayout.setVerticalGroup(
            pnlRidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        pnlCardLayout.add(pnlRiders, "card3");

        pnlCombos.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout pnlCombosLayout = new javax.swing.GroupLayout(pnlCombos);
        pnlCombos.setLayout(pnlCombosLayout);
        pnlCombosLayout.setHorizontalGroup(
            pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        pnlCombosLayout.setVerticalGroup(
            pnlCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        pnlCardLayout.add(pnlCombos, "card4");

        pnlResults.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnlResultsLayout = new javax.swing.GroupLayout(pnlResults);
        pnlResults.setLayout(pnlResultsLayout);
        pnlResultsLayout.setHorizontalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        pnlResultsLayout.setVerticalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        pnlCardLayout.add(pnlResults, "card6");

        pnlHelp.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout pnlHelpLayout = new javax.swing.GroupLayout(pnlHelp);
        pnlHelp.setLayout(pnlHelpLayout);
        pnlHelpLayout.setHorizontalGroup(
            pnlHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        pnlHelpLayout.setVerticalGroup(
            pnlHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        pnlCardLayout.add(pnlHelp, "card5");

        jSplitPane1.setRightComponent(pnlCardLayout);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void pnlMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenu1MousePressed
    //creates dynamic indication the panel has been clicked
        setColor(pnlMenu1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{pnlMenu2,pnlMenu3,pnlMenu4,pnlMenu5}, new JPanel[]{ind_2, ind_3,ind_4,ind_5});
        cardLayout.show(pnlCardLayout, "pnlHome");
    }//GEN-LAST:event_pnlMenu1MousePressed

    private void pnlMenu5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenu5MouseReleased
    //creates dynamic indication the panel has been clicked
        setColor(pnlMenu5);
        ind_5.setOpaque(true);
        resetColor(new JPanel[]{pnlMenu1,pnlMenu2,pnlMenu3,pnlMenu4}, new JPanel[]{ind_1,ind_2, ind_3,ind_4}); 
        cardLayout.show(pnlCardLayout, "pnlHelp");
    }//GEN-LAST:event_pnlMenu5MouseReleased

    private void pnlMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenu2MousePressed
    //creates dynamic indication the panel has been clicked    
        setColor(pnlMenu2);
        ind_2.setOpaque(true);
        resetColor(new JPanel[]{pnlMenu1,pnlMenu3,pnlMenu4,pnlMenu5}, new JPanel[]{ind_1,ind_3, ind_4,ind_5});
        cardLayout.show(pnlCardLayout, "pnlRiders");
    }//GEN-LAST:event_pnlMenu2MousePressed

    private void pnlMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenu3MousePressed
    //creates dynamic indication the panel has been clicked    
        setColor(pnlMenu3);
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{pnlMenu1,pnlMenu2,pnlMenu4,pnlMenu5}, new JPanel[]{ind_1,ind_2, ind_4,ind_5});
        cardLayout.show(pnlCardLayout, "pnlCombos");
    }//GEN-LAST:event_pnlMenu3MousePressed

    private void pnlMenu4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenu4MouseReleased
    //creates dynamic indication the panel has been clicked
        setColor(pnlMenu4);
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{pnlMenu1,pnlMenu2,pnlMenu3,pnlMenu5}, new JPanel[]{ind_1,ind_2, ind_3, ind_5});
        cardLayout.show(pnlCardLayout, "pnlResults");
    }//GEN-LAST:event_pnlMenu4MouseReleased
    
    private void resetColor(JPanel [] pane, JPanel [] indicators) {
    //changes the colour     
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }
    
    private void setColor(JPanel pane) {
    //changes the colour
        pane.setBackground(new Color(41,57,80));
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
            java.util.logging.Logger.getLogger(NormalMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormalMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormalMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormalMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormalMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCombos;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblRiders;
    private javax.swing.JPanel pnlCardLayout;
    private javax.swing.JPanel pnlCombos;
    private javax.swing.JPanel pnlHelp;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlMenu1;
    private javax.swing.JPanel pnlMenu2;
    private javax.swing.JPanel pnlMenu3;
    private javax.swing.JPanel pnlMenu4;
    private javax.swing.JPanel pnlMenu5;
    private javax.swing.JPanel pnlResults;
    private javax.swing.JPanel pnlRiders;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables
}
