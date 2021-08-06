package biblioteca;

import java.util.Comparator;


public class ComparadorPorTituloNormalizado implements Comparator<Libro>{

    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.normalizarTitulo().compareTo(o2.normalizarTitulo());
    }
    
}
