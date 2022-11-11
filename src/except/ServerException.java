package except;

/**
 * @author roke
 */

public class ServerException extends Exception {

    public ServerException() {
        super("Error in the server side.\nTry again later.");
    }

    /**
     * @param msg the detail message.
     */
    public ServerException(String msg) {
        super(msg);
    }
}