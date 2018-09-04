package direction;

public class WestDirection extends Direction {
    @Override
    public Direction turnLeft() {
        return SOUTH;
    }

    @Override
    public Direction turnRight() {
        return NORTH;
    }
}
