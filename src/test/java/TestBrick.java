import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestBrick {

    private Brick brick;
    private Brick squareBrick;
    private Brick smallBrick;

    @BeforeEach
    void setUp() {
        brick = new Brick(10, 20);
        squareBrick = new Brick(10, 10);
        smallBrick = new Brick(5, 5);
    }

    @Test
    public void testGetWidth() {
        assertEquals(10, brick.getWidth());
    }

    @Test
    public void testGetLength() {
        assertEquals(20, brick.getLength());
    }

    @Test
    public void testGetArea() {
        assertEquals(200, brick.getArea());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(60, brick.getPerimeter());
    }

    @Test
    public void testCanContainTrue() {
        assertTrue(brick.canContain(squareBrick));
    }

    @Test
    public void testCanContainFalse() {
        assertFalse(squareBrick.canContain(brick));
    }

    @Test
    public void testCanContainEqualSize() {
        Brick same = new Brick(10, 10);
        assertTrue(squareBrick.canContain(same));
    }

    @Test
    public void testCanContainSmallBrick() {
        assertTrue(squareBrick.canContain(smallBrick));
    }

    @Test
    public void testToStringContainsWidth() {
        String result = brick.toString();
        assertTrue(result.contains("w: 10"));
    }

    @Test
    public void testToStringContainsLength() {
        String result = brick.toString();
        assertTrue(result.contains("l: 20"));
    }

    @Test
    public void testToStringFormat() {
        assertEquals("this brick has w: 10 l: 20", brick.toString());
    }
}