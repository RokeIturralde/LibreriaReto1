package logic.objects.message;

import java.io.Serializable;

import logic.objects.User;
import logic.objects.message.types.RequestType;

/**
 * object that contains a user and a petition,
 * sent by the client and received by the server.
 * @author dani
 */

public class Request implements Serializable {

    private User user;
    private RequestType requestType;

    /**
     * @param user user to be sent
     * @param requestType operation to be executed
     */

    public Request(User user, RequestType requestType) {
        this.user = user;
        this.requestType = requestType;
    }

    /**
     * empty constructor
     */
    
    public Request() {}

    // Getters.
    public User getUser() {
        return user;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    // Setters.
    public void setUser(User user) {
        this.user = user;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }
}
