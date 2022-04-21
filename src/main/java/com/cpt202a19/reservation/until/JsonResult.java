package com.cpt202a19.reservation.until;

import java.io.Serializable;
<<<<<<< HEAD

/** Response in Json format */
public class JsonResult<E> implements Serializable {

    private Integer state; // status code
    private String message; // Description
    private E data; // Data
    
    public JsonResult() {
        super();
    }
    
    public JsonResult(Integer state) {
        super();
        this.state = state;
    }
    
    public JsonResult(Throwable e) {
        super();
        this.message = e.getMessage();
    }
    
    public JsonResult(Integer state,E data) {
        super();
        this.state = state;
        this.data = data;
    }
    
    public Integer getState() {
        return state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public E getData() {
        return data;
    }
    
    public void setData(E data) {
        this.data = data;
    }

}
=======
//Json type 
public class JsonResult<E> implements Serializable {
    //    status code
        private Integer state;
    //    message
        private String message;
    //    data
        private E data;
    
        public JsonResult() {
            super();
        }
    
        public JsonResult(Integer state) {
            super();
            this.state = state;
        }
    
        public JsonResult(Throwable e) {
            super();
            this.message = e.getMessage();
        }
    
        public JsonResult(Integer state,E data) {
            super();
            this.state = state;
            this.data = data;
        }
    
        public Integer getState() {
            return state;
        }
    
        public void setState(Integer state) {
            this.state = state;
        }
    
        public String getMessage() {
            return message;
        }
    
        public void setMessage(String message) {
            this.message = message;
        }
    
        public E getData() {
            return data;
        }
    
        public void setData(E data) {
            this.data = data;
        }
    }
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
