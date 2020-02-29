
package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class UseShowJumping {
        DBConnection objDBCon;
        ShowJumping objSJ;
    
    private List<ShowJumping> SJList = new ArrayList();//using list to link  to ShowJumping class
    private javax.swing.JTable ShowJumpingTableGUI;
    
    public UseShowJumping() throws SQLException, ClassNotFoundException {
    //constructor    
        
        objDBCon = new DBConnection();
    }
    public UseShowJumping(javax.swing.JTable ShowJumpingTableGUI) throws SQLException {
    //constructor
        
        try {
            objDBCon = new DBConnection(); //constructor
            this.ShowJumpingTableGUI = ShowJumpingTableGUI;            
            getSJList();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UseUserClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getSJList() throws SQLException {
    //populates the list    
        
        ResultSet rs = objDBCon.query("SELECT * FROM ShowJumping"); //sql query to select all data from ShowJumping table
        SJList.clear();
        
        while (rs.next())
        {
            ShowJumping objSJ = new ShowJumping(); //constructor
            //takes data from ResultSet and passes it to object
            objSJ.setClassID(rs.getString("ClassID"));
            objSJ.setHRID(rs.getString("HRID"));
            objSJ.setRound(rs.getInt("Round"));
            objSJ.setTime(rs.getString("Time"));
            objSJ.setPlacing(rs.getInt("Placing"));
            objSJ.setStatus(rs.getString("Status"));
            objSJ.setQualifier(rs.getString("Qualifier"));
            
            SJList.add(objSJ);   //adds object to list       
        }
        
        // fills table with data from the list
        DefaultTableModel model = (DefaultTableModel) ShowJumpingTableGUI.getModel();
        model.setRowCount(0);
        for (int i = 0; i < SJList.size(); i++)
        {
            DATA.ShowJumping objR = SJList.get(i);

            Object[] rowData =
            {
                objR.getClassID(), objR.getHRID(), objR.getRound(), objR.getTime(), objR.getPlacing(), objR.getStatus(), objR.getQualifier()
            };
            model.addRow(rowData);
        }
        ShowJumpingTableGUI.setModel(model);
        if (ShowJumpingTableGUI.getRowCount() > 0)
        {
            ShowJumpingTableGUI.setRowSelectionInterval(0, 0);
        }
    }    
}
