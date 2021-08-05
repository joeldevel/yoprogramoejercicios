package biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import biblioteca.Libro;
import biblioteca.Genero;

public class LibroTest {
    
    Libro libro, libro1;
    @Before
    public void setUp() {
        libro = new Libro("JLB", 100,"Ficciones", 1939, Genero.FANTASIA);
        libro1 = new Libro("Cervantes", 1000, "El ingenioso hidalgo don Quijote de la Mancha", 1490,Genero.NOVELA);
    }
    
    @Test
    public void libroCreadoNoEsNull(){
        assertNotNull(libro);
    }
    
    @Test
    public void libroCreadoTieneDatosBien() {
        assertEquals("JLB", libro.getAutor());
        assertEquals(100, (int)libro.getPaginas());
        assertEquals("Ficciones", libro.getTitulo());
        assertEquals(1939, libro.getAnioPublicacion());
        assertEquals(Genero.FANTASIA, libro.getGenero());
    }
    
    @Test
    public void normalizaBienElTitulo() {
        String tituloNormalizado = "ingenioso hidalgo don Quijote de la Mancha, El";
        assertEquals(tituloNormalizado, libro1.normalizarTitulo());
        libro = new Libro("mister X",100,"El secreto",2000, Genero.FANTASIA);
        assertEquals("secreto, El", libro.normalizarTitulo());
    }

}
