import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import oop001a.*;

public class CuentaBancariaTest {

    Cuenta cuenta1;
    double delta = 0.001;

    @Before
    public void setUp() {
        cuenta1 = new Cuenta();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void creaCuentaNoEsNull() {
        assertNotNull(cuenta1);
    }

    @Test
    public void alCreaCuentaElSaldoEs0() {
        assertEquals(0.0, cuenta1.getSaldo(), delta);
    }

    @Test
    public void ingreso100YSaldoEs100() {
        cuenta1.ingresarDinero(100);
        assertEquals(100.0, cuenta1.getSaldo(), delta);
    }

    @Test
    public void ingreso100Saco100YSaldoEs0() {
        cuenta1.ingresarDinero(100);
        cuenta1.retirarDinero(100);
        assertEquals(0.0, cuenta1.getSaldo(), delta);
    }

    @Test
    public void ingreso100Saco50YSaldoEs50() {
        cuenta1.ingresarDinero(100);
        cuenta1.retirarDinero(50);
        assertEquals(50.0, cuenta1.getSaldo(), delta);
    }
    
    @Test(expected = Error.class) 
    public void tiraErrorAlIntentarIngresarCantidadNegativa() {
        cuenta1.ingresarDinero(-1);
    }
    
    @Test(expected = Error.class) 
    public void tiraErrorAlIntentarRetirarCantidadNegativa() {
        cuenta1.retirarDinero(-1);
    }
    
    @Test(expected = Error.class) 
    public void tiraErrorAlIntentarRetirarCantidadMayorAlSaldo() {
        cuenta1.retirarDinero(1);
    }
}
