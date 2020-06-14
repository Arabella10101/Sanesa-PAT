package DATA;

import GUI.AddHorseRider;
import GUI.AddRider;
import GUI.NormalMainFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.I;
import static javafx.scene.input.KeyCode.M;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Actions {

    public void tableMouseClicked(JTable table, JLabel lblID) {
        /*  gets selected row's ID
        parameters passed - table, table to select from
                          - lblID, label to set value too
         */

        String ID = "" + table.getValueAt(table.getSelectedRow(), 0); //selects ID
        lblID.setText(ID); //sets label to ID
    }

    public void btnFirst(JTable table) {
        /*  goes to the first result  in the table
        parameters passed - table to navigate
         */

        table.setRowSelectionInterval(0, 0);  //selects the row
        table.scrollRectToVisible(table.getCellRect(0, 0, true)); //move the vertical scroll
    }

    public void btnPrevious(JTable table) {
        /*  goes to the previous result in the table
        parameters passed - table to navigate
         */

        if (table.getSelectedRow() - 1 > -1) {
            table.setRowSelectionInterval(table.getSelectedRow() - 1, table.getSelectedRow() - 1); //selects the row
            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow() - 1, 0, true)); //move the vertical scroll
        } else {
            JOptionPane.showMessageDialog(null, "You are at the FIRST Result", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //error message
        }
    }

    public void btnNext(JTable table) {
        /*goes to the next result in the table
        parameters passed - table to navigate
        */

        if (table.getSelectedRow() + 1 < table.getRowCount()) {
            table.setRowSelectionInterval(table.getSelectedRow() + 1, table.getSelectedRow() + 1); //select the row
            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow() + 1, 0, true)); //move the vertical scroll

        } else {
            JOptionPane.showMessageDialog(null, "You are at the LAST Result", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //error message
        }
    }

    public void btnLast(JTable table) {
        /*goes to the last result in the table
        parameters passed - table to navigate
        */

        table.setRowSelectionInterval(table.getRowCount() - 1, table.getRowCount() - 1);  //select the row
        table.scrollRectToVisible(table.getCellRect(table.getRowCount() - 1, 0, true)); //move the vertical scroll

    }

    public void txtSearch(JTextField txtsearch, JComboBox cbColum, JTable table) {
        /*gets the row and value of data to be searched for    
        parameters passed - txtsearch, values to search for
                          - cbColum, combo box to get result from
                          - table, which table to search in 
        */

        String vals = txtsearch.getText();//gets the values entered in txtSearch
        int row = cbColum.getSelectedIndex();//gets the ID for what you are searching for
        searchID(vals, table, row);
    }

    private void searchID(String vals, JTable j, int row) {
        /*searches for the value as it is being typed
        parameters passed - vals, what to search for
                          - j, table to search in
                          - row, which column to filter 
        */

        TableModel sk = (DefaultTableModel) j.getModel(); //creates tabel model
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) sk); //creates tabel row sorter

        List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2); //creates row filters
        //filters results for values entered to display both upper and lower case version of value entered
        filters.add(RowFilter.regexFilter(vals.toLowerCase(), row)); //adds filter
        filters.add(RowFilter.regexFilter(vals.toUpperCase(), row)); //adds filter
        RowFilter<Object, Object> rf = RowFilter.orFilter(filters);

        j.setRowSorter(tr);
        tr.setRowFilter(rf);
    }

    public void accountFilter(String accID, JTable table, int row, boolean tf) {
        /*  applies filter to only display results related to the current users account or to display all results
            parameters passed - accID, current users account ID 
                              - table, table to filter
                              - row, column that stores the account ID 
                              - tf, wether to display all or only related results       
        */
        TableModel sk = (DefaultTableModel) table.getModel(); //creates tabel model
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) sk); //creates tabel row sorter

        List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(1); //creates row filters
        filters.add(RowFilter.regexFilter(accID, row)); //adds filter        
        RowFilter<Object, Object> rf = RowFilter.orFilter(filters);
        if (tf == false) {
            RowFilter<Object, Object> rf2 = RowFilter.notFilter(RowFilter.regexFilter(accID, row)); // negates account ID filter
            table.setRowSorter(rowSorter);
            rowSorter.setRowFilter(rf2);
        } else {
            table.setRowSorter(rowSorter); //applies account filter
            rowSorter.setRowFilter(rf);
        }
    }

    public boolean login(String username, String password, JLabel lblErrorMessage) throws ClassNotFoundException, SQLException {
        /*  Determines if username and password are correct and match a result in AccountDetails table
            parameters passed - username, username to test
                              - password, password to test
                              - lblErrorMessage, lbl to display error too
        */
        boolean tf = false;
        //constuctors
        DBConnection objDBC = new DBConnection();     
        User objU[] = new User[1];
        NormalMainFrame objNMF = new NormalMainFrame();
        AddRider objAR = new AddRider();
        AddHorseRider objAHR = new AddHorseRider();
        
        ResultSet rs = objDBC.query("SELECT * FROM AccountDetails"); //query to call all accounts 

        while (rs.next() && tf == false) {
            //stores details
            String un = rs.getString("Username");
            String pw = rs.getString("Password");
            String ac = rs.getString("AccountID");
            String em = rs.getString("Email");
            boolean ad = rs.getBoolean("Admin");

            if (un.contentEquals(username) == true) {

                if (pw.compareTo(password) == 0) {
                    tf = true; 
                    objU[0] = new User(ac, un, pw, em, ad);
                    String id = objNMF.accID(objU);                   
                    //stores the accountID of the matched username and password too all relevant classes
                    objNMF.store(id);
                    objAR.store(id);
                    objAHR.store(id);                   
                } else {
                    lblErrorMessage.setText("Incorrect Username or Password"); //error message
                }
            } else {
                lblErrorMessage.setText("Incorrect Username or Password"); //error message
            }
        }
        return tf;
    }
}
