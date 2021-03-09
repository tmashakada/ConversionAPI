/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wonderlabz.conversionapi.exception;

import java.time.LocalDateTime;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
     @ExceptionHandler(Exception.class)
      public final ResponseEntity<RestException> handleAllExceptions(Exception ex, WebRequest request) {
                     RestException restException=new RestException();
                     restException.setTimestamp(LocalDateTime.now());
                     restException.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
                     restException.setMessage(ex.getLocalizedMessage());
                     restException.setDebugmsg(ex.getMessage());
                     restException.setPath(request.getDescription(false));
      return new ResponseEntity<>(restException, HttpStatus.INTERNAL_SERVER_ERROR);
     }
       @Override
     public final ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ServletWebRequest servletWebRequest = (ServletWebRequest) request;
      
        String error = "Malformed JSON request";
      RestException restException=new RestException();
                     restException.setTimestamp(LocalDateTime.now());
                      restException.setStatus( HttpStatus.BAD_REQUEST.toString());
                     restException.setMessage(error);
                     restException.setDebugmsg(ex.getMessage());
                     restException.setPath(request.getDescription(false));
     
        
   
        return new ResponseEntity<>(restException, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
     public final ResponseEntity<Object> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex,
                                                                      WebRequest request) {
       

                 RestException restException=new RestException();
                     restException.setTimestamp(LocalDateTime.now()); 
                     restException.setStatus(HttpStatus.BAD_REQUEST.toString());
                     restException.setMessage(String.format("The parameter '%s' of value '%s' could not be converted to type '%s'", ex.getName(), ex.getValue(), ex.getRequiredType().getSimpleName()));
                     restException.setDebugmsg(ex.getMessage());
                     restException.setPath(request.getDescription(false));
        return new ResponseEntity<>(restException, HttpStatus.BAD_REQUEST);
    }
      @Override
    protected ResponseEntity<Object>  handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                 HttpHeaders headers,
                                   HttpStatus status, WebRequest request) {
                     RestException restException=new RestException();
                     restException.setTimestamp(LocalDateTime.now());
                     restException.setStatus( "BAD_REQUEST");
                     restException.setMessage("Validation error");
                     restException.setDebugmsg(ex.getMessage());
                     restException.setPath(request.getDescription(false));
        
          return new ResponseEntity<>( restException, HttpStatus.BAD_REQUEST);
        
    }
     @Override
    public final  ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
        HttpStatus status, WebRequest request) {
                  RestException restException=new RestException();
                     restException.setTimestamp(LocalDateTime.now());
                     restException.setStatus( "BAD_REQUEST");
                     restException.setMessage(String.format("Could not find the %s method for URL %s", ex.getHttpMethod(), ex.getRequestURL()));
                     restException.setDebugmsg(ex.getMessage());
                     restException.setPath(request.getDescription(false));
    return new ResponseEntity<>(restException, HttpStatus.BAD_REQUEST);
}
}
