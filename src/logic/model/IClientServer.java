package logic.model;

import except.EmailExistsException;
import except.LoginCredentialException;
import except.LoginExistsException;
import except.ServerException;
import logic.objects.User;
import logic.objects.message.Response;

/**
 * this interface is implemented by the SQL
 * reader class at server side (DBReaderImplementation) 
 * and also by the server connector at client side.
 * @author dani
 */

public interface IClientServer {

    /**
     * @param pUser a User with the login and the password value
     * @return a Response with all the User object and a ResponseType value
     * @throws LoginCredentialException the login value is not found on the database
     * @throws ServerException the server is not opened
     */

    public Response signIn(User pUser) throws 
        LoginCredentialException, ServerException;

    /**
     * @param pUser a user with the login,email,fullName and password values
     * @return a Response with a User and a ResponseType value
     * @throws ServerException the Server is not opened
     */

    public Response signUp(User pUser) throws
        ServerException, LoginExistsException, EmailExistsException;
}
