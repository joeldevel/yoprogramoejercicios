package biblioteca;

import java.util.Comparator;

public class ComparadorPorPaginas implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getPaginas().compareTo(o2.getPaginas())*-1;
	}
}
