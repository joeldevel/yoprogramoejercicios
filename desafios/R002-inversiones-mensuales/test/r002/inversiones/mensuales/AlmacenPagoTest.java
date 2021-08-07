package r002.inversiones.mensuales;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import r002.inversiones.mensuales.*;

public class AlmacenPagoTest {

    AlmacenPago almacen;

    @Before
    public void setUp() {
        almacen = new AlmacenPago();
    }

    @Test
    public void valorFuturoTest() {
        assertEquals(1268.2417945625455, almacen.calcularVFPeriodo(1000, 0.24, 1), 0);
    }

    @Test
    public void mostrarValorFuturo4PeriodosTest() {
        almacen.mostrarVF(1000, 0.24, 4);
        System.out.println("---");
//        almacen.mostrarVF(1000,  0.71355714, 5);
    }

    @Test
    public void mesesParaObtener2000Dado1000Y7PorcientoInteres() {
        assertEquals(120, (int) almacen.minimoMesesVF(1000, 0.07, 2000), 0);
    }

    @Test
    public void mesesParaObtener2587Dado1000Y24PorcientoInteres() {
        assertEquals(48, (int) almacen.minimoMesesVF(1000, 0.24, 2587), 0);
    }

}
