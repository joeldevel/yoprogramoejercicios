package oop02d;

import oop02d.Posicion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PosicionTest {

    Posicion pos1, pos2;

    @Before
    public void setUp() {
        pos1 = new Posicion(0, 0);
        pos2 = new Posicion(1, 1);
    }

    @Test
    public void distanciaEntrePosicionesOK() {
        assertEquals(Math.sqrt(2), pos1.distanciaCon(pos2), 0);
    }
}
