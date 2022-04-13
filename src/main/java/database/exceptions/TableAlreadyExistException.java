package database.exceptions;

public class TableAlreadyExistException extends RuntimeException {
    public TableAlreadyExistException(){
        super("The table already exists !!");
    }
}
