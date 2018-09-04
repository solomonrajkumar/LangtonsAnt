package direction;

public class NorthDirection extends Direction {
    @Override
    public Direction turnLeft() {
        return WEST;
    }

    @Override
    public Direction turnRight() {
        return EAST;
    }
}
