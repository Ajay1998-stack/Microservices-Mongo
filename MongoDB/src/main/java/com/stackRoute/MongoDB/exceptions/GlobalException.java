package com.stackRoute.MongoDB.exceptions;

import com.stackRoute.MongoDB.exceptions.TrackAlreadyExistsException;
import com.stackRoute.MongoDB.exceptions.TrackNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler({TrackAlreadyExistsException.class})
    public ResponseEntity<?> handleTrackAlreadyExistsException(TrackAlreadyExistsException exception){
            return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
    }
    @ExceptionHandler({TrackNotFoundException.class})
    public ResponseEntity<?> handleTrackNotFoundException(TrackNotFoundException exception){
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<?> handleException(Exception exception){
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.CONFLICT);
    }
}

