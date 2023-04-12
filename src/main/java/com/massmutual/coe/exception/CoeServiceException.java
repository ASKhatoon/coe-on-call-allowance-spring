package com.massmutual.coe.exception;

public class CoeServiceException extends Exception{

    public CoeServiceException(String message){
        super(message);
    }

    public CoeServiceException(String message, Throwable cause){
        super(message, cause);
    }

    public CoeServiceException(Throwable cause){
        super(cause);
    }
}
