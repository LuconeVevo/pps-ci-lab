import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBrick {

    private Brick brick = new Brick(10, 20);
    private Brick squareBrick = new Brick(10, 10);

    @Test
    public void testBrick() {
        assertEquals(20, brick.getLength());
    }

    @Test
    public void testCanContainBrick() {
        assertTrue(brick.canContain(squareBrick));
    }


}
