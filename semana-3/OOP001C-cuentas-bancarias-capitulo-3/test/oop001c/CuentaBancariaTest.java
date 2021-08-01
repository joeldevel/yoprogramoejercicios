package oop001c;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaBancariaTest {

    Cuenta cuenta1, cuenta2;
    double delta = 0.001;

    @Before
    public void setUp() {
        cuenta1 = new Cuenta();
        cuenta2 = new Cuenta();
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
    
    @Test
    public void puedeTransferirSiHaySaldoSuficiente() {
        cuenta1.ingresarDinero(10000);
        assertTrue(cuenta1.transferir(550, cuenta2));
        assertEquals(9450, cuenta1.getSaldo(), delta);
        assertEquals(550, cuenta2.getSaldo(), delta);
    }
}
