package DATA;


public class User {
    private String AccountID;
    private String Username;
    private String Password;
    private boolean Admin;
    private String Email;

    public User() 
    {
    }

    public User(String id, String un, String pw, String em, boolean adm) {
        AccountID = id;
        Username = un;
        Password = pw;
        Admin = adm;
        Email = em;
    }

    public User(String Username, String Password, String Email, boolean Admin) {
        this.Username = Username;
        this.Password = Password;
        this.Admin = Admin;
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean getAdmin() {
        return Admin;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    @Override
    public String toString() {
        return "User{" + "AccountID=" + AccountID + ", Username=" + Username + ", Password=" + Password + ", Admin=" + Admin + '}';
    }
    
    
    
}
