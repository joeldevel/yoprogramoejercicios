
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
    
    
    


}
