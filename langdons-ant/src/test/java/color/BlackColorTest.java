package color;

import org.junit.Test;

import static org.junit.Assert.*;

public class BlackColorTest {

    @Test
    public void shouldReturnWhiteWhenFlipped() {
        BlackColor blackColor = new BlackColor();
        CellColor actualColorReturned = blackColor.flip();
        assertEquals(CellColor.WHITE, actualColorReturned);
    }
    @Test
    public void shouldNotReturnBlackWhenFlipped() {
        BlackColor blackColor = new BlackColor();
        CellColor actualColorReturned = blackColor.flip();
        assertNotEquals(CellColor.BLACK, actualColorReturned);
    }


}