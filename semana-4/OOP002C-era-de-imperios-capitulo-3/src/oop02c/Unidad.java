package oop02c;

public class Unidad {

    public final static double SALUD_INICIAL = 100;
    private final static double DISTANCIA_ATAQUE = 2;
    private final static double ATAQUE_DAMAGE = 10;

    private Posicion posicion;
    private double salud;

    public static double getDISTANCIA_ATAQUE() {
        return DISTANCIA_ATAQUE;
    }

    public static double getATAQUE_DAMAGE() {
        return ATAQUE_DAMAGE;
    }

    public Unidad(Posicion posicion) {
        this.posicion = posicion;
        this.salud = SALUD_INICIAL;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public double distanciaCon(Unidad otraUnidad) {
        return this.posicion.distanciaCon(otraUnidad.getPosicion());
    }

    public boolean atacar(Unidad enemigo) {
        if (estaEnRangoDeAtaque(this.distanciaCon(enemigo), 0, Unidad.DISTANCIA_ATAQUE)) {
            enemigo.salud -= Unidad.ATAQUE_DAMAGE;
            return true;
        }
        return false;
    }

    protected boolean estaEnRangoDeAtaque(double distanciaActual, double min, double max) {
        return distanciaActual >= min && distanciaActual <= max;
    }
     // hacerun metodo para recibir danio
    // y atacar es abstracta
}
