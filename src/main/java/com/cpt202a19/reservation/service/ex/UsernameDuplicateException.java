package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Username occupancy exception
 * @exception/throws ServiceException
 */
=======
//用户名占用异常
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
public class UsernameDuplicateException extends ServiceException {

    public UsernameDuplicateException() {
        super();
    }

    public UsernameDuplicateException(String message) {
        super(message);
    }

    public UsernameDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameDuplicateException(Throwable cause) {
        super(cause);
    }

    protected UsernameDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
