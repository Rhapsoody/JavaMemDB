package database.exceptions;

public class ColumnNotFoundException extends RuntimeException {
    public ColumnNotFoundException(){
        super("The column already exists !!");
    }
}
