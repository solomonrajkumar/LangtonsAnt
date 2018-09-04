package direction;

import org.junit.Test;

import static org.junit.Assert.*;

public class EastDirectionTest {

    @Test
    public void shouldReturnNorthWhenTurnLeftInvoked() {
        EastDirection eastDirection = new EastDirection();
        Direction actualDirection = eastDirection.turnLeft();
        assertEquals("should return north when turn left is invoked", Direction.NORTH, actualDirection);
    }

    @Test
    public void shouldReturnSouthWhenTurnRightInvoked() {
        EastDirection eastDirection = new EastDirection();
        Direction actualDirection = eastDirection.turnRight();
        assertEquals("should return south when turn right is invoked", Direction.SOUTH, actualDirection);
    }

}