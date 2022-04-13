package database.shape;

/*This class will describe a Column of the database*/

public class TableColumn {
    private final String columnName;
    private final int index;

    public TableColumn(String columnname, int index){
        this.columnName = columnname;
        this.index = index;
    }

    public String getColumnName() {
        return columnName;
    }

    public int getIndex() {
        return index;
    }
}


