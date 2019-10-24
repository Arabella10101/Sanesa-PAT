
package DATA;

import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class DataValidation {
    DATA.UseRiderDetails objURD;
    DBConnection objDBCon; 
    
   public boolean testforAlphabets(String word, String fieldsName, JLabel lblErrorMessage) //tests if 'word' contains only letters
    {
        boolean tf=true;      
        for (int i = 0; i < word.length(); i++) 
        {
            int ordval=(int) word.toLowerCase().trim().charAt(i);
            if (!(ordval<=122 && ordval>=97)) 
            {
                lblErrorMessage.setText(fieldsName+"  cannot contain numbers or special characters"); // error message
                tf=false;
            }              
        }       
        return tf;       
    } 
   
   public boolean testNumbers(String num, String fieldsName, JLabel lblErrorMessage) // tests if 'number' conatains only numbers
    {
        boolean tf=true;
        String h=num;
        for (int i = 0; i < h.length(); i++) 
        {
            int ordval=(int) h.charAt(i);
            if (!(ordval<=57 && ordval>=48)) 
            {
                lblErrorMessage.setText(fieldsName+" must be a number"); 
                tf=false;
            }
        }
        return tf;        
    }
   
   
   
   public boolean testPresence(String word, String fieldsName, JLabel lblErrorMessage) //tests if 'word' is blank
   {
       boolean tf =true;
       
       if (word.contentEquals("")) 
       {
           lblErrorMessage.setText(fieldsName+" cannot be blank");
           tf=false;
       }
       
       return tf;
   }
   
   public boolean testInDatabase(String word, String fieldsName, JLabel lblErrorMessage, String errorMessage) throws SQLException, ClassNotFoundException 
   {
        boolean tf =true;
        DBConnection objDBCon= new DBConnection();
        ResultSet exists = objDBCon.query("SELECT Username FROM AccountDetails WHERE AccountID='"+ word +"'"); 
        
        if (exists.next()==false)
        {
            lblErrorMessage.setText(fieldsName+errorMessage);
            tf=false; 
       }

        return tf;
   }
           
   public int textValidation(String word, String fieldsName, JLabel lblErrorMessage)
   {
       int validCounter=0;
       
       if (testPresence(word, fieldsName, lblErrorMessage)==true) 
       {
       validCounter++;    
       }       
       if (testforAlphabets(word, fieldsName, lblErrorMessage)==true) 
       {
        validCounter++;   
       }       
       return validCounter;
   }
   
   public int numberValidation(String num, String fieldsName, JLabel lblErrorMessage)
   {
       int validCounter=0;
       if (testPresence(num, fieldsName, lblErrorMessage)==true) 
       {
       validCounter++;    
       }
       if (testNumbers(num, fieldsName, lblErrorMessage)==true) 
       {
       validCounter++;    
       }
       return validCounter;
   }
}
