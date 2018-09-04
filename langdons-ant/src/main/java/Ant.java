import direction.Direction;

public class Ant {

    public Cell currentCell;
    public Direction currentDirection;

    public Ant(Cell currentCell, Direction currentDirection) {
        this.currentCell = currentCell;
        this.currentDirection = currentDirection;
    }

    public void move() {
        // check for cell color and move right/left

        // flip cell color
        currentCell.cellColor.flip();

    }
}
