package oop001d;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaDeAhorrosTest {

    CuentaDeAhorros cuenta1;

    @Before
    public void setUp() {
        cuenta1 = new CuentaDeAhorros();
    }

    @Test
    public void creaCuentaDeAhorroYCargaSaldoTest() {
        cuenta1.ingresarDinero(1000);
        assertEquals(1000, cuenta1.getSaldo(),0);
    }
    
    @Test
    public void ahorra500Test() {
        cuenta1.ingresarDinero(1000);
        assertEquals(1000, cuenta1.getSaldo(),0);
        cuenta1.setSaldoAhorro(500);
        assertEquals(500, cuenta1.getSaldo(), 0);
        assertEquals(500, cuenta1.getSaldoAhorro(), 0);
        assertEquals(1000, cuenta1.getSaldoAhorro()+cuenta1.getSaldo(),0);      
    }
    
    @Test
    public void reintegroCajaAhorro() {
        cuenta1.ingresarDinero(20000);
        cuenta1.setSaldoAhorro(10000);
        assertEquals(10000, cuenta1.getSaldo(), 0);
        assertEquals(10000, cuenta1.getSaldoAhorro(), 0);
        cuenta1.liberarSaldoAhorro();
        assertEquals(20000, cuenta1.getSaldo(), 0);
        assertEquals(0, cuenta1.getSaldoAhorro(), 0);     
    }

}
