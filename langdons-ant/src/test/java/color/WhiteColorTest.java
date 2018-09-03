package color;

import org.junit.Test;

import static org.junit.Assert.*;

public class WhiteColorTest {

    @Test
    public void shouldReturnBlackWhenFlipped() {
        WhiteColor whiteColor = new WhiteColor();
        CellColor actualColorReturned = whiteColor.flip();
        assertEquals("Should return Black when flipped", CellColor.BLACK, actualColorReturned);
    }
    @Test
    public void shouldNotReturnWhiteWhenFlipped() {
        WhiteColor whiteColor = new WhiteColor();
        CellColor actualColorReturned = whiteColor.flip();
        assertNotEquals("Should return White when flipped", CellColor.WHITE, actualColorReturned);
    }

}