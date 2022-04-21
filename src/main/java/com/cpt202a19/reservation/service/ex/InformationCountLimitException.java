package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * The number of exceptions reached the upper limit
 * @exception/throws ServiceException
 */
public class InformationCountLimitException extends ServiceException{

=======
/* 数量达到上限的异常 */
public class InformationCountLimitException extends ServiceException{
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public InformationCountLimitException() {
        super();
    }

    public InformationCountLimitException(String message) {
        super(message);
    }

    public InformationCountLimitException(String message, Throwable cause) {
        super(message, cause);
    }

    public InformationCountLimitException(Throwable cause) {
        super(cause);
    }

    protected InformationCountLimitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

}
=======
}
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
