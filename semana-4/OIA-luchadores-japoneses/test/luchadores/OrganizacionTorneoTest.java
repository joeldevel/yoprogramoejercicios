package luchadores;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrganizacionTorneoTest {

    OrganizacionTorneo preTorneo;

    @Before
    public void setUp() {
        preTorneo = new OrganizacionTorneo();
    }

    @Test
    public void torneoCreadoNoEsNull() {
        assertNotNull(preTorneo);
    }

    @Test
    public void generaSalidaCorrectaCon10Luchadores() {
        LuchadorSumo[] luchadores = {
            new LuchadorSumo(300, 1500),
            new LuchadorSumo(320, 1500),
            new LuchadorSumo(299, 1580),
            new LuchadorSumo(330, 1690),
            new LuchadorSumo(330, 1540),
            new LuchadorSumo(339, 1500),
            new LuchadorSumo(298, 1700),
            new LuchadorSumo(344, 1570),
            new LuchadorSumo(276, 1678),
            new LuchadorSumo(289, 1499)
        };
        preTorneo.cargarLuchadores(luchadores);

        int[] arrayDominancia = preTorneo.generarDominancia();
        int[] resultadosEsperados = {1, 2, 1, 6, 3, 3, 2, 5, 0, 0};
        for (int i = 0; i < arrayDominancia.length; i++) {
            assertEquals(arrayDominancia[i], resultadosEsperados[i]);
        }
    }

}
