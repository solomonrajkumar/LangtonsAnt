public class Position {
    private final int rowIndex;
    private final int columnIndex;

    public Position(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    private int row() {
        return this.rowIndex;
    }

    private int column() {
        return this.columnIndex;
    }

    public boolean isValidRow(int maxRowSize) {
        if(  row() >= 0 && row() < maxRowSize ){
            return true;
        }
        return false;
    }

    public boolean isValidColumn(int maxColumnSize) {
        if( column() >= 0 && column() < maxColumnSize ){
            return true;
        }
        return false;
    }
}
