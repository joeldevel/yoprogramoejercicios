package biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import biblioteca.*;

public class BibliotecaTest {

    Biblioteca b;
    Libro libro, libro1, libro2, libro3;

    @Before
    public void setUp() {
        libro = new Libro("jorge luis", "borges", 100, "Ficciones", 1939, Genero.FANTASIA);
        libro1 = new Libro("miguel de", "Cervantes", 1000, "El ingenioso hidalgo don Quijote de la Mancha", 1490, Genero.NOVELA);
        libro2 = new Libro("Maru", "Botana", 250, "Todo dulce", 2005, Genero.COCINA);
        libro3 = new Libro("Elaine", "Dundy", 120, "Te quiero verde", 1968, Genero.NOVELA);
        b = new Biblioteca(10);
        b.agregarLibro(libro);
        b.agregarLibro(libro3);
        b.agregarLibro(libro1);
        b.agregarLibro(libro2);
    }
    
    @Test
    public void bibliotecaCreadaNoEsNull() {
        assertNotNull(b);
    }
    
    @Test
    public void bibliotecaContiene4LibrosAgregados() {
        assertEquals(4, b.getCantidadLibros());
    }
    
    

}
