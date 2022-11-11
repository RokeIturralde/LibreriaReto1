package logic.objects;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dani
 */

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

    /**
     * constructor used in client, only credentials
     * @param login username
     * @param password user "secret" password
     */

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {}

    /**
     * constructor with all the parameters.
     * @param status is an integer, meaning 1 enabled,
     * 0 or something else disabled
     * @param privilege is an integer, meaning 1 administrator,
     * 0 or something else disabled
     */

    public User(
            int ID,
            String login,
            String email,
            String fullName,
            String password,
            Timestamp lastPasswordChange,
            int status,
            int privilege,
            List<Timestamp> lastLogins) {
       
        this.ID = ID;
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.lastPasswordChange = lastPasswordChange;
        this.setLastLogins(lastLogins);
                
        this.status
                = (status == 1) ? UserStatus.ENABLED : UserStatus.DISABLED;
        this.privilege
                = (privilege == 1) ? UserPrivilege.ADMIN : UserPrivilege.USER;
    }

    /**
     * complete constructor with every parameter.
     */
    
    public User(
            int ID,
            String login,
            String email,
            String fullName,
            String password,
            Timestamp lastPasswordChange,
            UserStatus status,
            UserPrivilege privilege,
            List<Timestamp> lastLogins) {

        this.ID = ID;
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.lastPasswordChange = lastPasswordChange;
        this.status = status;
        this.privilege = privilege;
        setLastLogins(lastLogins);
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

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    public void setLastLogins(List<Timestamp> lastLogins) {
        if (lastLogins == null)
               lastLogins = new ArrayList <> ();
        
        lastLogins.sort((t1, t2) -> 
                t1.compareTo(t2));
                
        if (10 < lastLogins.size())
            for (int i = 0; 10 < lastLogins.size(); i++) 
                lastLogins.remove(i);

        this.lastLogins = lastLogins;
    }

    /**
     * @return every login date
     * concatenated in a single String.
     */

    private String lastLoginString() {
        String ls = "";
        if (lastLogins == null)
            return "There are no last logins.";

        lastLogins
                .stream()
                .forEach(t -> ls.concat("\n" + t.toString()));
        return ls;
    }

    /**
     * @return true if the login, email and type of user
     * are equals, false if not
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) 
            return false;

        User usr = (User) obj;
        return login.equals(usr.getLogin())
                && email.equals(usr.getEmail())
                && privilege.equals(usr.getPrivilege());
    }

    /**
     * @return comparison of users.
     * compares the users by their login
     */

    @Override
    public int compareTo(User usr) {
        return this.login.compareTo(usr.getLogin());
    }

    /**
     * @return String with al the user data (used only for testing)
     */

    @Override
    public String toString() {
       return "ID: " + this.ID
                + "\nLogin: " + this.login
                + "\nEmail: " + this.email
                + "\nFull Name: " + this.fullName
                + "\nLast password change: " + this.lastPasswordChange
                + "\nStatus: " + this.status
                + "\nPrivilege: " + this.privilege
                + "\nLast login: " + lastLoginString();
    }
}
