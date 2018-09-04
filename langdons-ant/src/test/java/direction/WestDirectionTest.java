package direction;

import org.junit.Test;

import static org.junit.Assert.*;

public class WestDirectionTest {

    @Test
    public void shouldReturnSouthWhenTurnLeftInvoked() {
        WestDirection westDirection = new WestDirection();
        Direction actualDirection = westDirection.turnLeft();
        assertEquals("should return south when turn left is invoked", Direction.SOUTH, actualDirection);
    }

    @Test
    public void shouldReturnNorthWhenTurnRightInvoked() {
        WestDirection westDirection = new WestDirection();
        Direction actualDirection = westDirection.turnRight();
        assertEquals("should return north when turn right is invoked", Direction.NORTH, actualDirection);
    }

}