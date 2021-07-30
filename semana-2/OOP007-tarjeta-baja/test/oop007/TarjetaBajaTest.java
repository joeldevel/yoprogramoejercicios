package oop007;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import oop007.*;

public class TarjetaBajaTest {

    TarjetaBaja tarjetaConSaldo, tarjetaVacia;
    double delta = 0.001;

    @Before
    public void setUp() {
        tarjetaConSaldo = new TarjetaBaja(100);
        tarjetaVacia = new TarjetaBaja(0);
    }

    @Test
    public void tarjetaCreadaConSaldo0SaldoEs0() {
        assertEquals(0.0, tarjetaVacia.obtenerSaldo(), delta);
    }

    @Test
    public void tarjetaCreadaConSaldo100SaldoEs100() {
        assertEquals(100.0, tarjetaConSaldo.obtenerSaldo(), delta);
    }

    @Test
    public void agrego100ATarjetaVaciaYSaldoEs100() {
        tarjetaVacia.cargar(100);
        assertEquals(100, tarjetaVacia.obtenerSaldo(), delta);
    }

    @Test
    public void ningunViajeTest() {
        assertEquals(0, tarjetaConSaldo.contarViajes());
        assertEquals(0, tarjetaConSaldo.contarViajesEnColectivo());
        assertEquals(0, tarjetaConSaldo.contarViajesEnSubte());
        assertEquals(0, tarjetaVacia.contarViajes());
        assertEquals(0, tarjetaVacia.contarViajesEnColectivo());
        assertEquals(0, tarjetaVacia.contarViajesEnSubte());
    }

    @Test
    public void haceUnViajeEnColectivo() {
        tarjetaConSaldo.pagarViajeEnColectivo();
        assertEquals(1, tarjetaConSaldo.contarViajesEnColectivo());
        assertEquals(100 - PrecioViaje.COLECTIVO.getPrecio(), tarjetaConSaldo.obtenerSaldo(), delta);
    }

    @Test
    public void haceUnViajeEnSubte() {
        tarjetaConSaldo.pagarViajeEnSubte();
        assertEquals(1, tarjetaConSaldo.contarViajesEnSubte());
        assertEquals(100 - PrecioViaje.SUBTE.getPrecio(), tarjetaConSaldo.obtenerSaldo(), delta);
    }

    @Test
    public void haceUnViajeEnSubteYColectivo() {
        tarjetaConSaldo.pagarViajeEnSubte();
        tarjetaConSaldo.pagarViajeEnColectivo();
        assertEquals(2, tarjetaConSaldo.contarViajes());
        double expected = 100 - PrecioViaje.SUBTE.getPrecio() - PrecioViaje.COLECTIVO.getPrecio();
        assertEquals(expected, tarjetaConSaldo.obtenerSaldo(), delta);
    }

    @Test(expected = Error.class)
    public void noPuedeViajarEnColectivoSinSaldo() {
        tarjetaVacia.pagarViajeEnColectivo();
    }

    @Test(expected = Error.class)
    public void noPuedeViajarEnSubteSinSaldo() {
        tarjetaVacia.pagarViajeEnSubte();
    }
    
    @Test
    public void cargaTarjetaYViaja5VecesEnColectivoY5EnSubte() {
        tarjetaVacia.cargar(1000);
        for(int i=0; i< 5; i++) {
            tarjetaVacia.pagarViajeEnColectivo();
            tarjetaVacia.pagarViajeEnSubte();
        }
        
        double expectedSaldo = 1000 - (PrecioViaje.SUBTE.getPrecio()+PrecioViaje.COLECTIVO.getPrecio()) *5;
        int expectedViajesEnSubte = 5;
        int expectedViajesEnColectivo = 5;
        int expectedViajesTotal = 10;
        
        assertEquals(expectedSaldo, tarjetaVacia.obtenerSaldo(), delta);
        assertEquals(expectedViajesEnColectivo, tarjetaVacia.contarViajesEnColectivo());
        assertEquals(expectedViajesEnSubte, tarjetaVacia.contarViajesEnSubte());
        assertEquals(expectedViajesTotal, tarjetaVacia.contarViajes());
    }

}
