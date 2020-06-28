package DATA;

import GUI.AddHorseRider;
import GUI.AddRider;
import GUI.NormalMainFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hsqldb.jdbc.JDBCCallableStatement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.*; 
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.ui.RectangleEdge;

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
        String temp="^"+accID+"$";
        TableModel sk = (DefaultTableModel) table.getModel(); //creates tabel model
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) sk); //creates tabel row sorter

        List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(1); //creates row filters
        filters.add(RowFilter.regexFilter(temp, row)); //adds filter

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
        return tf; //returns true or false
    }
    
    public void filltblUsersCombosAvgScore(JTable table, String ID) throws ClassNotFoundException, SQLException{
        /* method to fill table with data from 2 queries 
        parameters passed - table, table to fill
                          - ID , account id 
        */
        DBConnection objDBC = new DBConnection(); //constuctor
        
        ResultSet rs1 = objDBC.query("SELECT DISTINCT OtherClasses.HRID, RiderName, Horsename " +
        "FROM (RiderDetails INNER JOIN HorseRiderDetails ON RiderDetails.[RiderID] = HorseRiderDetails.[RiderID]) INNER JOIN OtherClasses ON HorseRiderDetails.[HRID] = OtherClasses.[HRID] " +
        "WHERE HorseRiderDetails.AccountID = '"+ID+"' "+
        "ORDER BY OtherClasses.HRID;"); //query to get HRID, rider name and horse name
        ResultSet rs2 = objDBC.query("SELECT AVG(Score) AS Average " +
        "FROM (RiderDetails INNER JOIN HorseRiderDetails ON RiderDetails.[RiderID] = HorseRiderDetails.[RiderID]) INNER JOIN OtherClasses ON HorseRiderDetails.[HRID] = OtherClasses.[HRID] " +
        "WHERE HorseRiderDetails.AccountID = '"+ID+"' "+
        "GROUP BY OtherClasses.HRID " +
        "ORDER BY OtherClasses.HRID;"); //query to get average score
        
        // fills table with data from the result set
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        while (rs1.next() && rs2.next())
        {
            Object[] rowData
                    = {
                        rs1.getString("HRID"), rs1.getString("RiderName"), rs1.getString("Horsename"), rs2.getString(1)
                    };
            model.addRow(rowData);
        }
        
        table.setModel(model);

        if (table.getRowCount() > 0) {
            table.setRowSelectionInterval(0, 0);
        }
    }
    
    public void RenderChart(JPanel pnl_chart, String aID, String HRID) throws ClassNotFoundException, SQLException {
        CategoryDataset ds = createDataset(aID, HRID); //gets data set

        JFreeChart chart = ChartFactory.createStackedAreaChart("", "", "", ds); //creates chart
        //sets the various colours
        chart.setBackgroundPaint(new Color(255,153,153)); 
        chart.setBorderVisible(false);
        chart.setBorderPaint(new Color(54, 63, 73));
        chart.getCategoryPlot().setBackgroundPaint(new Color(54, 63, 73)); 
        chart.getCategoryPlot().setDomainGridlinePaint(new Color(54, 63, 73));
        chart.getCategoryPlot().setDomainGridlinesVisible(false);
        chart.getCategoryPlot().setOutlinePaint(new Color(54, 63, 73));
       
        ChartPanel cp = new ChartPanel(chart);
        cp.setBackground(new Color(54, 63, 73));

        pnl_chart.add(cp, BorderLayout.CENTER);
        pnl_chart.validate();

    }
    
    public CategoryDataset createDataset(String aID, String HRID) throws ClassNotFoundException, SQLException {
        int c1=0; //counters       
        int c2=0;
        
        DBConnection objDBC = new DBConnection(); //constructor
        ResultSet rs = objDBC.query("SELECT Score " +
        "FROM HorseRiderDetails INNER JOIN OtherClasses ON HorseRiderDetails.[HRID] = OtherClasses.[HRID] " +
        "WHERE HorseRiderDetails.AccountID = '"+aID+"' AND OtherClasses.HRID = '"+HRID+"' " +
        "ORDER BY Score asc;"); //query to get selected rows scores        
        ResultSet rs2 = objDBC.query("SELECT Score " +
        "FROM HorseRiderDetails INNER JOIN OtherClasses ON HorseRiderDetails.[HRID] = OtherClasses.[HRID] " +
        "WHERE HorseRiderDetails.AccountID = '"+aID+"' AND OtherClasses.HRID = '"+HRID+"' " +
        "ORDER BY Score asc;"); //query to get selected rows scores   
        
        while(rs2.next()) //determines length of resultset
        {
            c1++;
        }
        
        final double[][] data = new double[1][c1]; // declares array
        while(rs.next())
        {
            data[0][c2]= rs.getDouble("Score"); //sets data
            c2++;
        }

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "", "", data
        );
        return dataset;
    }
    
     
}
