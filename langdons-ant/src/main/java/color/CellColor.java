package color;

public abstract class CellColor {

    public static final CellColor BLACK = new BlackColor();
    public static final CellColor WHITE = new WhiteColor();

    public abstract CellColor flip();
}
