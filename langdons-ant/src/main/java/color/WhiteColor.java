package color;

public class WhiteColor extends CellColor {

    @Override
    public CellColor flip() {
        return CellColor.BLACK;
    }
}
