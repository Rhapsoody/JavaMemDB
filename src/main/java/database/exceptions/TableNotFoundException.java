package database.exceptions;

public class TableNotFoundException extends RuntimeException {
    public TableNotFoundException(){
        super("The table doesn't exist !!");
    }
}
