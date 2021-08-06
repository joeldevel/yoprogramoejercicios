package biblioteca;

public class Libro implements Cloneable {

    private String nombresAutor;
    private int paginas;
    private String titulo;
    private int anioPublicacion;
    private Genero genero;
    private static final int CARACTERES_MAXIMO = 200;
    private String apellidoAutor;

    public Libro(String nombresAutor, String apellidoAutor, int paginas, String titulo, int anioPublicacion, Genero genero) {
        this.nombresAutor = nombresAutor;
        this.apellidoAutor = apellidoAutor;
        this.paginas = paginas;
        this.titulo = titulo;
        this.anioPublicacion = (anioPublicacion);
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombresAutor == null) ? 0 : nombresAutor.hashCode());
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
        if (nombresAutor == null) {
            if (other.nombresAutor != null) {
                return false;
            }
        } else if (!nombresAutor.equals(other.nombresAutor)) {
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

    public String getNombresAutor() {
        return this.nombresAutor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
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

    public String formatoAPA() {
        String[] nombres = this.getNombresAutor().split(" ");
//        Becquer, G. A. (2018). Rimas
        byte cN = (byte) nombres.length;
//        str.substring(0, 1).toUpperCase() + str.substring(1);
        String salida = this.apellidoAutor.substring(0, 1).toUpperCase() + this.apellidoAutor.substring(1).concat(", ");
        for (byte i = 0; i < cN; i++) {
            salida = salida.concat(nombres[i].substring(0, 1).toUpperCase() + ". ");
        }
        salida = salida.concat("(" + this.anioPublicacion + "). " + this.titulo);
        return salida;
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
