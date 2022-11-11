package logic.objects;

import java.sql.Timestamp;

/**
 * @author dani
 */

public class SignIn {
    private Timestamp lastSignIn;

    // Getters.
    public Timestamp getLastSignIn() {
        return this.lastSignIn;
    }

    // Setters.
    public void setLastSignIn(Timestamp lastSignIn) {
        this.lastSignIn = lastSignIn;
    }
}
