package vehiculos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AutobusTest {

    Autobus el60;

    @Before
    public void setUp() {
        el60 = new Autobus("ATR666");
    }

    @Test
    public void puedeAsignarChoferTest() {
        el60.asignarChofer(new Chofer("mario", 985));
        assertNotNull(el60.getChofer());
    }

    @Test
    public void puedeAgregarPasajeroTest() {
        el60.asignarChofer(new Chofer("mario", 985));
        assertNotNull(el60.getChofer());
        assertEquals(0, el60.getCantidadPasajeros());
        el60.agregarPasajero(new Pasajero("bolainas"));
        assertNotEquals(0, el60.getCantidadPasajeros());
    }
    
    @Test
    public void puedeCambiarChoferSiNoLlevaPasajeros() {
        el60.asignarChofer(new Chofer("mario", 985));
        assertEquals(0, el60.getCantidadPasajeros());
        el60.cambiarChofer(new Chofer("segismundo", 777));
        assertEquals(0, el60.getCantidadPasajeros());
        el60.cambiarChofer(new Chofer("el pibe cabeza", 120));
        assertEquals(0, el60.getCantidadPasajeros());
    }
    
    @Test
    public void noPuedeCambiarChoferSiLlevaPasajeros() {
        el60.asignarChofer(new Chofer("mario", 985));
        assertEquals(0, el60.getCantidadPasajeros());
        el60.agregarPasajero(new Pasajero("firulais"));
        el60.agregarPasajero(new Pasajero("chipi tapia"));
        assertFalse(el60.cambiarChofer(new Chofer("segismundo", 777)));
        assertEquals("mario", el60.getChofer().getNombre());
        assertNotEquals(0, el60.getCantidadPasajeros());
        assertFalse(el60.cambiarChofer(new Chofer("el pibe cabeza", 120)));
        assertNotEquals(0, el60.getCantidadPasajeros());
        assertEquals("mario", el60.getChofer().getNombre());
    }

}
