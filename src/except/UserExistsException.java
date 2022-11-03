/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package except;

/**
 *
 * @author 2dam
 */
public class UserExistsException extends Exception {

    /**
     * Creates a new instance of <code>UserExistsException</code> without detail
     * message.
     */
    public UserExistsException() {
        super("The Login or the Email is already in use\nTry with a different one");
    }

    /**
     * Constructs an instance of <code>UserExistsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserExistsException(String msg) {
        super(msg);
    }
}
