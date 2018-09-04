package direction;

public class SouthDirection extends Direction {
    @Override
    public Direction turnLeft() {
        return EAST;
    }

    @Override
    public Direction turnRight() {
        return WEST;
    }
}
