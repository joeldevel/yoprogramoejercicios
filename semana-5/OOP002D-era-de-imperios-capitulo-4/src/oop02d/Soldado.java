package oop02d;

public class Soldado extends Unidad {

    public final static double DISTANCIA_ATAQUE = 1.5;
    public final static double ATAQUE_DAMAGE = 20;
    private final double DISTANCIA_MIN_ATAQUE = 0;

    public Soldado(Posicion posicion) {
        super(posicion);
    }

    @Override
    public boolean atacar(Unidad enemigo) {
        if (estaEnRangoDeAtaque(this.distanciaCon(enemigo), DISTANCIA_MIN_ATAQUE,
                Soldado.DISTANCIA_ATAQUE)) {
            enemigo.setSalud(enemigo.getSalud() - Soldado.ATAQUE_DAMAGE);
            return true;
        }
        return false;
    }
}
