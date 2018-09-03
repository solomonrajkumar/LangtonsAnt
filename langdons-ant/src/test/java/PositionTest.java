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


}