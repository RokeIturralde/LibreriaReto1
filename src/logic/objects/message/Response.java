package logic.objects.message;

import java.io.Serializable;

import logic.objects.User;
import logic.objects.message.types.ResponseType;

/**
 * @author dani
 */

public class Response implements Serializable {
    private User user;
    private ResponseType responseType;

    /**
     * @param user User to be sent
     * @param responseType status of the operation
     */
    
    public Response(User user, ResponseType responseType) {
        this.user = user;
        this.responseType = responseType;
    }

    /**
     * empty constructor
     */

    public Response() {}
    
    // Getters.
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    // Setters.
    public ResponseType getResponseType() {
        return responseType;
    }
    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }
}
