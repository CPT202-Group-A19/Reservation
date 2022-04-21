package com.cpt202a19.reservation.controller.ex;

<<<<<<< HEAD
/**
 * Throw exception whhen file state goes wrong
 * @exception/throws FileUploadException
 */
public class FileStateException extends FileUploadException {

=======
public class FileStateException extends FileUploadException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public FileStateException() {
        super();
    }

    public FileStateException(String message) {
        super(message);
    }

    public FileStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileStateException(Throwable cause) {
        super(cause);
    }

    protected FileStateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD
    
=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}
