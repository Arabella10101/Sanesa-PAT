
package DATA;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class DataValidation {
    DATA.UseRiderDetails objURD;
    DBConnection objDBCon;

   public boolean testforAlphabets(String word, String fieldsName, JLabel lblErrorMessage)
    {
        boolean tf=true;      
        for (int i = 0; i < word.length(); i++) 
        {
            int ordval=(int) word.toLowerCase().trim().charAt(i);
            if (!(ordval<=122 && ordval>=97)) 
            {
                lblErrorMessage.setText(fieldsName+"  cannot contain numbers or "
                    + "special characters");
                tf=false;
            }              
        }       
        return tf;       
    } 
   
   public boolean mfcheck(boolean m,boolean f)
    {
        boolean tf=true;
        if (m==false && f==false) 
        {
            tf=false;
        }
        return tf;
    }
   
   public boolean testNumbers(String num, String fieldsName, JLabel lblErrorMessage)
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
   
   
   
   public boolean testPresence(String word, String fieldsName, JLabel lblErrorMessage)
   {
       boolean tf =true;
       
       if (word.contentEquals("")) 
       {
           lblErrorMessage.setText(fieldsName+" cannot be blank");
           tf=false;
       }
       
       return tf;
   }
   
   public boolean testInDatabase(String word, String fieldsName, JLabel lblErrorMessage)
   {
        boolean tf =true;
        
        try {
            ResultSet exists = objDBCon.query("SELECT Username FROM AccountDetails WHERE AccountID='"+ word +"'");     
            System.out.println("worked");
        } catch (SQLException ex) {
            Logger.getLogger(DataValidation.class.getName()).log(Level.SEVERE, null, ex);
            lblErrorMessage.setText(fieldsName+" must be a valid ID");
            System.out.println("fail");
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
       else
       {
       if (testforAlphabets(word, fieldsName, lblErrorMessage)==true) 
       {
        validCounter++;   
       }
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
       if (testNumbers(num, fieldsName, lblErrorMessage)) 
       {
       validCounter++;    
       }
       return validCounter;
   }
}
