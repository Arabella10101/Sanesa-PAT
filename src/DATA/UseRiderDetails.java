/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20baliar
 */
public class UseRiderDetails {
        DBConnection objDBCon;
    
    private List<RiderDetails> RDList = new ArrayList();   //using list to link client class
    private javax.swing.JTable RiderDetailsTable;
    
    
    public UseRiderDetails(javax.swing.JTable RiderDetailsTable) throws SQLException     //constructor
    {
        try {
            objDBCon = new DBConnection();
            this.RiderDetailsTable = RiderDetailsTable;
            
            getRDList();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UseUserClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getRDList() throws SQLException
    {
        ResultSet rs = objDBCon.query("SELECT * FROM RiderDetails ORDER BY RiderName");
        RDList.clear();
        while (rs.next())
        {
            RiderDetails objRD = new RiderDetails();
            objRD.setRiderID(rs.getString("RiderID"));
            objRD.setRiderName(rs.getString("RiderName"));
            objRD.setRiderSurname(rs.getString("RiderSurname"));
            objRD.setSchool(rs.getString("School"));
            objRD.setAccountID(rs.getString("AccountID"));
            
            RDList.add(objRD);          
        }

        DefaultTableModel model = (DefaultTableModel) RiderDetailsTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < RDList.size(); i++)
        {
            DATA.RiderDetails objR = RDList.get(i);

            Object[] rowData =
            {
                objR.getRiderID(),objR.getRiderName(),objR.getRiderSurname(),objR.getSchool(),objR.getAccountID()
            };
            model.addRow(rowData);
        }

        RiderDetailsTable.setModel(model);

        if (RiderDetailsTable.getRowCount() > 0)
        {
            RiderDetailsTable.setRowSelectionInterval(0, 0);
        }
    }
    
    public void addRider(RiderDetails rd) throws SQLException
    {
        objDBCon.update("INSERT INTO RiderDetails(RiderID, RiderName, RiderSurname, School, AccountID) VALUES ('"+rd.getRiderID()+"','"+
                rd.getRiderName()+"', '"+rd.getRiderSurname()+"', '"+rd.getSchool()+"', '"+rd.getAccountID()+"')");
    }
    
    public void editRider(String RiderID, String RiderName, String RiderSurname, String School, String AccountID) throws SQLException //edits rider
    {
        objDBCon.update("UPDATE RiderDetails SET RiderID = '" + RiderID + "', RiderName = '" + RiderName + "', RiderSurname = '" + RiderSurname + "', School = '" + School +
                "', AccountID = '" + AccountID + "' WHERE RiderID = " + RiderID ); //sql for editing customer
    }
    
    public void deleteRider(int RiderID) throws SQLException //delets customer
    {
        if (objDBCon.update("DELETE * FROM RiderDetails WHERE RiderID = '" + RiderID + "'") > 0) //sql for deleting customer
        {
            getRDList();
            JOptionPane.showMessageDialog(null, "Rider successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Rider NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void countRiders() throws SQLException
    {     
        ResultSet num=objDBCon.query("SELECT COUNT(RiderID) AS count FROM RiderDetails");
        int count=0;
        while(num.next())
        {
           count=num.getInt(1);
        }
        JOptionPane.showMessageDialog(null, "Number of Riders is "+count);
    }
}
