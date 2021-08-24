package oop02d;

import oop02d.Posicion;
import oop02d.Soldado;
import oop02d.Unidad;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SoldadoTest {
    
    Soldado s1, s2, s3;
    @Before
    public void setUp() {
        s1 = new Soldado(new Posicion(0,0));
        s2 = new Soldado(new Posicion(1.4,0));
        s3 = new Soldado(new Posicion(2,0));  
    }
    
    @Test
    public void soldadoHeredaDeUnidadTest() {
        assertTrue(Unidad.class.isAssignableFrom(s1.getClass()));
    }

    @Test
    public void soldadoAtacaYDaniaOponenteCercanoTest() {
        assertTrue(s1.atacar(s2));
        assertEquals(80, s2.getSalud(),0);
    }


    @Test
    public void soldadoNoAtacaYNoDaniaOponenteLejanoTest() {
        assertFalse(s1.atacar(s3));
        assertEquals(100, s3.getSalud(),0);
    }    

}
