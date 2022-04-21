package com.cpt202a19.reservation.controller.ex;

<<<<<<< HEAD
/**
 * Throw exception when file size is not within the specified range
 * @exception/throws FileUploadException
 */
public class FileSizeException extends FileUploadException {

=======
public class FileSizeException extends FileUploadException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public FileSizeException() {
        super();
    }

    public FileSizeException(String message) {
        super(message);
    }

    public FileSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileSizeException(Throwable cause) {
        super(cause);
    }

    protected FileSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD
    
=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
