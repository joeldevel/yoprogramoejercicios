package biblioteca;

public class Libro implements Cloneable {

    private String nombreAutor;
    private int paginas;
    private String titulo;
    private int anioPublicacion;
    private Genero genero;
    private static final int CARACTERES_MAXIMO = 200;
    private String apellidoAutor;

    public Libro(String nombreAutor, String apellidoAutor, int paginas, String titulo, int anioPublicacion, Genero genero) {
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.paginas = paginas;
        this.titulo = titulo;
        this.anioPublicacion = (anioPublicacion);
        this.genero = genero;
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Jose", "bolainas", 100, "Novelas", 1458, Genero.FANTASIA);
        Libro libro1 = new Libro("Jose", "pirinicho", 10, "Novelas", 1658, Genero.TERROR);
        System.out.println(libro.equals(libro1));
        System.out.println(libro.hashCode());
        System.out.println(libro1.hashCode());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreAutor == null) ? 0 : nombreAutor.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Libro other = (Libro) obj;
        if (nombreAutor == null) {
            if (other.nombreAutor != null) {
                return false;
            }
        } else if (!nombreAutor.equals(other.nombreAutor)) {
            return false;
        }
        if (titulo == null) {
            if (other.titulo != null) {
                return false;
            }
        } else if (!titulo.equals(other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public Libro clone() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }

    public Integer getPaginas() {
        return this.paginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getNombreAutor() {
        return this.nombreAutor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public String normalizarTitulo() {
        String[] palabrasEnTitulo = this.getTitulo().split(" ");

        if (!this.comienzaConArticulo(palabrasEnTitulo[0])) {
            return this.getTitulo();
        }
        String tituloNormalizado = "";
        for (int i = 1; i < palabrasEnTitulo.length; i++) {
            tituloNormalizado = tituloNormalizado.concat(palabrasEnTitulo[i] + " ");
        }
        tituloNormalizado = tituloNormalizado.trim().concat(", " + palabrasEnTitulo[0]);
        return tituloNormalizado;
    }

    public String recortarTitulo() {
        if (this.titulo.length() >= CARACTERES_MAXIMO) {
            return this.titulo.substring(0, CARACTERES_MAXIMO);
        }
        return this.titulo;
    }

    private boolean comienzaConArticulo(String pIni) {
        return pIni.equalsIgnoreCase("la") || pIni.equalsIgnoreCase("las")
                || pIni.equalsIgnoreCase("lo") || pIni.equalsIgnoreCase("el")
                || pIni.equalsIgnoreCase("los") || pIni.equalsIgnoreCase("un")
                || pIni.equalsIgnoreCase("una") || pIni.equalsIgnoreCase("unos")
                || pIni.equalsIgnoreCase("unas");
    }

}
