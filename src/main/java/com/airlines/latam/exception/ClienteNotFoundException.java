package com.airlines.latam.exception;

public class ClienteNotFoundException extends Exception{
    private  String cliente;

    public static ClienteNotFoundException createWith(String username) {
        return new ClienteNotFoundException(username);
    }

    public ClienteNotFoundException(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String getMessage() {
        return "Cliente '" + cliente + "' not found";
    }
}
