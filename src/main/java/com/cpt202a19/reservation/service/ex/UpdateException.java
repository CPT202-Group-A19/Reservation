package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Unknown exception while updating data
 * @exception/throws ServiceException
 */
public class UpdateException extends ServiceException{

=======
//更新数据时产生的未知的异常
public class UpdateException extends ServiceException{
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public UpdateException() {
        super();
    }

    public UpdateException(String message) {
        super(message);
    }

    public UpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateException(Throwable cause) {
        super(cause);
    }

    protected UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
