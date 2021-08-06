package biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import biblioteca.*;

public class BibliotecaTest {

    Biblioteca b, b2;
    Libro libro, libro1, libro2, libro3, libro4, libro5;

    @Before
    public void setUp() {
        libro = new Libro("jorge luis", "Borges", 100, "Ficciones", 1939, Genero.FANTASIA);
        libro1 = new Libro("miguel de", "Cervantes", 1000, "El ingenioso hidalgo don Quijote de la Mancha", 1490, Genero.NOVELA);
        libro2 = new Libro("Maru", "Botana", 250, "Todo dulce", 2005, Genero.COCINA);
        libro3 = new Libro("Elaine", "Dundy", 120, "Te quiero verde", 1968, Genero.NOVELA);
        libro4 = new Libro("Johannes", "Burdunga", 900, "Los Ardientes pampanos", 2019, Genero.TERROR);
        b = new Biblioteca(4);
        b2 = new Biblioteca(5);
        
        b.agregarLibro(libro3);
        b.agregarLibro(libro1);
        b.agregarLibro(libro2);
        b.agregarLibro(libro);
        
        b2.agregarLibro(libro);
        b2.agregarLibro(libro1);
        b2.agregarLibro(libro2);
        b2.agregarLibro(libro3);
        b2.agregarLibro(libro4);
        
    }

    @Test
    public void bibliotecaCreadaNoEsNullTest() {
        assertNotNull(b);
    }

    @Test
    public void bibliotecaContiene4LibrosAgregadosTest() {
        assertEquals(4, b.getCantidadLibros());
    }

    @Test
    public void ordenaPorAutorTest() {
        b.ordenarPorApellido();

        assertEquals("Borges", b.getLibro(0).getApellidoAutor());
        assertEquals("Botana", b.getLibro(1).getApellidoAutor());
        assertEquals("Cervantes", b.getLibro(2).getApellidoAutor());
        assertEquals("Dundy", b.getLibro(3).getApellidoAutor());
    }

    @Test
    public void ordenaPorTituloTest() {
        b.ordenarPorTitulo();
        // c Bor dun bot
        assertEquals("Cervantes", b.getLibro(0).getApellidoAutor());
        assertEquals("Borges", b.getLibro(1).getApellidoAutor());
        assertEquals("Dundy", b.getLibro(2).getApellidoAutor());
        assertEquals("Botana", b.getLibro(3).getApellidoAutor());
    }

    @Test
    public void ordenaPorTituloNormalizadoTest() {
        b2.ordenarPorTituloNormalizado();
        // burdunda bor cer dun bot
        assertEquals("Burdunga", b2.getLibro(0).getApellidoAutor());
        assertEquals("Borges", b2.getLibro(1).getApellidoAutor());
        assertEquals("Dundy", b2.getLibro(2).getApellidoAutor());
        assertEquals("Botana", b2.getLibro(3).getApellidoAutor());
        assertEquals("Cervantes", b2.getLibro(4).getApellidoAutor());
    }

    @Test
    public void ordenaPorAnioPublicacionTest() {
        b.ordenarPorAnioPublicacion();
        // c Bor dun bot
        assertEquals("Cervantes", b.getLibro(0).getApellidoAutor());
        assertEquals("Borges", b.getLibro(1).getApellidoAutor());
        assertEquals("Dundy", b.getLibro(2).getApellidoAutor());
        assertEquals("Botana", b.getLibro(3).getApellidoAutor());
    }

    @Test
    public void ordenaPorCantidadPaginasTest() {
        b.ordenarPorPaginas();
        // c Bot dun bor
        assertEquals("Cervantes", b.getLibro(0).getApellidoAutor());
        assertEquals("Botana", b.getLibro(1).getApellidoAutor());
        assertEquals("Dundy", b.getLibro(2).getApellidoAutor());
        assertEquals("Borges", b.getLibro(3).getApellidoAutor());
    }
    
   @Test
   public void cantidadDeLibrosPorGeneroTest() {
       b2.mostrarCantidadLibrosPorGenero();
   }
   
   @Test
   public void cantidadLibrosPorGeneroIndividual() {
       assertEquals(2, b2.cantidadLibrosPorGenero(Genero.NOVELA));
       assertEquals(1, b2.cantidadLibrosPorGenero(Genero.FANTASIA));
       assertEquals(1, b2.cantidadLibrosPorGenero(Genero.TERROR));
       assertEquals(1, b2.cantidadLibrosPorGenero(Genero.COCINA));
       assertEquals(0, b2.cantidadLibrosPorGenero(Genero.INFANTIL));
   }

}
