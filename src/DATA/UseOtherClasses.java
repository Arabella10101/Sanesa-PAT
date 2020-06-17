package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UseOtherClasses {

    //object constructor
    DBConnection objDBCon;
    OtherClasses objOC;

    private List<OtherClasses> OtherClassesList = new ArrayList();   //using list to link OtherClasses class
    private javax.swing.JTable OtherClassesTableGUI; //table to display data in list

    public UseOtherClasses() throws SQLException, ClassNotFoundException {
        //default constructor    

        objDBCon = new DBConnection();
    }

    public UseOtherClasses(javax.swing.JTable OtherClassesTableGUI) throws SQLException {
        //constructor

        try {
            objDBCon = new DBConnection(); //constructor
            this.OtherClassesTableGUI = OtherClassesTableGUI;
            getOtherClassesList();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UseUserClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getOtherClassesList() throws SQLException {
        //populates the list    

        ResultSet rs = objDBCon.query("SELECT * FROM OtherClasses"); //sql query to select all data from OtherClasses table
        OtherClassesList.clear();

        while (rs.next()) {
            OtherClasses objOC = new OtherClasses(); //constructor
            //takes data from ResultSet and passes it to object
            objOC.setClassID2(rs.getString("ClassID2"));
            objOC.setHRID(rs.getString("HRID"));
            objOC.setScore(rs.getDouble("Score"));
            objOC.setPlacing(rs.getInt("Placing"));
            objOC.setStatus(rs.getString("Status"));
            objOC.setQualifier(rs.getString("Qualifier"));

            OtherClassesList.add(objOC);   //adds object to list       
        }

        // fills table with data from the list
        DefaultTableModel model = (DefaultTableModel) OtherClassesTableGUI.getModel();
        model.setRowCount(0);
        for (int i = 0; i < OtherClassesList.size(); i++) {
            DATA.OtherClasses objO = OtherClassesList.get(i);

            Object[] rowData
                    = {
                        objO.getClassID2(), objO.getHRID(), objO.getScore(), objO.getPlacing(), objO.getStatus(), objO.getQualifier()
                    };
            model.addRow(rowData);
        }
        OtherClassesTableGUI.setModel(model);
        if (OtherClassesTableGUI.getRowCount() > 0) {
            OtherClassesTableGUI.setRowSelectionInterval(0, 0);
        }
    }
    public void addResult(String HRID, double Score, int Placing, String Status, String Qualifier) throws SQLException{
        objDBCon.update("INSERT INTO OtherClasses(HRID, Score, Placing, Status,Qualifier) VALUES ('"
                + HRID + "', '" + Score + "', '" + Placing + "', '" + Status + "', '" + Qualifier + "')");
    }
    
    public void editResult(String ClassID2, String HRID, double Score, int Placing, String Status, String Qualifier) throws SQLException{
        //sql that updates result information  
        objDBCon.update("UPDATE OtherClasses SET HRID = '" + HRID + "', Score = '" + Score
                + "', Placing = '" + Placing + "', Status = '" + Status + "', Qualifier = '" + Qualifier + "'where ClassID2="+ClassID2);
    }
    
    public void deleteResult(String ClassID2) throws SQLException {
        //sql that deletes result    

        if (objDBCon.update("DELETE * FROM OtherClasses WHERE ClassID2 = '" + ClassID2 + "'") > 0) //sql for deleting result
        {
            getOtherClassesList();
            JOptionPane.showMessageDialog(null, "Result successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Result NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE); //error message
        }
    }
}
