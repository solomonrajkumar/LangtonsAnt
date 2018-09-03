package color;

public abstract class CellColor {

    public static CellColor BLACK = new BlackColor();
    public static CellColor WHITE = new WhiteColor();

    public abstract CellColor flip();
}
