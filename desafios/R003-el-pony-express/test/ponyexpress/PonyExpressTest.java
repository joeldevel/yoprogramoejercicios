package ponyexpress;

import org.junit.Test;
import static org.junit.Assert.*;

public class PonyExpressTest {

    @Test
    public void ponyTest() {
        assertEquals(1, PonyExpress.caballos(new int[]{18, 15}));
        assertEquals(2, PonyExpress.caballos(new int[]{43, 23, 40, 13}));
        assertEquals(3, PonyExpress.caballos(new int[]{33, 8, 16, 47, 30, 30, 46}));
        assertEquals(3, PonyExpress.caballos(new int[]{51, 51, 51}));
        assertEquals(4, PonyExpress.caballos(new int[]{6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
        assertEquals(3, PonyExpress.caballos(new int[]{100, 30, 100}));
        assertEquals(4, PonyExpress.caballos(new int[]{90, 90, 20, 90}));
        assertEquals(0, PonyExpress.caballos(new int[]{}));
        assertEquals(0, PonyExpress.caballos(new int[]{0,0,0,0,0,0}));
        assertEquals(1, PonyExpress.caballos(new int[]{100}));        
        assertEquals(1, PonyExpress.caballos(new int[]{10,10,10,10,10,10,10,10,10,10}));

    }

}
