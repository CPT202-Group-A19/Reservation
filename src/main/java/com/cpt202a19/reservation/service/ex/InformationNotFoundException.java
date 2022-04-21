package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Throw exception when information does not exist
 * @exception/throws ServiceException
 */
public class InformationNotFoundException extends ServiceException{

=======
/* Inforamtion数据不存在的异常 */
public class InformationNotFoundException extends ServiceException{
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public InformationNotFoundException() {
    }

    public InformationNotFoundException(String message) {
        super(message);
    }

    public InformationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public InformationNotFoundException(Throwable cause) {
        super(cause);
    }

    public InformationNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
