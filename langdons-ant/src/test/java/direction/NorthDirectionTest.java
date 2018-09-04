package direction;

import org.junit.Test;

import static org.junit.Assert.*;

public class NorthDirectionTest {

    @Test
    public void shouldReturnWestWhenTurnLeftInvoked() {
        NorthDirection  northDirection = new NorthDirection();
        Direction actualDirection = northDirection.turnLeft();
        assertEquals("should return west when turn left is invoked", Direction.WEST, actualDirection);
    }

    @Test
    public void shouldReturnEastWhenTurnRightInvoked() {
        NorthDirection  northDirection = new NorthDirection();
        Direction actualDirection = northDirection.turnRight();
        assertEquals("should return east when turn right is invoked", Direction.EAST, actualDirection);
    }

}