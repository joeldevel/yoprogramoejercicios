package sumarstrings;

import org.junit.Test;
import static org.junit.Assert.*;

public class sumarStringsTest {

    @Test
    public void devuelveCeroSiArrayEstaVacioTest() {
        String[] s = {};
        assertEquals(0, SumaStrings.sumar(s), 0);
    }

    @Test
    public void sumaUnElementoTest() {
        String[] s = {"1"};
        assertEquals(1, SumaStrings.sumar(s), 0);
    }

    @Test
    public void sumaDosElementosTest() {
        String[] s = {"1", "2"};
        assertEquals(3, SumaStrings.sumar(s), 0);
    }

    @Test
    public void sumaElementosConFormatoInvalidoTest() {
        String[] s = {"1", "2", "trois", "banana"};
        assertEquals(3, SumaStrings.sumar(s), 0);
    }

    @Test
    public void sumaElementosConPuntoTest() {
        String[] s = {"1.0", "2.0", "1.0"};
        assertEquals(4, SumaStrings.sumar(s), 0);
    }

    @Test
    public void sumaElementosConYSinPuntoTest() {
        String[] s = {"1.0", "2", "1.0", "0"};
        assertEquals(4, SumaStrings.sumar(s), 0);
    }

    @Test
    public void sumaNegativosTest() {
        String[] s = {"1", "2", "3.0", "-1", "-2.0"};
        assertEquals(3, SumaStrings.sumar(s), 0);
    }

}
