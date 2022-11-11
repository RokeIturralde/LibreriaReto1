package logic.objects.message.types;

/**
 * @author dani y roke
 */

public enum ResponseType {
    OK,
    LOGIN_CREDENTIAL_ERROR,
    SERVER_ERROR,
    DATABASE_ERROR,
    USER_ERROR,
    EMAIL_EXISTS_ERROR,
    LOGIN_EXISTS_ERROR,
    SERVER_CAPACITY_ERROR,
    NOT_REGISTERED_ERROR
}
