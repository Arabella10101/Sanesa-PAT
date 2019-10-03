
package DATA;



public class OtherClasses {
    private String ClassID2;
    private String HRID;
    private double Score;
    private int Placing;
    private String Status;
    private String Qualifier;

    public OtherClasses() {
    }

    public OtherClasses(String CID2, String hrc, double Sc, int Pl, String Stat, String Q) {
        ClassID2 = CID2;
        HRID = hrc;
        Score = Sc;
        Placing = Pl;
        Status = Stat;
        Qualifier = Q;
    }

    public String getClassID2() {
        return ClassID2;
    }

    public void setClassID2(String ClassID2) {
        this.ClassID2 = ClassID2;
    }

    public String getHRID() {
        return HRID;
    }

    public void setHRID(String HRID) {
        this.HRID = HRID;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double Score) {
        this.Score = Score;
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
        return "OtherClasses{" + "ClassID2=" + ClassID2 + ", HRID=" + HRID + ", Score=" + Score + ", Placing=" + Placing + ", Status=" + Status + ", Qualifier=" + Qualifier + '}';
    }
    
    
    
    
            
}
