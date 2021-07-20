public class Circulo {

    private double radio;
    private Punto centro;

    /**
     * Crea un Circulo con el centro y radio provistos
     *
     * @param centro objeto de tipo Punto
     * @param radio double
     */
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public Punto getCentro() {
        return this.centro;
    }

    /**
     * Calcula si se intersecta con el objeto Circulo c2 provisto
     *
     * @param c2 objeto de tipo Circulo
     * @return true o false segun sea el caso
     */
    public boolean intersectaCon(Circulo c2) {
        // son el mismo circulo, infinitos puntos
        if (this.centro.esIgualA(c2.getCentro()) && this.radio == c2.getRadio()) {
//            System.out.println("son iguales");
            return true;
        }

        if (this.distanciaA(c2) <= this.radio + c2.getRadio()) {
            if (this.distanciaA(c2) > (this.radio + c2.getRadio())
                    || (this.distanciaA(c2) < Math.abs(this.getRadio() - c2.getRadio()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Devuelve la distancia entre el centro y el centro de c2
     *
     * @param c2 un objeto de tipo Circulo
     * @return double con la distancia entre los centros
     */
    private double distanciaA(Circulo c2) {

        double distancia = Math.sqrt(
                Math.pow(c2.getCentro().getX() - this.getCentro().getX(), 2)
                + Math.pow(c2.getCentro().getY() - this.getCentro().getY(), 2));
//        System.out.println("distancia= " + distancia);
        return distancia;
    }
}
