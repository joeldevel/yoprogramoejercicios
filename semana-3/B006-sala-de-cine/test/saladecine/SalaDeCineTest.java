package saladecine;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import saladecine.SalaDeCine;

public class SalaDeCineTest {

    SalaDeCine sala;

    @Before
    public void setUp() {
        sala = new SalaDeCine(16, 4);
    }

    @Test
    public void salaCreadaNoEsNullTest() {
        assertNotNull(sala);
    }

    @Test
    public void alCrearLaSalaLosAsientosEstanDesocupadosTest() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                assertFalse(sala.butacaEstaOcupada(i, j));
            }
        }
        assertEquals(0, sala.getOcupadas());
    }

    @Test
    public void sePuedeOcuparUnAsiento() {
        sala.ocupar(0, 0);
        assertEquals(1, sala.getOcupadas());
        assertTrue(sala.butacaEstaOcupada(0, 0));
    }

    @Test
    public void noSePuedeOcuparUnAsientoOcupado() {
        sala.ocupar(0, 0);
        assertEquals(1, sala.getOcupadas());
        assertTrue(sala.butacaEstaOcupada(0, 0));
        sala.ocupar(0, 0);
        assertEquals(1, sala.getOcupadas());
        assertTrue(sala.butacaEstaOcupada(0, 0));
    }
    
    @Test
    public void sePuedeOcuparYDesocuparUnAsiento() {
        sala.ocupar(0, 0);
        assertEquals(1, sala.getOcupadas());
        assertTrue(sala.butacaEstaOcupada(0, 0));
        sala.desocupar(0, 0);
        assertEquals(0, sala.getOcupadas());
        assertFalse(sala.butacaEstaOcupada(0, 0));
    }

}
