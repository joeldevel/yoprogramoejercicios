package oop001e;

import java.util.Comparator;

public class ComparadorTransaccion implements Comparator<Transaccion>{

    @Override
    public int compare(Transaccion o1, Transaccion o2) {
        return o1.getFecha().compareTo(o2.getFecha());
    }
    
}
