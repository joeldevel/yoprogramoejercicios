package r002.inversiones.mensuales;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import r002.inversiones.mensuales.*;

public class AlmacenPagoTest {

    AlmacenPago almacen;
    int c = 12;

    @Before
    public void setUp() {
        almacen = new AlmacenPago();
    }

    @Test
    public void valorFuturoTest() {
        assertEquals(0, almacen.calcularVF(0, 0, 0, c), 0);
        assertEquals(0, almacen.calcularVF(0, 10, 0, c), 0);
        assertEquals(10, almacen.calcularVF(10, 0, 0, c), 0);
        assertEquals(10, almacen.calcularVF(10, 100, 0, c), 0);
    }

    @Test
    public void valorFuturo100Interes24PorcientoTest() {
        assertEquals(1268.2417945625455, almacen.calcularVF(1000, 0.24, 1, c), 0);
    }
    
    /**
     * Guardo la salida del metodo mostrarValorFuturo y luego compara con
     * el string esperado
     * Nota: Gracias a StarkOverflow
     * https://stackoverflow.com/questions/8708342/redirect-console-output-to-string-in-java
     */
    @Test
    public void mostrarValorFuturo4PeriodosTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);        
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        almacen.mostrarVF(1000, 0.24, 4);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        System.out.println(baos.toString());
        assertEquals("1268.2418\n1608.4373\n2039.8874\n2587.0704\n", baos.toString());

        baos.reset();
        System.setOut(ps);
        almacen.mostrarVF(1000, 0.71355714, 5);
        System.out.flush();
        System.setOut(old);
        assertEquals("2000.0001\n4000.0001\n8000.0002\n16000.0005\n32000.0012\n", baos.toString());
        System.out.println(baos.toString());
    }

    // esto es para validar la salida al usuario
    // pero ya que el metodo mostrarVF es void, 
    // testeo los metodos utilizados en mostrarVF en lugar de mostrarVF
    @Test
    public void preMostrarValorFuturo4PeriodosTest() {
        double[] vf = new double[4];
        String[] sFormateada = {
            "1268.2418",
            "1608.4373",
            "2039.8874",
            "2587.0704"
        };
        vf = almacen.obtenerValoresFuturos(1000, 0.24, 4);
        for (int i = 0; i < 4; i++) {
            assertEquals(sFormateada[i], almacen.formatearSalida(vf[i]));
        }

    }

    @Test
    public void mesesParaObtener2000Dado1000Y7PorcientoInteresTest() {
        assertEquals(120, (int) almacen.minimoMesesVF(1000, 0.07, 2000), 0);
    }

    @Test
    public void mesesParaObtener2587Dado1000Y24PorcientoInteresTest() {
        assertEquals(48, (int) almacen.minimoMesesVF(1000, 0.24, 2587), 0);
    }

    @Test(expected = Error.class)
    public void mostrarVFlanzaErrorAlIngresarMontoNegativoTest() {
        almacen.mostrarVF(-1, 0, 0);
    }

    @Test(expected = Error.class)
    public void mostrarVFlanzaErrorAlIngresarInteresNegativoTest() {
        almacen.mostrarVF(0, -1, 0);
    }

    @Test(expected = Error.class)
    public void mostrarVFlanzaErrorAlIngresarPeriodoNegativoTest() {
        almacen.mostrarVF(0, 0, -1);
    }

    @Test(expected = Error.class)
    public void minimoMesesVFlanzaErrorAlIngresarMontoNegativoTest() {
        almacen.minimoMesesVF(-1, 0, 0);
    }

    @Test(expected = Error.class)
    public void minimoMesesVFlanzaErrorAlIngresarInteresNegativoTest() {
        almacen.minimoMesesVF(-1, 0, 0);
    }

    @Test(expected = Error.class)
    public void minimoMesesVFlanzaErrorAlIngresarPeriodoNegativoTest() {
        almacen.minimoMesesVF(-1, 0, 0);
    }

}
