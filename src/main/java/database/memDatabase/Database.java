package database.memDatabase;

/*This class represent the database itself*/

import database.shape.Table;
import database.shape.TableColumn;

import java.util.HashMap;
import java.util.Map;

public class Database {
    /*A database is a collection of tables*/
    public Map<String, Table> databaseTables;

    /*singleton*/
    private static final Database db = new Database();

    private Database() {
        databaseTables = new HashMap<>();
    }

    public static Database getDatabase () {
        return db;
    }

    /* method for creating a table*/
    public Table createTable(String name, Map<String, TableColumn> TableColumn){
        /*check if the table we're creating already exists*/


        Table createdTable = new Table(name, TableColumn);

        /*inserting the table in the map*/
        this.databaseTables.put(name, createdTable);

        return createdTable ;
    }

    /*TODO
    *  Check if a Table exists in the database and raise an exception*/







}
