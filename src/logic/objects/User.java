package logic.objects;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class User implements Comparable<User>, Serializable {

    private int ID;
    private String login;
    private String email;
    private String fullName;
    private String password;
    private Timestamp lastPasswordChange;
    private UserStatus status;
    private UserPrivilege privilege;
    private List<Timestamp> lastLogins;

    public User(String pLogin, String pPassword) {
        login = pLogin;
        password = pPassword;
    }

    public User() {

    }

    public User(
            int pID,
            String pLogin,
            String pEmail,
            String pFullName,
            String pPassword,
            Timestamp pLastPasswordChange,
            int pStatus,
            int pPrivilege,
            List<Timestamp> pLastLogins) {
       
        ID = pID;
        login = pLogin;
        email = pEmail;
        fullName = pFullName;
        password = pPassword;
        lastPasswordChange = pLastPasswordChange;
        lastLogins = pLastLogins;
                

        status
                = (pStatus == 1) ? UserStatus.ENABLED : UserStatus.DISABLED;
        privilege
                = (pPrivilege == 1) ? UserPrivilege.ADMIN : UserPrivilege.USER;
    }

    public User(
            int pID,
            String pLogin,
            String pEmail,
            String pFullName,
            String pPassword,
            Timestamp pLastPasswordChange,
            UserStatus pStatus,
            UserPrivilege pPrivilege,
            List<Timestamp> pLastLogins) {

        this.ID = pID;
        this.login = pLogin;
        this.email = pEmail;
        this.fullName = pFullName;
        this.password = pPassword;
        this.lastPasswordChange = pLastPasswordChange;
        this.status = pStatus;
        this.privilege = pPrivilege;
        this.lastLogins = pLastLogins;
    }

    // Getters.
    public int getID() {
        return ID;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    public UserStatus getStatus() {
        return status;
    }

    public UserPrivilege getPrivilege() {
        return privilege;
    }

    public List<Timestamp> getLastLogins() {
        return lastLogins;
    }

    // Setters
    public void setID(int iD) {
        ID = iD;
    }

    public void setLogin(String pLogin) {
        login = pLogin;
    }

    public void setEmail(String pEmail) {
        email = pEmail;
    }

    public void setFullName(String pFullName) {
        fullName = pFullName;
    }

    public void setPassword(String pPassword) {
        password = pPassword;
    }

    public void setLastPasswordChange(Timestamp pLastPasswordChange) {
        lastPasswordChange = pLastPasswordChange;
    }

    public void setStatus(UserStatus pStatus) {
        status = pStatus;
    }

    public void setPrivilege(UserPrivilege pPrivilege) {
        privilege = pPrivilege;
    }

    public void setLastLogins(List<Timestamp> pLastLogins) {
        lastLogins = pLastLogins;
    }

    private String lastLoginString() {
        String ls = "";
        if (lastLogins == null)
            return "There are no last logins.";

        lastLogins
                .stream()
                .forEach(t -> ls.concat("\n" + t.toString()));
        return ls;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) 
            return false;

        User usr = (User) obj;
        return login.equals(usr.getLogin())
                && email.equals(usr.getEmail())
                && privilege.equals(usr.getPrivilege());
    }

    @Override
    public int compareTo(User usr) {
        return ID - usr.getID();
    }

    @Override
    public String toString() {
        String lastPasswordString = "null";
        if (lastPasswordChange != null)
            lastPasswordString += lastPasswordChange.toString();

        return "ID: " + ID
                + "\nLogin: " + login
                + "\nEmail: " + email
                + "\nFull Name: " + fullName
                + "\nLast password change: " + lastPasswordString
                + "\nStatus: " + status
                + "\nPrivilege: " + privilege
                + "\nLast login: " + lastLoginString();
    }
}
