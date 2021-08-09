package oop001e;

import org.junit.Before;
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
        assertEquals(10000, cuenta1.getSaldo(), delta);
        assertEquals(0, cuenta2.getSaldo(), delta);
        assertTrue(cuenta1.transferir(cuenta2, 550));
        assertEquals(9450, cuenta1.getSaldo(), delta);
        assertEquals(550, cuenta2.getSaldo(), delta);
    }

    @Test(expected = Error.class)
    public void noPuedeTransferirSiNoHaySaldoSuficiente() {
        cuenta1.ingresarDinero(0);
        assertTrue(cuenta1.transferir(cuenta2, 550));
        assertNotEquals(9450, cuenta1.getSaldo(), delta);
        assertNotEquals(550, cuenta2.getSaldo(), delta);
    }

    @Test
    public void cuentaRegistraTransaccionTest() {
        cuenta1.ingresarDinero(0, "hola");
        assertEquals(0, cuenta1.getRegistroDeTransacciones()[0].getMonto(), 0);
    }

    @Test
    public void cuentaRegistraTipoDeTransaccionTest() {
        cuenta1.ingresarDinero(10, "aguinaldo");
        assertEquals(10, cuenta1.getSaldo(), 0);
        assertEquals(TipoTransaccion.DEPOSITO, cuenta1.getRegistroDeTransacciones()[0].getTipo());
        assertEquals(10, cuenta1.getRegistroDeTransacciones()[0].getMonto(), 0);

        cuenta1.retirarDinero(5, "cafe jaicano");
        assertEquals(TipoTransaccion.RETIRO, cuenta1.getRegistroDeTransacciones()[1].getTipo());
        assertEquals(5, cuenta1.getSaldo(), 0);
        assertEquals(5, cuenta1.getRegistroDeTransacciones()[1].getMonto(), 0);

    }

    @Test
    public void cuentaRegistraMontoTransaccionTest() {
        cuenta1.ingresarDinero(10, "aguinaldo");
        assertEquals(10, cuenta1.getRegistroDeTransacciones()[0].getMonto(), 0);
    }

    @Test
    public void cuentaRegistraMotivoTransaccionTest() {
        cuenta1.ingresarDinero(10, "aguinaldo");
        assertEquals("aguinaldo", cuenta1.getRegistroDeTransacciones()[0].getMotivo());
    }
}
