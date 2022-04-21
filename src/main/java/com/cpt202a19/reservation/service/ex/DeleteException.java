package com.cpt202a19.reservation.service.ex;

<<<<<<< HEAD
/**
 * Exception for failure to delete data
 * @exception/throws ServiceException
 */
public class DeleteException extends ServiceException {

=======
/** 删除数据失败的异常 */
public class DeleteException extends ServiceException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public DeleteException() {
    }

    public DeleteException(String message) {
        super(message);
    }

    public DeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteException(Throwable cause) {
        super(cause);
    }

    public DeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
