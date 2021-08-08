package luchadores;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LuchadorSumoTest {

    LuchadorSumo l1, l2, l3, l4;

    @Before
    public void setUp() {
        l1 = new LuchadorSumo(100, 180);
        l2 = new LuchadorSumo(90, 180);
        l3 = new LuchadorSumo(100, 170);
        l4 = new LuchadorSumo(90, 170);

    }

    @Test
    public void dominaPorPesoTest() {
        assertTrue(l1.dominaA(l2));
        assertTrue(l1.dominaA(l4));
    }

    @Test
    public void dominaPorAlturaTest() {
        assertTrue(l1.dominaA(l3));
        assertTrue(l1.dominaA(l4));
        assertTrue(l2.dominaA(l4));
    }
    
    @Test
    public void dominaPorAlturaYPesoTest() {
        assertTrue(l1.dominaA(l4));
    }

}
