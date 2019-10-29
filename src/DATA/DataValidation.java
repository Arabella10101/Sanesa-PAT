
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
    
   public boolean testforAlphabets(String word, String fieldsName, JLabel lblErrorMessage) 
    /*tests if 'word' contains only letters returns true if 'word' is all letters or false if not
      parameters passed - word, data entered by the user 
                        - fieldsName, name of the field
                        - lblErrorMessage, label that the error message will be set too           
    */     
    {
        boolean tf=true;      
        for (int i = 0; i < word.length(); i++) 
        {
            int ordval=(int) word.toLowerCase().trim().charAt(i);
            if (!(ordval<=122 && ordval>=97)) //determines if the ASCII value of the char is not between the range and is therefore not a letter
            {
                lblErrorMessage.setText(fieldsName+"  cannot contain numbers or special characters"); // error message
                tf=false;
            }              
        }       
        return tf; //returns true or false       
    } 
   
   public boolean testNumbers(String num, String fieldsName, JLabel lblErrorMessage) 
    /* tests if 'num' contains only numbers returns true if 'num' is all numbers or false if not
       parameters passed- number, data entered by the user 
                        - fieldsName, name of the field
                        - lblErrorMessage, label that the error message will be set too  
    */
    {
        boolean tf=true;
        for (int i = 0; i < num.length(); i++) 
        {
            int ordval=(int) num.trim().charAt(i);
            if (!(ordval<=57 && ordval>=48)) //determines if the ASCII value of the char is not between the range and is therefore not a number
            {
                lblErrorMessage.setText(fieldsName+" must be a number"); // error message
                tf=false;
            }
        }
        return tf; //returns true or false       
    }
   
   
   
   public boolean testPresence(String word, String fieldsName, JLabel lblErrorMessage) 
   /*tests if 'word' is blank
      parameters passed - word, data entered by the user 
                        - fieldsName, name of the field
                        - lblErrorMessage, label that the error message will be set too        
   */
   {
       
       boolean tf =true;       
       if (word.contentEquals("")) 
       {
           lblErrorMessage.setText(fieldsName+" cannot be blank"); // error message
           tf=false;
       }
       
       return tf; //returns true or false
   }
   
   public boolean testInDatabase(String word, String fieldsName, JLabel lblErrorMessage, String errorMessage) throws SQLException, ClassNotFoundException 
   /* tests if 'word' is present in database
      parameters passed - word, data entered by the user 
                        - fieldsName, name of the field
                        - lblErrorMessage, label that the error message will be set too      
   */
   {       
        boolean tf =true;
        DBConnection objDBCon= new DBConnection(); //constructor 
        ResultSet exists = objDBCon.query("SELECT Username FROM AccountDetails WHERE AccountID='"+ word +"'"); //sql query to select username where 'word' = to AccountID
        
        if (exists.next()==false) //if there is no data in the result set it will return false therfore indicating that 'word' is not a valid account ID
        {
            lblErrorMessage.setText(fieldsName+errorMessage); //error message
            tf=false; 
       }

        return tf; //returns true or false
   }
           
   public int textValidation(String word, String fieldsName, JLabel lblErrorMessage) 
    /*validation for text
      parameters passed - word, data entered by the user 
                        - fieldsName, name of the field
                        - lblErrorMessage, label that the error message will be set too 
    */
   {
       int validCounter=0; //counter to keep track of if the fields data is valid for both testPresence and testforAlphabets
       
       if (testPresence(word, fieldsName, lblErrorMessage)==true) 
       {
       validCounter++;    
       }       
       if (testforAlphabets(word, fieldsName, lblErrorMessage)==true) 
       {
        validCounter++;   
       }       
       return validCounter; //returns total validCounter
   }
   
   public int numberValidation(String num, String fieldsName, JLabel lblErrorMessage) 
    /*validation for number
      parameters passed - num , data entered by the user 
                        - fieldsName, name of the field
                        - lblErrorMessage, label that the error message will be set too 
    */
   {
       int validCounter=0; //counter to keep track of if the fields data is valid for both testPresence and testNumbers
       if (testPresence(num, fieldsName, lblErrorMessage)==true) 
       {
       validCounter++;    
       }
       if (testNumbers(num, fieldsName, lblErrorMessage)==true) 
       {
       validCounter++;    
       }
       return validCounter; //returns total validCounter
   }
}
