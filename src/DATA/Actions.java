
package DATA;

import GUI.NormalMainFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    //gets selected row's rider ID
    
        String ID = ""+table.getValueAt(table.getSelectedRow(), 0); //selects ID
        lblID.setText("ID: "+ID); //sets label to ID
    }
    
    public void btnFirst(JTable table) {
    //goes to the first rider in the table
    
        table.setRowSelectionInterval(0, 0);  //selects the row
        table.scrollRectToVisible(table.getCellRect(0, 0, true)); //move the vertical scroll
    }
    
    public void btnPrevious(JTable table){
    //goes to the previous rider in the table
        
        if (table.getSelectedRow() - 1 > -1)
        {
            table.setRowSelectionInterval(table.getSelectedRow() - 1, table.getSelectedRow() - 1); //selects the row
            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow() - 1, 0, true)); //move the vertical scroll
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST Result", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //error message
        }    
    }
    
    public void btnNext(JTable table) {
    //goes to the next rider in the table
        
        if (table.getSelectedRow() + 1 < table.getRowCount())
        {           
            table.setRowSelectionInterval(table.getSelectedRow() + 1, table.getSelectedRow() + 1); //select the row
            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow() + 1, 0, true)); //move the vertical scroll

        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST Result", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //error message
        }
    }
    
    public void btnLast(JTable table){
    //goes to the last rider in the table
    
        table.setRowSelectionInterval(table.getRowCount() - 1, table.getRowCount() - 1);  //select the row
        table.scrollRectToVisible(table.getCellRect(table.getRowCount() - 1, 0, true)); //move the vertical scroll
        
    }
    
    public void txtSearch(JTextField txtsearch, JComboBox cbColum, JTable table) {
        //gets the row and value of data to be searched for    
        
        String vals = txtsearch.getText();//gets the values entered in txtSearch
        int row = cbColum.getSelectedIndex();//gets the ID for what you are searching for
        searchID(vals, table, row);  
    }
    
    private void searchID(String vals, JTable j,int row) {
    //searches for the value as it is being typed
        
        TableModel sk = (DefaultTableModel) j.getModel(); //creates tabel model
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) sk); //creates tabel row sorter
        
        List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2); //creates row filters
        //filters results for values entered to display both upper and lower case version of value entered
        filters.add(RowFilter.regexFilter(vals.toLowerCase(), row)); //adds filter
        filters.add(RowFilter.regexFilter(vals.toUpperCase(), row)); //adds filter
        RowFilter<Object, Object> rf = RowFilter.orFilter(filters); 
        
        j.setRowSorter(tr);
        tr.setRowFilter(rf);         
    }
    
    public void accountFilter(String accID, JTable table, int row)
    {
        TableModel sk = (DefaultTableModel) table.getModel(); //creates tabel model
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) sk); //creates tabel row sorter
    
        List<RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(1); //creates row filters
        filters.add(RowFilter.regexFilter(accID, row)); //adds filter        
        RowFilter<Object, Object> rf = RowFilter.orFilter(filters); 
        
        table.setRowSorter(rowSorter);
        rowSorter.setRowFilter(rf); 
    }
    
    public boolean login(String username, String password, JLabel lblErrorMessage) throws ClassNotFoundException, SQLException {
        boolean tf = false;
        DBConnection objDBC = new DBConnection(); //constuctor    
        User objU[] = new User[1];
        NormalMainFrame objNMF = new NormalMainFrame(); 
        ResultSet rs = objDBC.query("SELECT * FROM AccountDetails");       
        
        while(rs.next() && tf==false)
        {
            String un = rs.getString("Username");
            String pw = rs.getString("Password");           
            String ac = rs.getString("AccountID"); 
            String em = rs.getString("Email");
            boolean ad = rs.getBoolean("Admin");
            
            if (un.contentEquals(username)==true) {

                if (pw.compareTo(password)==0) {
                    tf=true;
                    objU[0] = new User(ac,un,pw,em,ad);
                    String id = objNMF.accID(objU);
                    objNMF.store(id);
                }
                else {
                    lblErrorMessage.setText("Incorrect Username or Password");
                }
            }
            else {
                lblErrorMessage.setText("Incorrect Username or Password");
            }           
        }       
        return tf;
    } 
}
