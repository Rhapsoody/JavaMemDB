package database.shape;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This is the class which will represent a table in the database
 * */

public class Table {
    /*Table name */
    private final String table;

    /*Number of columns  */
    private int nbColumns;

    /*  A table is a matrix with rows and columns
    => we will use a List of list to represent it
     */
    private List<List<String>> tableStructure;

    /*
    * To identify the columns of the database
    * we're going to use a map to associate a key (column name)
    * with a value (an instance of the column class)
    */

    private Map<String, TableColumn> columns;

    public Table(String name, Map<String, TableColumn> column){
        this.table = name;
        this.columns = column;
        this.tableStructure = new ArrayList<>();
    }

    /*Getters and Setters */

    public String getTableName(){
        return this.table;
    }

    public int getNumberOfColumns(){
        return this.nbColumns;
    }

    public Map<String, TableColumn> getColumn() {
        return columns;
    }

    public List<List<String>> getTableStructure() {
        return tableStructure;
    }

    public void setDatabaseColumn(Map<String, TableColumn> databaseColumns){
        this.columns = databaseColumns;
    }

    public void setNumberOfColumns(int number){
        this.nbColumns = number;
    }

    /*
    *TODO: printing the cells of the matrix
    */


}
