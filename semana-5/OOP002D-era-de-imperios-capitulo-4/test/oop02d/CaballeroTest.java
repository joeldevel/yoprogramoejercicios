package oop02d;

import oop02d.Posicion;
import oop02d.Caballero;
import oop02d.Unidad;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaballeroTest {

    Caballero c1, c2, c3, c4;

    @Before
    public void setUp() {
        c1 = new Caballero(new Posicion(0, 0));
        c2 = new Caballero(new Posicion(0.5, 0));
        c3 = new Caballero(new Posicion(0, 2));
        c4 = new Caballero(new Posicion(0, -5));
    }
    
    @Test
    public void caballeroHeredaDeUnidadTest() {
        assertTrue(Unidad.class.isAssignableFrom(c1.getClass()));
    }
    
    @Test
    public void caballeroAtacaYDaniaEnemigoEnRangoAtaque() {
        assertTrue(c1.atacar(c3));
        assertEquals(70, c3.getSalud(),0);
    }
    
    @Test
    public void caballeroNoAtacaNiDaniaEnemigoFueraDeRandoAtaque() {
        assertFalse(c1.atacar(c2));
        assertEquals(100, c2.getSalud(),0);
        
        assertFalse(c1.atacar(c4));
        assertEquals(100, c4.getSalud(),0);
    }

}
