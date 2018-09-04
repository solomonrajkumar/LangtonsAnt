import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void shouldReturnTrueWhenMaxRowSizeIsNotExceeded() {
        Position position = new Position(5, 5);
        boolean actualResultWhenRowSizeNotExceeded = position.isValidRow(10);
        assertEquals("should Return True When MaxRowSize Is Not Exceeded", true, actualResultWhenRowSizeNotExceeded);
    }

    @Test
    public void shouldReturnFalseWhenMaxRowSizeIsExceeded() {
        Position position = new Position(5, 5);
        boolean actualResultWhenRowSizeExceeded = position.isValidRow(5);
        assertEquals("should Return False When MaxRowSize Is Exceeded", false, actualResultWhenRowSizeExceeded);
    }

    @Test
    public void shouldReturnTrueWhenMaxColumnSizeIsNotExceeded() {
        Position position = new Position(5, 5);
        boolean actualResultWhenColumnSizeExceeded = position.isValidColumn(10);
        assertEquals("should Return True When MaxColumnSize Is Not Exceeded", true, actualResultWhenColumnSizeExceeded);
    }

    @Test
    public void shouldReturnFalseWhenMaxColumnSizeIsExceeded() {
        Position position = new Position(5, 5);
        boolean actualResultWhenColumnSizeExceeded = position.isValidColumn(5);
        assertEquals("should Return False When MaxColumnSize Is Exceeded", false, actualResultWhenColumnSizeExceeded);
    }

    @Test
    public void shouldReturnValidTopPositionWhenAntMovesUp() {
        Position currentPosition = new Position(5, 5);
        Position newPosition = currentPosition.up();
        Position expectedPosition = new Position(4, 5);
        assertEquals("should return valid top position when ant moves up", true, newPosition.equals(expectedPosition));
    }

    @Test
    public void shouldReturnValidRightPositionWhenAntMovesRight() {
        Position currentPosition = new Position(5, 5);
        Position newPosition = currentPosition.right();
        Position expectedPosition = new Position(5, 6);
        assertEquals("should return valid right position when ant moves right", true, newPosition.equals(expectedPosition));
    }

    @Test
    public void shouldReturnValidBottomPositionWhenAntMovesDown() {
        Position currentPosition = new Position(5, 5);
        Position newPosition = currentPosition.down();
        Position expectedPosition = new Position(6, 5);
        assertEquals("should return valid bottom position when ant moves down", true, newPosition.equals(expectedPosition));
    }

    @Test
    public void shouldReturnValidLeftPositionWhenAntMovesLeft() {
        Position currentPosition = new Position(5, 5);
        Position newPosition = currentPosition.left();
        Position expectedPosition = new Position(5, 4);
        assertEquals("should return valid left position when ant moves left", true, newPosition.equals(expectedPosition));
    }


}