package except;

/**
 * @author roke
 */
public class LoginCredentialException extends Exception {

    public LoginCredentialException() {

        super("This User doesn't exist in our database, try to sign up first");
    }

    /**
     * @param msg the detail message.
     */

    public LoginCredentialException(String msg) {
        super(msg);
    }
}
