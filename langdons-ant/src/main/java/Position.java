public class Position {
    private final int rowIndex;
    private final int columnIndex;

    public Position(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public int row() {
        return this.rowIndex;
    }

    public int column() {
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

    public Position up() {
        return new Position(this.row() - 1, this.column());
    }

    public Position down() {
        return new Position(this.row() + 1, this.column());
    }

    public Position left() {
        return new Position(this.row(), this.column() - 1);
    }

    public Position right() {
        return new Position(this.row(), this.column() + 1);
    }

    @Override
    public boolean equals(Object object) {
        if(object == this) {
            return true;
        }

        if(!(object instanceof Position)) {
            return false;
        }

        Position position = (Position) object;
        return this.rowIndex == position.rowIndex && this.columnIndex == position.columnIndex;
    }

}
