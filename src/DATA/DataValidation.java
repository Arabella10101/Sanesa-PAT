
package DATA;

public class DataValidation {
    
   public boolean testforAlphabets(String st)
    {
        boolean tf=true;      
        for (int i = 0; i < st.length(); i++) 
        {
            int ordval=(int) st.toLowerCase().charAt(i);
            if (!(ordval<=122 && ordval>=97)) 
            {
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
   
   public boolean testNumbers(String num)
    {
        boolean tf=true;
        String h=num;
        for (int i = 0; i < h.length(); i++) 
        {
            int ordval=(int) h.charAt(i);
            if (!(ordval<=57 && ordval>=48)) 
            {
                tf=false;
            }
        }
        return tf;
    }
   
   public boolean check()
   {
       return true;
   }
}
