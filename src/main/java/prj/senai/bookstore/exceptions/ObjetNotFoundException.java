package prj.senai.bookstore.exceptions;

public class ObjetNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ObjetNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjetNotFoundException(String message) {
        super(message);
    }

    
}
