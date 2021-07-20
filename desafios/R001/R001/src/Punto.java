public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    /**
     * Verifica si el Punto provisto tiene el centro y radio iguales o no
     *
     * @param otroPunto
     * @return true o false segun el caso
     */
    public boolean esIgualA(Punto otroPunto) {
        return this.x == otroPunto.getX() && this.y == otroPunto.getY();
    }

}
