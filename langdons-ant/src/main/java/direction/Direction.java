package direction;

public abstract class Direction {
    public static final Direction NORTH = new NorthDirection();
    public static final Direction SOUTH = new SouthDirection();
    public static final Direction WEST = new WestDirection();
    public static final Direction EAST = new EastDirection();

    public abstract Direction turnLeft();
    public abstract Direction turnRight();

}
