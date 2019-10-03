
package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class UseUserClass
{
    DBConnection objDBCon;
    
    private List<User> userList = new ArrayList();   //using list to link client class
    private javax.swing.JTable AccountDetailsTable;
    
    
    public UseUserClass(javax.swing.JTable AccountDetailsTable) throws SQLException     //constructor
    {
        try {
            objDBCon = new DBConnection();
            this.AccountDetailsTable = AccountDetailsTable;
            
            getUsersList();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UseUserClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public UseUserClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void getUsersList() throws SQLException
    {
        ResultSet rs = objDBCon.query("SELECT * FROM AccountDetails ORDER BY Username");
        userList.clear();
        while (rs.next())
        {
            User objUser = new User();
            objUser.setAccountID(rs.getString("AccountID"));
            objUser.setUsername(rs.getString("Username"));
            objUser.setPassword(rs.getString("Password"));
            objUser.setEmail(rs.getString("Email"));
            objUser.setAdmin(rs.getString("Admin"));           
               
            userList.add(objUser);
        }

        DefaultTableModel model = (DefaultTableModel) AccountDetailsTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < userList.size(); i++)
        {
            DATA.User objC = userList.get(i);

            Object[] rowData =
            {
                objC.getAccountID(),objC.getUsername(), objC.getPassword(), objC.getEmail(),objC.getAdmin()
            };
            model.addRow(rowData);
        }

        AccountDetailsTable.setModel(model);

        if (AccountDetailsTable.getRowCount() > 0)
        {
            AccountDetailsTable.setRowSelectionInterval(0, 0);
        }
    }
    
   
}
