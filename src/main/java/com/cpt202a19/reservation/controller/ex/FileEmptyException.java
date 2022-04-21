package com.cpt202a19.reservation.controller.ex;

<<<<<<< HEAD
/**
 * Throw exception when file is empty
 * @exception/throws FileUploadException
 */
public class FileEmptyException extends FileUploadException{

=======
public class FileEmptyException extends FileUploadException{
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public FileEmptyException() {
        super();
    }

    public FileEmptyException(String message) {
        super(message);
    }

    public FileEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileEmptyException(Throwable cause) {
        super(cause);
    }

    protected FileEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD
    
=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
