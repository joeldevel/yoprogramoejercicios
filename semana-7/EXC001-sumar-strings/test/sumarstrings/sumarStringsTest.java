package sumarstrings;

import org.junit.Test;
import static org.junit.Assert.*;

public class sumarStringsTest {

    @Test
    public void devuelveCeroSiArrayEstaVacioTest() {
        String[] s = {};
        assertEquals(0,SumaStrings.sumar(s),0);
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

}