package com.cpt202a19.reservation.controller.ex;


<<<<<<< HEAD
/** 
 * Base class for file upload related exceptions
 * @exception/throws RuntimeException
 */
public class FileUploadException extends RuntimeException {

=======
/** 文件上传相关异常的基类 */
public class FileUploadException extends RuntimeException {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    public FileUploadException() {
        super();
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUploadException(Throwable cause) {
        super(cause);
    }

    protected FileUploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
<<<<<<< HEAD
    
=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
}