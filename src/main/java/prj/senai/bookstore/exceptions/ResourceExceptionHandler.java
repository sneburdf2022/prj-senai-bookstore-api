package prj.senai.bookstore.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.ServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjetNotFoundException.class)
    public ResponseEntity<StandarError> objecNotFoundException(ObjetNotFoundException e, ServletRequest request){
        StandarError error = new StandarError(System.currentTimeMillis(),HttpStatus.NOT_FOUND.value(),
                e.getMessage()); 
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandarError> dataIntegrityViolationException(DataIntegrityViolationException e, ServletRequest request){
        StandarError error = new StandarError(System.currentTimeMillis(),HttpStatus.BAD_REQUEST.value(),
                e.getMessage()); 
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
