package biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import biblioteca.*;

public class LibroTest {

    Libro libro, libro1, libro2, libro3;

    @Before
    public void setUp() {
        libro = new Libro("jorge luis", "borges", 100, "Ficciones", 1939, Genero.FANTASIA);
        libro1 = new Libro("miguel de", "Cervantes", 1000, "El ingenioso hidalgo don Quijote de la Mancha", 1490, Genero.NOVELA);
        libro2 = new Libro("Maru", "Botana", 250, "Todo dulce", 2005, Genero.COCINA);
        libro3 = new Libro("Elaine", "Dundy", 120, "Te quiero verde", 1968, Genero.NOVELA);
    }

    @Test
    public void libroCreadoNoEsNullTest() {
        assertNotNull(libro);
    }

    @Test
    public void libroCreadoTieneDatosBienTest() {
        assertEquals("jorge luis", libro.getNombresAutor());
        assertEquals(100, (int) libro.getPaginas());
        assertEquals("Ficciones", libro.getTitulo());
        assertEquals(1939, libro.getAnioPublicacion());
        assertEquals(Genero.FANTASIA, libro.getGenero());
    }

    @Test
    public void normalizaBienElTituloTest() {
        String tituloNormalizado = "ingenioso hidalgo don Quijote de la Mancha, El";
        assertEquals(tituloNormalizado, libro1.normalizarTitulo());
        libro = new Libro("mister", "X", 100, "El secreto", 2000, Genero.FANTASIA);
        assertEquals("secreto, El", libro.normalizarTitulo());
        libro = new Libro("Johannes", "Burdunga", 900, "Los Ardientes pampanos", 2019, Genero.TERROR);
        assertEquals("Ardientes pampanos, Los", libro.normalizarTitulo());
    }

    @Test
    public void formateaAPATest() {
        String libroEnAPA = "Borges, J. L. (1939). Ficciones";
        assertEquals(libroEnAPA, libro.formatoAPA());
    }

}
