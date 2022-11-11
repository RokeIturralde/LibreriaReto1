package except;

/**
 * exception thrown when the email already
 * exists in the database.
 * @author dani
 */

public class EmailExistsException extends Exception {
    
    public EmailExistsException() {
        super("The Login introduced already exists\nTry another Login");
    }

    /**
     * @param msg the detail message.
     */

    public EmailExistsException(String msg) {
        super(msg);
    }
}
