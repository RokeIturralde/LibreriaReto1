package logic.objects;

import java.sql.Timestamp;

/**
 * class that encapsulates the timestamp (useless)
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
