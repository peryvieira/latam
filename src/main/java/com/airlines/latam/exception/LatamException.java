package com.airlines.latam.exception;

import com.airlines.latam.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class LatamException<T> {

    @ExceptionHandler(value = {ClienteException.class})
    protected ResponseEntity<Response<T>> handleClienteException(ClienteException exception){
        Response<T> response = new Response<>();
        response.addErrorMsgToResponse(exception.getLocalizedMessage());

        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(response);
    }

}
