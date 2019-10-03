
package DATA;


public class HorseRiderDetails {
    private String HRID;
    private String RiderID;
    private String Horsename;
    private String AccountID;

    public HorseRiderDetails() {
    }

    public HorseRiderDetails(String hrc, String RID, String hn, String AID) {
        HRID = hrc;
        RiderID = RID;
        Horsename = hn;
        AccountID = AID;
    }

    public String getHRID() {
        return HRID;
    }

    public void setHRID(String HRID) {
        this.HRID = HRID;
    }

    public String getRiderID() {
        return RiderID;
    }

    public void setRiderID(String RiderID) {
        this.RiderID = RiderID;
    }

    public String getHorsename() {
        return Horsename;
    }

    public void setHorsename(String Horsename) {
        this.Horsename = Horsename;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    @Override
    public String toString() {
        return "HorseRiderDetails{" + "HRID=" + HRID + ", RiderID=" + RiderID + ", Horsename=" + Horsename + ", AccountID=" + AccountID + '}';
    }
    
    
}
