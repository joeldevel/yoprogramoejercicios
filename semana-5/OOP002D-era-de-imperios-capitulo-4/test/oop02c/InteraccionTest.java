package oop02c;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InteraccionTest {

    Caballero c1 = new Caballero(new Posicion(0, 10));
    Caballero c2 = new Caballero(new Posicion(5, 0));

    Arquero a1 = new Arquero(new Posicion(7, 0));

    Soldado s1 = new Soldado(new Posicion(4, 0));
    Soldado s2 = new Soldado(new Posicion(0, 0));

    @Before
    public void setUp() {
    }

    @Test
    public void miniGuerraTest() {
        assertTrue(s1.atacar(c2));
        assertEquals(80, c2.getSalud(), 0); // -20;

        assertTrue(c2.atacar(s1));
        assertEquals(70, s1.getSalud(), 0); // -30

        assertFalse(s1.atacar(a1)); // no llega 
        assertEquals(100, a1.getSalud(), 0); // igual que antes del ataque

        assertFalse(a1.atacar(s1));
        assertEquals(70, s1.getSalud(), 0); 

        assertTrue(a1.atacar(c1));
        assertEquals(93, c1.getSalud(), 0); // -7

        assertTrue(a1.atacar(s2)); // -7
        assertEquals(93, s2.getSalud(), 0);
    }
}
