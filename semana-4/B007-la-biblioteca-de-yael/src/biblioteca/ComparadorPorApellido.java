package biblioteca;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Libro>{

    @Override
    public int compare(Libro o1, Libro o2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return o1.getApellidoAutor().compareTo(o2.getApellidoAutor());
    }
    
}
