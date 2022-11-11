package except;

/**
 * exception thrown when the login
 * already exists in the database.
 * @author dani
 */

public class LoginExistsException extends Exception {

    public LoginExistsException() {
        super("The Login introduced already exists\nTry another Login");
    }

    /**
     * @param msg the detail message.
     */
    public LoginExistsException(String msg) {
        super(msg);
    }
}