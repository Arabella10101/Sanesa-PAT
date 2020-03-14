
package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class UseHorseRiderDetails {
    DBConnection objDBCon;
    private List<HorseRiderDetails> HRDList = new ArrayList();   //using list to link client class
    private javax.swing.JTable HorseRiderDetailsTable;
    
    public UseHorseRiderDetails(javax.swing.JTable HorseRiderDetailsTable) throws ClassNotFoundException, SQLException {
    //constructor
        objDBCon = new DBConnection();
        this.HorseRiderDetailsTable = HorseRiderDetailsTable;
        
        getHRDList();
    }

    public void getHRDList() throws SQLException {
    //populates the list 
        ResultSet rs = objDBCon.query("SELECT * FROM HorseRiderDetails ORDER BY Horsename"); //sql query to select all data from HorseRiderDetails table
        HRDList.clear();
        
        while(rs.next())
        {
            HorseRiderDetails objHRD = new HorseRiderDetails();//constructor
            //takes data from ResultSet and passes it to object
            objHRD.setHRID("HRID");
            objHRD.setRiderID("RiderID");
            objHRD.setHorsename("Horsename");
            objHRD.setAccountID("AccountID");
            
            HRDList.add(objHRD); //adds object to list 
        }
        
        // fills table with data from the list
        DefaultTableModel model = (DefaultTableModel) HorseRiderDetailsTable.getModel();
        model.setRowCount(0);
        
        for (int i = 0; i < HRDList.size(); i++) 
        {   
         DATA.HorseRiderDetails objHR = HRDList.get(i);
         
         Object[] rowData =
         {
             objHR.getHRID(), objHR.getRiderID(), objHR.getHorsename(), objHR.getAccountID()
         };
         model.addRow(rowData); 
        }
        
        HorseRiderDetailsTable.setModel(model);

        if (HorseRiderDetailsTable.getRowCount() > 0)
        {
            HorseRiderDetailsTable.setRowSelectionInterval(0, 0);
        }
    }
}
