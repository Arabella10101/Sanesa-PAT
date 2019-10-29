
package DATA;

public class RiderDetails {
    private String RiderID;
    private String RiderName;
    private String RiderSurname;
    private String School;
    private String AccountID;

    public RiderDetails() {
    //constructor
    }

    public RiderDetails(String RID, String RN, String RS, String Sc, String AcID) {
    //constructor with all fields    
        RiderID = RID;
        RiderName = RN;
        RiderSurname = RS;
        School = Sc;
        AccountID = AcID;
    }

    public RiderDetails(String RN, String RS, String Sc, String AcID) {
    //constructor with name, surname, school and account id    
        RiderName = RN;
        RiderSurname = RS;
        School = Sc;
        AccountID = AcID;
    }
    
    //accessor and mutator methods for all fields
    
    public String getRiderID() {
        return RiderID;
    }

    public void setRiderID(String RiderID) {
        this.RiderID = RiderID;
    }

    public String getRiderName() {
        return RiderName;
    }

    public void setRiderName(String RiderName) {
        this.RiderName = RiderName;
    }

    public String getRiderSurname() {
        return RiderSurname;
    }

    public void setRiderSurname(String RiderSurname) {
        this.RiderSurname = RiderSurname;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    @Override
    public String toString() {
        return "RiderDetails{" + "RiderID=" + RiderID + " RiderName=" + RiderName + ", RiderSurname=" + RiderSurname + ", School=" + School + ", AccountID=" + AccountID + '}';
    }
    
    
}
