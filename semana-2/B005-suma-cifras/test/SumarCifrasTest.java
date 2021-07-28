
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import b005.*;

public class SumarCifrasTest {

    @Test
    public void suma1CifraTest() {
        int expected = 4;
        assertEquals(expected, SumaCifras.sumarCifras(4));
    }

    @Test
    public void suma2CifrasTest() {
        int expected = 4;
        assertEquals(expected, SumaCifras.sumarCifras(22));
    }

    @Test
    public void suma3CirfasTest() {
        int expected = 6;
        assertEquals(expected, SumaCifras.sumarCifras(123));
    }

    @Test
    public void suma4CifrasTest() {
        int expected = 6;
        assertEquals(expected, SumaCifras.sumarCifras(1239));
    }

    @Test
    public void suma7CifrasTest() {
        int expected = 7;
        assertEquals(expected, SumaCifras.sumarCifras(1111111));
    }
    
    
    @Test
    public void obtengo4Cifras() {
        int expected = 4;
        assertEquals(expected, SumaCifras.obtenerCantidadCifras(1111));
    }
}
