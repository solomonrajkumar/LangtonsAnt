package color;

public class BlackColor extends CellColor {

    @Override
    public CellColor flip() {
        return CellColor.WHITE;
    }
}
