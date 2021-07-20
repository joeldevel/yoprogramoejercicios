

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPunto {

    Punto punto;

    @Before
    public void setUp() {
        punto = new Punto(1, 1);
    }

    @Test
    public void testGetX() {
        double expected = 1.0;
        double actual = punto.getX();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testGetY() {
        double expected = 1.0;
        double actual = punto.getY();
        assertEquals(expected, actual, 1);
    }

    @Test
    public void testPunto() {
        double expectedX = 1.0;
        double expectedY = 1.0;

        double actualX = punto.getX();
        double actualY = punto.getY();
        assertEquals(expectedX, actualX, 1);
        assertEquals(expectedY, actualY, 1);
    }
}
