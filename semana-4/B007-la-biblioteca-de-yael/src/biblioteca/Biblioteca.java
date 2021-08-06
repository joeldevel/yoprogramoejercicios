package biblioteca;

import java.util.Arrays;

public class Biblioteca {

    private Libro[] libros;
    private int cantidadLibros;
    
    public Libro getLibro(int indice) {
        return libros[indice];
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public Biblioteca(int tamanioBiblioteca) {
        libros = new Libro[tamanioBiblioteca];
        cantidadLibros = 0;
    }

    public void agregarLibro(Libro libro) {
        if (cantidadLibros > this.libros.length - 1) {
            throw new Error("No hay mas espacio");
        }
        libros[this.cantidadLibros] = libro;
        this.cantidadLibros++;
    }

    public boolean libroRepetido(Libro libro) {
        int indice = 0;
        boolean libroRepetido = false;
        while (indice < this.cantidadLibros && !libroRepetido) {
            libroRepetido = libros[indice].equals(libro);
            indice++;
        }
        return libroRepetido;
    }

    public void ordenar() {
        Arrays.sort(libros);
    }
    public void ordenarPorApellido() {
        Arrays.sort(libros, new ComparadorPorApellido());
    }

}
