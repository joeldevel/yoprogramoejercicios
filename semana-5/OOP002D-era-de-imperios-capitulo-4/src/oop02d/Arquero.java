package oop02d;

public class Arquero extends Unidad implements Atacable {

    public final static double DISTANCIA_MIN_ATAQUE = 5;
    public final static double DISTANCIA_MAX_ATAQUE = 25;
    public final static double ATAQUE_DAMAGE = 7;

    public Arquero(Posicion posicion) {
        super(posicion);
    }

    @Override
    public boolean atacar(Unidad enemigo) {
        if (estaEnRangoDeAtaque(this.distanciaCon(enemigo), Arquero.DISTANCIA_MIN_ATAQUE, Arquero.DISTANCIA_MAX_ATAQUE)) {
            enemigo.setSalud(enemigo.getSalud() - Arquero.ATAQUE_DAMAGE);
            return true;
        }
        return false;
    }

}
