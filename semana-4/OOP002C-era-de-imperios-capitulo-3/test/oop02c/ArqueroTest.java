package oop02c;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArqueroTest {
    
    Arquero a1, a2, a3, a4;
    
    @Before
    public void setUp() {
        a1 = new Arquero(new Posicion(0,0));
        a2 = new Arquero(new Posicion(0,0));
        a3 = new Arquero(new Posicion(0,0));
        a4 = new Arquero(new Posicion(0,0));
    }
    
    @Test
    public void arqueroHeredaDeUnidadTest() {
        assertTrue(Unidad.class.isAssignableFrom(a1.getClass()));
    }


}
