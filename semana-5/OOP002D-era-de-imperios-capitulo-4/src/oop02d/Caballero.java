package oop02d;

public class Caballero extends Unidad {

    public final static double DISTANCIA_MIN_ATAQUE = 1;
    public final static double DISTANCIA_MAX_ATAQUE = 3;
    public final static double ATAQUE_DAMAGE = 30;

    public Caballero(Posicion posicion) {
        super(posicion);
    }

    @Override
    public boolean atacar(Unidad enemigo) {
        if (estaEnRangoDeAtaque(this.distanciaCon(enemigo), Caballero.DISTANCIA_MIN_ATAQUE, Caballero.DISTANCIA_MAX_ATAQUE)) {
            enemigo.setSalud(enemigo.getSalud() - Caballero.ATAQUE_DAMAGE);
            return true;
        }
        return false;
    }

}
