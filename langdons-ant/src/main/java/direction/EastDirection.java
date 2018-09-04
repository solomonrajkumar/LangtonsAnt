package direction;

public class EastDirection extends Direction {
    @Override
    public Direction turnLeft() {
        return NORTH;
    }

    @Override
    public Direction turnRight() {
        return SOUTH;
    }
}
