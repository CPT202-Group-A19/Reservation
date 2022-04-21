package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Throw exception when user data does not exist
 * @exception/throws ServiceException
 */
public class UserNotFoundException extends ServiceException {

=======
//用户数据不存在的异常
public class UserNotFoundException extends ServiceException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }

    protected UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
