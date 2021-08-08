package oop02c;

public class Soldado extends Unidad {

    public Soldado(Posicion posicion) {
        super(posicion);
    }

    @Override
    public boolean atacar(Unidad enemigo) {
        if (estaEnRangoDeAtaque(this.distanciaCon(enemigo), 1.5)) {
            enemigo.setSalud(enemigo.getSalud() - 20);
            return true;
        }
        return false;
    }
}
