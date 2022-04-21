package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Password verification failed exception
 * @exception/throws ServiceException
 */
public class PasswordNotMatchException extends ServiceException {

=======
// 密码验证失败的异常
public class PasswordNotMatchException extends ServiceException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public PasswordNotMatchException() {
        super();
    }

    public PasswordNotMatchException(String message) {
        super(message);
    }

    public PasswordNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotMatchException(Throwable cause) {
        super(cause);
    }

    protected PasswordNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD
    
=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
