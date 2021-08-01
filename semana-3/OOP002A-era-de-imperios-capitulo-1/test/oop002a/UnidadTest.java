
package oop002a;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UnidadTest {
    
    Unidad unidad1, unidad2;
    
    @Before
    public void setUp() {
        unidad1 = new Unidad(new Posicion(0,0));
        unidad2 = new Unidad(new Posicion(1,1));
    }
    
    @Test
    public void distanciaEntreUnidadesOK() {
        assertEquals(Math.sqrt(2), unidad1.distanciaCon(unidad2),0);
    }
            

}
