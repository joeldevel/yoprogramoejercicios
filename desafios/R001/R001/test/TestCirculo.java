

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCirculo {
    
   Circulo circulo;
    Punto centro;

    @Before
    public void setUp() {
        centro = new Punto(0, 0);
        circulo = new Circulo(centro, 2);
    }

    @Test
    public void testGetCentro() {
        double expectedX = 0;
        double expectedY = 0;

        double actualX = circulo.getCentro().getX();
        double actualY = circulo.getCentro().getY();
        assertEquals(expectedX, actualX, 1);
        assertEquals(expectedY, actualY, 1);
    }

    @Test
    public void testGetRadio() {
        double expected = 2;
        double actual = circulo.getRadio();
        assertEquals(expected, actual, 1);
    }

    @Test
    public void testIntersectaConCirculoIgual() {
        Circulo circulo2 = new Circulo(new Punto(0, 0), 2);
        boolean expected = true;
        boolean actual = circulo.intersectaCon(circulo2);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntersectaConCirculoEnUnPunto() {
        Circulo circulo2 = new Circulo(new Punto(0, 4), 2);
        boolean expected = true;
        boolean actual = circulo.intersectaCon(circulo2);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntersectaConCirculoEnDosPuntos() {
        Circulo circulo2 = new Circulo(new Punto(0, 3), 2);
        boolean expected = true;
        boolean actual = circulo.intersectaCon(circulo2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoIntersectaConCirculoInterno() {
        Circulo circulo2 = new Circulo(new Punto(0, 0), 1);
        boolean expected = false;
        boolean actual = circulo.intersectaCon(circulo2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoIntersectaConCirculoExterno() {
        Circulo circulo2 = new Circulo(new Punto(4, 4), 1);
        boolean expected = false;
        boolean actual = circulo.intersectaCon(circulo2);
        assertEquals(expected, actual);
    }

}
