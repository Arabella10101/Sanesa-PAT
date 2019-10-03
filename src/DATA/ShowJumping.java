
package DATA;

public class ShowJumping {
    private String ClassID;
    private String HRID;
    private int Round;
    private String Time;
    private int Placing;
    private String Status;
    private String Qualifier;

    public ShowJumping() {
    }

    public ShowJumping(String CID, String hrc, int R, String T, int Pl, String Stat, String Q) {
        ClassID = CID;
        HRID = hrc;
        Round = R;
        Time = T;
        Placing = Pl;
        Status = Stat;
        Qualifier = Q;
    }

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public String getHRID() {
        return HRID;
    }

    public void setHRID(String HRID) {
        this.HRID = HRID;
    }

    public int getRound() {
        return Round;
    }

    public void setRound(int Round) {
        this.Round = Round;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public int getPlacing() {
        return Placing;
    }

    public void setPlacing(int Placing) {
        this.Placing = Placing;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getQualifier() {
        return Qualifier;
    }

    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    @Override
    public String toString() {
        return "ShowJumping{" + "ClassID=" + ClassID + ", HRID=" + HRID + ", Round=" + Round + ", Time=" + Time + ", Placing=" + Placing + ", Status=" + Status + ", Qualifier=" + Qualifier + '}';
    }
    
    
    
}
