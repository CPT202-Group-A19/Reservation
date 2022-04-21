package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Business layer exception base class
 * @exception/throws RuntimeException
 */
public class ServiceException extends RuntimeException {

=======
//业务层异常基类 throw new ServiceException()
public class ServiceException extends RuntimeException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public ServiceException() {
        super();
    }
    
<<<<<<< HEAD
    /** often used */
=======
    //often used
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public ServiceException(String message) {
        super(message);
    }

<<<<<<< HEAD
    /** often used */
=======
    //often used
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
