package oop02c;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnidadTest {

    Unidad unidad1, unidad2, unidad3;

    @Before
    public void setUp() {
        unidad1 = new Unidad(new Posicion(0, 0));
        unidad2 = new Unidad(new Posicion(1, 1));
        unidad3 = new Unidad(new Posicion(2, 2));
    }

    @Test
    public void distanciaEntreUnidadesOK() {
        assertEquals(Math.sqrt(2), unidad1.distanciaCon(unidad2), 0);
    }

    @Test
    public void unidadCreadaTiene100DeSalud() {
        assertEquals(100, unidad1.getSalud(), 0);
    }

    @Test
    public void puedeAtacarYDebilitarAlEnemigoSiSeEncuentraCerca() {
        assertTrue(unidad1.atacar(unidad2));
        assertEquals(Unidad.SALUD_INICIAL - Unidad.getATAQUE_DAMAGE(), unidad2.getSalud(), 0);
        assertTrue(unidad1.distanciaCon(unidad2) <= Unidad.getDISTANCIA_ATAQUE());
    }

    @Test
    public void noPuedeAtacarAUnEnemigoQueSeEncuentraFueraDeAlcance() {
        assertFalse(unidad1.atacar(unidad3));
        assertEquals(Unidad.SALUD_INICIAL, unidad3.getSalud(), 0);
        assertFalse(unidad1.distanciaCon(unidad3) <= Unidad.getDISTANCIA_ATAQUE());
    }

}
