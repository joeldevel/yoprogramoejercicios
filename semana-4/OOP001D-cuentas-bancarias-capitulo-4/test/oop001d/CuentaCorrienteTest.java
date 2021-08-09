package oop001d;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    
    CuentaCorriente cuenta1, cuenta2;
    @Before
    public void setUp() {
//        cuenta1 = new CuentaCorriente();
        cuenta2 = new CuentaCorriente(10000, 3000);
    }
    
    @Test
    public void crearCuentaConDescubierto() {
        assertNotNull(cuenta2);
    }
    
    @Test
    public void puedeGastarMasDelSaldo() {
        
    }

}
