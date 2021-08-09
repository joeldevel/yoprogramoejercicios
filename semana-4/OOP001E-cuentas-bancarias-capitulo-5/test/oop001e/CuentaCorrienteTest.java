package oop001e;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    
    CuentaCorriente cuenta1, cuenta2;
    @Before
    public void setUp() {
        cuenta2 = new CuentaCorriente(10000, 3000);
    }
    
    @Test
    public void crearCuentaConDescubierto() {
        assertNotNull(cuenta2);
    }
    
    @Test
    public void puedeGastarMasDelSaldo() {
//        cuenta1 = new CuentaCorriente(10000, 3000);
        assertEquals(0, cuenta2.retirarDinero(12000), 0);
        assertEquals(1000, cuenta2.getDescubierto(), 0);
        
    }

}
