
package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class UseOtherClasses {
    DBConnection objDBCon;
    OtherClasses objOC; 
    
    private List<OtherClasses> OtherClassesList = new ArrayList();   //using list to link OtherClasses class
    private javax.swing.JTable OtherClassesTableGUI;
    
    public UseOtherClasses() throws SQLException, ClassNotFoundException {
    //constructor    
        
        objDBCon = new DBConnection();
    }
    public UseOtherClasses(javax.swing.JTable OtherClassesTableGUI) throws SQLException {
    //constructor
        
        try {
            objDBCon = new DBConnection(); //constructor
            this.OtherClassesTableGUI = OtherClassesTableGUI;            
            getOtherClasses();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UseUserClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getOtherClasses() throws SQLException {
    //populates the list    
        
        ResultSet rs = objDBCon.query(""); //sql query to select all data from OtherClasses table
        OtherClassesList.clear();
        
        while (rs.next())
        {
            OtherClasses objOC = new OtherClasses(); //constructor
            //takes data from ResultSet and passes it to object
            objOC.setClassID2(rs.getString("ClassID2"));
            objOC.setHRID(rs.getString("HRID"));
            objOC.setPlacing(rs.getInt("Placing"));
            
            
            OtherClassesList.add(objOC);   //adds object to list       
        }
        
        // fills table with data from the list
        DefaultTableModel model = (DefaultTableModel) OtherClassesTableGUI.getModel();
        model.setRowCount(0);
        for (int i = 0; i < OtherClassesList.size(); i++)
        {
            DATA.OtherClasses objO = OtherClassesList.get(i);

            Object[] rowData =
            {
                
            };
            model.addRow(rowData);
        }
        OtherClassesTableGUI.setModel(model);
        if (OtherClassesTableGUI.getRowCount() > 0)
        {
            OtherClassesTableGUI.setRowSelectionInterval(0, 0);
        }
    }
}
