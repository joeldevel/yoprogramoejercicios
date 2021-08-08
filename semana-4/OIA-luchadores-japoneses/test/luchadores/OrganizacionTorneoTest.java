package luchadores;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class OrganizacionTorneoTest {
    
    OrganizacionTorneo pre;
    @Before
    public void setUp() {
        pre = new OrganizacionTorneo();
    }
    
    @Test
    public void torneoCreadoNoEsNull() {
        assertNotNull(pre);
    }


}
