package oop02c;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaballeroTest {

    Caballero c1, c2, c3, c4;

    @Before
    public void setUp() {
        c1 = new Caballero(new Posicion(0, 0));
        c2 = new Caballero(new Posicion(0.5, 0));
        c2 = new Caballero(new Posicion(0, 2));
        c4 = new Caballero(new Posicion(0, -5));
    }
    
    @Test
    public void caballeroHeredaDeUnidadTest() {
        assertTrue(Unidad.class.isAssignableFrom(c1.getClass()));
    }

}
