package saladecine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import saladecine.Butaca;

public class ButacaTest {

    Butaca butaca;

    @Before
    public void setUp() {
        butaca = new Butaca();
    }

    @Test
    public void creaButacatNotNullTest() {
        assertNotNull(butaca);
    }

    @Test
    public void butacaCreadaNoEstaOcupadaTest() {
        assertFalse(butaca.estaOcupada());
    }

    @Test
    public void sePuedeOcuparButacaDesocupadaTest() {
        assertFalse(butaca.estaOcupada());
        assertTrue(butaca.ocupar());
        assertTrue(butaca.estaOcupada());
    }

    @Test
    public void noSePuedeOcuparButacaOcupadaTest() {
        assertFalse(butaca.estaOcupada());
        assertTrue(butaca.ocupar());
        assertFalse(butaca.ocupar());
        assertTrue(butaca.estaOcupada());
    }

    @Test
    public void sePuedeDesocuparButacaOcupadaTest() {
        assertFalse(butaca.estaOcupada());
        assertTrue(butaca.ocupar());
        assertTrue(butaca.estaOcupada());
        assertTrue(butaca.desocupar());
        assertFalse(butaca.estaOcupada());
    }

    @Test
    public void noSePuedeDesocuparButacaDesocupadaTest() {
        assertFalse(butaca.estaOcupada());
        assertTrue(butaca.ocupar());
        assertTrue(butaca.estaOcupada());
        assertTrue(butaca.desocupar());
        assertFalse(butaca.desocupar());
        assertFalse(butaca.estaOcupada());
    }

}
