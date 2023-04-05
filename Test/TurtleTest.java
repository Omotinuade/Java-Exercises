import turtlePackage.Position;
import turtlePackage.Turtle;
import org.junit.jupiter.api.Test;

import static turtlePackage.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle ijapa= new Turtle();
    @Test
    public void testThatTurtleCanMovePenDownTest(){
        assertTrue(ijapa.penIsUp());

        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
    }
@Test
    public void turtleCanMovePenUpTest(){
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());

        ijapa.penUp();
        assertTrue(ijapa.penIsUp());
}

@Test
    public void turtleCanTurnRightWhileFacingEastTest(){
        assertSame(ijapa.getCurrentDirection(), EAST);
        ijapa.turnRight();

        assertSame(SOUTH, ijapa.getCurrentDirection());
}
    @Test
    public void turtleCanTurnRightWhileFacingSouthTest(){
        ijapa.turnRight();
        assertSame(ijapa.getCurrentDirection(),SOUTH);
        ijapa.turnRight();

        assertSame(WEST, ijapa.getCurrentDirection());
    }
//todo add turn right
    @Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        assertSame(ijapa.getCurrentDirection(),EAST);
        ijapa.turnLeft();

        assertSame(NORTH, ijapa.getCurrentDirection());
    }
    // todo add turn left east, west, south
    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertSame(ijapa.getCurrentDirection(), EAST);
        assertEquals(new Position(0,0), ijapa.getPosition());

        ijapa.moveForward(5);
        assertEquals(new Position(0,5), ijapa.getPosition());

    }
}
