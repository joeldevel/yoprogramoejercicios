package biblioteca;

import java.util.Arrays;

public class Biblioteca implements Cloneable{

    private Libro[] libros;
    private int cantidadLibros;
    private int[][] librosPorGenero = new int[Genero.values().length][2];

    public Libro getLibro(int indice) {
        return libros[indice];
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public Biblioteca(int tamanioBiblioteca) {
        libros = new Libro[tamanioBiblioteca];
        cantidadLibros = 0;
        Genero[] codigoGeneros = Genero.values();
        for (int i = 0; i < librosPorGenero.length; i++) {
            librosPorGenero[i][0] = codigoGeneros[i].ordinal();
        }        
    }

    public void agregarLibro(Libro libro) {
        if (cantidadLibros > this.libros.length - 1) {
            throw new Error("No hay mas espacio");
        }
        libros[this.cantidadLibros] = libro;
        this.cantidadLibros++;
        librosPorGenero[libro.getGenero().ordinal()][1]++;
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

    public void mostrarCantidadLibrosPorGenero() {
        for (int i = 0; i < librosPorGenero.length; i++) {
            if (librosPorGenero[i][1] == 0) {
                continue;
            }
            System.out.println(Genero.values()[i].name() + " " + librosPorGenero[i][1]);
        }
    }

    public int cantidadLibrosPorGenero(Genero g) {
        return librosPorGenero[g.ordinal()][1];
    }

    public void ordenar() {
        Arrays.sort(libros);
    }

    public void ordenarPorApellido() {
        // pasarle hasta donde compara, s
        Arrays.sort(libros, 0, this.cantidadLibros, new ComparadorPorApellido());
    }

    public void ordenarPorTitulo() {
        Arrays.sort(libros, 0, this.cantidadLibros, new ComparadorPorTitulo());
    }

    public void ordenarPorTituloNormalizado() {
        Arrays.sort(libros, 0, this.cantidadLibros, new ComparadorPorTituloNormalizado());
    }

    public void ordenarPorAnioPublicacion() {
        Arrays.sort(libros, 0, this.cantidadLibros, new ComparadorPorAnioPublicacion());
    }

    public void ordenarPorPaginas() {
        Arrays.sort(libros, 0, this.cantidadLibros, new ComparadorPorPaginas());
    }
    
    public Biblioteca clone() throws CloneNotSupportedException {
        Biblioteca clon = (Biblioteca) super.clone();
        clon.libros = new Libro[libros.length];
        for(int i=0; i< libros.length; i++) {
            clon.libros[i]= libros[i].clone();
        }
        
        return clon;
    }
}
