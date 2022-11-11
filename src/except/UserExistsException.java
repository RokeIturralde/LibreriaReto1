package except;

/**
 * @author roke
 */

public class UserExistsException extends Exception {

    public UserExistsException() {
        super("The Login or the Email is already in use\nTry with a different one");
    }

    /**
     * @param msg the detail message.
     */
    public UserExistsException(String msg) {
        super(msg);
    }
}
