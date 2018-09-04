package direction;

import org.junit.Test;

import static org.junit.Assert.*;

public class SouthDirectionTest {

    @Test
    public void shouldReturnEastWhenTurnLeftInvoked() {
        SouthDirection southDirection = new SouthDirection();
        Direction actualDirection = southDirection.turnLeft();
        assertEquals("should return east when turn left is invoked", Direction.EAST, actualDirection);
    }

    @Test
    public void shouldReturnWestWhenTurnRightInvoked() {
        SouthDirection southDirection = new SouthDirection();
        Direction actualDirection = southDirection.turnRight();
        assertEquals("should return west when turn right is invoked", Direction.WEST, actualDirection);
    }

}