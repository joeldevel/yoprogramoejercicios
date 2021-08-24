package vehiculos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MotocicletaTest {

    Motocicleta moto;

    @Before
    public void setUp() {
        moto = new Motocicleta("ABC123");
    }

    @Test
    public void puedeAgregarAcompanianteTest() {
        assertTrue(moto.agregarAcompaniante(new Acompaniante("pepe")));
    }

    @Test
    public void noPuedeAgregarAcompanianteTest() {
        assertTrue(moto.agregarAcompaniante(new Acompaniante("pepe")));
        assertFalse(moto.agregarAcompaniante(new Acompaniante("pepe")));
    }
    
    @Test
    public void puedeCambiarChoferMultiplesVecesTest() {
        assertTrue(moto.cambiarChofer(new Chofer("pepe", 1)));
        assertTrue(moto.cambiarChofer(new Chofer("juan", 100)));
        assertTrue(moto.cambiarChofer(new Chofer("camila", 10)));
        assertTrue(moto.agregarAcompaniante(new Acompaniante("pepe")));
    }
    
    @Test
    public void noPuedeCambiarChoferCuandoLlevaAcompanianteTest() {
        assertTrue(moto.agregarAcompaniante(new Acompaniante("pepe")));
        assertFalse(moto.cambiarChofer(new Chofer("pepe", 1)));
    }

}
