package com.airlines.latam.exception;

public class ClienteException extends Exception {

    private static final long serialVersionUID = -6443362632495638948L;

    public ClienteException(){
        super();
    }

    public ClienteException(String msg){
        super(msg);
    }

    public ClienteException(String msg, Throwable cause){
        super(msg, cause);
    }
}
