package prj.senai.bookstore.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 1l;

    private String fildName;
    private String message;
    
    public FieldMessage() {
        super();
    }
    public FieldMessage(String fildName, String message) {
        super();
        this.fildName = fildName;
        this.message = message;
    }
    public String getFildName() {
        return fildName;
    }
    public void setFildName(String fildName) {
        this.fildName = fildName;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    

}
