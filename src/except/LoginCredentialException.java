/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package except;

/**
 *
 * @author Eneko
 */
public class LoginCredentialException extends Exception {

    /**
     * Creates a new instance of <code>LoginCredentialException</code> without
     * detail message.
     */
    public LoginCredentialException() {

        super("This User doesn't exist in our database, try to sign up first");
    }

    /**
     * Constructs an instance of <code>LoginCredentialException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LoginCredentialException(String msg) {
        super(msg);
    }
}
