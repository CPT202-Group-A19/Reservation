package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Illegal access exception
 * @exception/throws ServiceException
 */
public class AccessDeniedException extends ServiceException {

=======
/* 非法访问的异常 */
public class AccessDeniedException extends ServiceException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public AccessDeniedException() {
    }

    public AccessDeniedException(String message) {
        super(message);
    }

    public AccessDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessDeniedException(Throwable cause) {
        super(cause);
    }

    public AccessDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

}
=======
}
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
