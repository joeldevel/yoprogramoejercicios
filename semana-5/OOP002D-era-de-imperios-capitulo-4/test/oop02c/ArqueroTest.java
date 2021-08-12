package oop02c;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArqueroTest {

    Arquero a1, a2, a3, a4;

    @Before
    public void setUp() {
        a1 = new Arquero(new Posicion(0, 0));
        a2 = new Arquero(new Posicion(0, 4));
        a3 = new Arquero(new Posicion(10, 0));
        a4 = new Arquero(new Posicion(30, 10));
    }

    @Test
    public void arqueroHeredaDeUnidadTest() {
        assertTrue(Unidad.class.isAssignableFrom(a1.getClass()));
    }

    @Test
    public void arqueroAtacaYDaniaEnemigoEnRangoAtaque() {
        assertTrue(a1.atacar(a3));
        assertEquals(93, a3.getSalud(), 0);
    }

    @Test
    public void arqueroNoAtacaNiDaniaEnemigoFueraDeRandoAtaque() {
        assertFalse(a1.atacar(a2));
        assertEquals(100, a2.getSalud(), 0);

        assertFalse(a1.atacar(a4));
        assertEquals(100, a4.getSalud(), 0);
    }

}
