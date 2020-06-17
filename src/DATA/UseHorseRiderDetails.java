package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UseHorseRiderDetails {

    DBConnection objDBCon; //object constructor 
    private List<HorseRiderDetails> HRDList = new ArrayList();   //using list to link HorseRiderDetails class
    private javax.swing.JTable HorseRiderDetailsTable; //table to display data in list

    public UseHorseRiderDetails(javax.swing.JTable HorseRiderDetailsTable) throws ClassNotFoundException, SQLException {
        //constructor
        objDBCon = new DBConnection();
        this.HorseRiderDetailsTable = HorseRiderDetailsTable;
        getHRDList();
    }

    public UseHorseRiderDetails() throws ClassNotFoundException, SQLException {
        //default constructor           
        objDBCon = new DBConnection();
    }

    public void getHRDList() throws SQLException {
        //populates the list 
        ResultSet rs = objDBCon.query("SELECT * FROM HorseRiderDetails ORDER BY HRID"); //sql query to select all data from HorseRiderDetails table
        HRDList.clear();

        while (rs.next()) {
            HorseRiderDetails objHRD = new HorseRiderDetails();//constructor
            //takes data from ResultSet and passes it to object
            objHRD.setHRID(rs.getString("HRID"));
            objHRD.setRiderID(rs.getString("RiderID"));
            objHRD.setHorsename(rs.getString("Horsename"));
            objHRD.setAccountID(rs.getString("AccountID"));

            HRDList.add(objHRD); //adds object to list 
        }

        // fills table with data from the list
        DefaultTableModel model = (DefaultTableModel) HorseRiderDetailsTable.getModel();
        model.setRowCount(0);

        for (int i = 0; i < HRDList.size(); i++) {
            DATA.HorseRiderDetails objHR = HRDList.get(i);

            Object[] rowData
                    = {
                        objHR.getHRID(), objHR.getRiderID(), objHR.getHorsename(), objHR.getAccountID()
                    };
            model.addRow(rowData);
        }

        HorseRiderDetailsTable.setModel(model);

        if (HorseRiderDetailsTable.getRowCount() > 0) {
            HorseRiderDetailsTable.setRowSelectionInterval(0, 0);
        }
    }

    public void addHorseRider(HorseRiderDetails objHRD) throws SQLException {
        //sql for add rider    

        objDBCon.update("INSERT INTO HorseRiderDetails(HRID, RiderID, Horsename, AccountID) VALUES ('"
                + objHRD.getHRID() + "', '" + objHRD.getRiderID() + "', '" + objHRD.getHorsename() + "', '" + objHRD.getAccountID() + "')"); //sql for adding horse rider  
    }

    public void editHorseRider(String HRID, String RiderID, String Horsename, String AccountID) throws SQLException {
        //sql that updates rider information    

        objDBCon.update("UPDATE HorseRiderDetails SET RiderID = '" + RiderID + "', Horsename = '" + Horsename
                + "', AccountID = '" + AccountID + "' WHERE HRID = " + HRID); //sql for updating horse rider
    }

    public void deleteHorseRider(int HRID) throws SQLException {
        //sql that deletes rider    

        if (objDBCon.update("DELETE * FROM HorseRiderDetails WHERE HRID = '" + HRID + "'") > 0) //sql for deleting rider
        {
            getHRDList();
            JOptionPane.showMessageDialog(null, "Combination successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Combination NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE); //error message
        }
    }
}
